package es.codeurjc.mastercloudapps.ws.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.codeurjc.mastercloudapps.ws.model.Report;

public interface ReportRepository extends JpaRepository<Report, Long> {

}