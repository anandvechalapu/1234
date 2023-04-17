package com.ctepl.anand.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Help {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String dataEntry;
    private String drillDown;
    private String performance;
    private String regionalData;
    private String trendPage;
    private String viewingData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataEntry() {
        return dataEntry;
    }

    public void setDataEntry(String dataEntry) {
        this.dataEntry = dataEntry;
    }

    public String getDrillDown() {
        return drillDown;
    }

    public void setDrillDown(String drillDown) {
        this.drillDown = drillDown;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public String getRegionalData() {
        return regionalData;
    }

    public void setRegionalData(String regionalData) {
        this.regionalData = regionalData;
    }

    public String getTrendPage() {
        return trendPage;
    }

    public void setTrendPage(String trendPage) {
        this.trendPage = trendPage;
    }

    public String getViewingData() {
        return viewingData;
    }

    public void setViewingData(String viewingData) {
        this.viewingData = viewingData;
    }
}