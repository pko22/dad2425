package es.codeurjc.mastercloudapps.ws;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reportData;
    private int progress;

    public Report(){
    }

    public Long getId() {
        return id;
    }

    public int getProgress() {
        return progress;
    }

    public String getReportData() {
        return reportData;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public void setReportData(String reportData) {
        this.reportData = reportData;
    }
}
