package es.codeurjc.mastercloudapps.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * This service simulate the report creation
 *
 * To simulate a long computational time, Thread.sleep(...) is used.
 *
 * When a report is updated, reportUpdatesService is used to save the update on database and to notify users
 */
@Service
public class ReportGenerator {

    Logger logger = LoggerFactory.getLogger(ReportGenerator.class);

    @Autowired
    private ReportUpdatesService reportUpdatesService;

    @Async
    protected void createReport(Long reportId, String reportCreationData) {

        logger.info("createReport: "+reportId);

        simulateProcessTime();
        reportUpdatesService.reportUpdated(reportId, 25, "A");

        simulateProcessTime();
        reportUpdatesService.reportUpdated(reportId, 50, "AB");

        simulateProcessTime();
        reportUpdatesService.reportUpdated(reportId, 75, "ABC");

        simulateProcessTime();
        reportUpdatesService.reportUpdated(reportId, 100, "ABC_"+reportCreationData);

    }

    private void simulateProcessTime() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
