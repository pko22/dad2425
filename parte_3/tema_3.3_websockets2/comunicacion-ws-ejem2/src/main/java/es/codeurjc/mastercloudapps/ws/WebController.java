package es.codeurjc.mastercloudapps.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @Autowired
    ReportService reportService;

    @PostMapping("/create-report")
    public String postMethodName(@RequestParam String reportCreationData) {

        Report report = reportService.createReport(reportCreationData);

        return "redirect:report-creation-progress?reportId="+report.getId();
    }

    @GetMapping("/report-creation-progress")
    public String postMethodName(Model model, @RequestParam String reportId) {

        model.addAttribute("reportId", reportId);

        return "report-creation-progress";
    }

}
