package com.ctepl.anand.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ctepl.anand.model.AdminSurvey;
import com.ctepl.anand.service.AdminSurveyService;

@RestController
public class AdminSurveyController {
    
    @Autowired
    private AdminSurveyService adminSurveyService;

    @GetMapping("/adminSurvey/byDomain")
    public AdminSurvey findByDomain(@RequestParam String domain) {
        return adminSurveyService.findByDomain(domain);
    }

    @GetMapping("/adminSurvey/byTitleAndDescription")
    public AdminSurvey findByTitleAndDescription(@RequestParam String title, @RequestParam String description) {
        return adminSurveyService.findByTitleAndDescription(title, description);
    }

    @GetMapping("/adminSurvey/byDelayTimeInSeconds")
    public AdminSurvey findByDelayTimeInSeconds(@RequestParam int delayTimeInSeconds) {
        return adminSurveyService.findByDelayTimeInSeconds(delayTimeInSeconds);
    }

    @GetMapping("/adminSurvey/byStatus")
    public AdminSurvey findByStatus(@RequestParam String status) {
        return adminSurveyService.findByStatus(status);
    }

    @GetMapping("/adminSurvey/bySurveyState")
    public AdminSurvey findBySurveyState(@RequestParam String surveyState) {
        return adminSurveyService.findBySurveyState(surveyState);
    }

    @GetMapping("/adminSurvey/byPageNameOrLocation")
    public AdminSurvey findByPageNameOrLocation(@RequestParam String pageNameOrLocation) {
        return adminSurveyService.findByPageNameOrLocation(pageNameOrLocation);
    }

    @GetMapping("/adminSurvey/byStartDateAndEndDate")
    public AdminSurvey findByStartDateAndEndDate(@RequestParam String startDate, @RequestParam String endDate) {
        return adminSurveyService.findByStartDateAndEndDate(startDate, endDate);
    }

    @GetMapping("/adminSurvey/byTargetUsers")
    public AdminSurvey findByTargetUsers(@RequestParam String targetUsers) {
        return adminSurveyService.findByTargetUsers(targetUsers);
    }

    @GetMapping("/adminSurvey/byCriteria")
    public AdminSurvey findByCriteria(@RequestParam String criteria) {
        return adminSurveyService.findByCriteria(criteria);
    }

    @GetMapping("/adminSurvey/bySpecialty")
    public AdminSurvey findBySpecialty(@RequestParam String specialty) {
        return adminSurveyService.findBySpecialty(specialty);
    }

    @GetMapping("/adminSurvey/byPreferences")
    public AdminSurvey findByPreferences(@RequestParam String preferences) {
        return adminSurveyService.findByPreferences(preferences);
    }

    @GetMapping("/adminSurvey/byCountry")
    public AdminSurvey findByCountry(@RequestParam String country) {
        return adminSurveyService.findByCountry(country);
    }

    @GetMapping("/adminSurvey/byRegionAndCityCombination")
    public AdminSurvey findByRegionAndCityCombination(@RequestParam String region, @RequestParam String city) {
        return adminSurveyService.findByRegionAndCityCombination(region, city);
    }

    @GetMapping("/adminSurvey/bySpecificUsersList")
    public AdminSurvey findBySpecificUsersList(@RequestParam String specificUsersList) {
        return adminSurveyService.findBySpecificUsersList(specificUsersList);
    }

    @GetMapping("/adminSurvey/byTitleAndAnswerType")
    public AdminSurvey findByTitleAndAnswerType(@RequestParam String title, @RequestParam String