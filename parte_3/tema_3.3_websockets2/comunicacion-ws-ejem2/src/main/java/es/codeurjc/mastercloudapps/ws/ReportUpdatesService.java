package es.codeurjc.mastercloudapps.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This service is used to save on database the updates on reports
 *
 * To notify users, NotificationService will be used
 */
@Service
public class ReportUpdatesService {

    Logger logger = LoggerFactory.getLogger(ReportUpdatesService.class);

    @Autowired
    private ReportRepository reportRepository;

    @Autowired
    private NotificationService notificationService;

    public void reportUpdated(Long reportId, int progress, String reportData) {

        Report report = reportRepository.findById(reportId).orElseThrow();

        report.setProgress(progress);
        report.setReportData(reportData);

        reportRepository.save(report);

        notificationService.notifyReportUpdate(report);
    }
}