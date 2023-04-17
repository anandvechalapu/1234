package com.ctepl.anand.controller;

import com.ctepl.anand.model.Help;
import com.ctepl.anand.service.HelpService;
import com.ctepl.anand.service.LogoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/help")
public class HelpController {

    @Autowired
    private HelpService helpService;

    @Autowired
    private LogoutService logoutService;

    @GetMapping("/dataentry")
    public Help getDataEntryHelp(){
        return helpService.getDataEntryHelp();
    }

    @GetMapping("/drilldown")
    public Help getDrillDownHelp(){
        return helpService.getDrillDownHelp();
    }

    @GetMapping("/performance")
    public Help getPerformanceHelp(){
        return helpService.getPerformanceHelp();
    }

    @GetMapping("/regionaldata")
    public Help getRegionalDataHelp(){
        return helpService.getRegionalDataHelp();
    }

    @GetMapping("/trendpage")
    public Help getTrendPageHelp(){
        return helpService.getTrendPageHelp();
    }

    @GetMapping("/viewingdata")
    public Help getViewingDataHelp(){
        return helpService.getViewingDataHelp();
    }

    @PostMapping("/logout")
    public void logoutUser(){
        logoutService.logoutUser();
    }

    @PostMapping("/redirect")
    public void redirectToLoginScreen(){
        logoutService.redirectToLoginScreen();
    }

    @PostMapping("/functionalities")
    public void clickFunctionalitiesOnPage(){
        logoutService.clickFunctionalitiesOnPage();
    }
}