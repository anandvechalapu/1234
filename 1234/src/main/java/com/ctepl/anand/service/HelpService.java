package com.ctepl.anand.service;

import com.ctepl.anand.repository.HelpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelpService {
    @Autowired
    private HelpRepository helpRepository;

    public Help getDataEntryHelp(){
        return helpRepository.findByDataEntry("Data Entry");
    }

    public Help getDrillDownHelp(){
        return helpRepository.findByDrillDown("Drill Down");
    }

    public Help getPerformanceHelp(){
        return helpRepository.findByPerformance("Performance");
    }

    public Help getRegionalDataHelp(){
        return helpRepository.findByRegionalData("Regional Data");
    }

    public Help getTrendPageHelp(){
        return helpRepository.findByTrendPage("Trend Page");
    }

    public Help getViewingDataHelp(){
        return helpRepository.findByViewingData("Viewing Data");
    }
}