package com.ctepl.anand.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ctepl.anand.model.Survey;
import com.ctepl.anand.service.SurveyService;

@RestController
public class SurveyController {

    @Autowired
    SurveyService surveyService;

    // Get survey by id
    @GetMapping("/survey/{id}")
    public Survey findById(@PathVariable long id) {
        return surveyService.findById(id);
    }

    // Get survey by title
    @GetMapping("/survey/title")
    public Survey findByTitle(@RequestParam String title) {
        return surveyService.findByTitle(title);
    }

    // Get survey by Domain
    @GetMapping("/survey/domain")
    public Survey findByDomain(@RequestParam String domain) {
        return surveyService.findByDomain(domain);
    }

    // Get survey by Status
    @GetMapping("/survey/status")
    public Survey findByStatus(@RequestParam String status) {
        return surveyService.findByStatus(status);
    }

    // Get survey by Survey State
    @GetMapping("/survey/state")
    public Survey findBySurveyState(@RequestParam String surveyState) {
        return surveyService.findBySurveyState(surveyState);
    }

    // Get survey by Page Name or Location
    @GetMapping("/survey/page-name-or-location")
    public Survey findByPageNameOrLocation(@RequestParam String pageNameOrLocation) {
        return surveyService.findByPageNameOrLocation(pageNameOrLocation);
    }

    // Get survey by Start and End dates
    @GetMapping("/survey/start-date-or-end-date")
    public Survey findByStartDateAndEndDate(@RequestParam String startDate, @RequestParam String endDate) {
        return surveyService.findByStartDateAndEndDate(startDate, endDate);
    }

    // Get survey by Target Users
    @GetMapping("/survey/target-users")
    public Survey findByTargetUsers(@RequestParam String targetUsers) {
        return surveyService.findByTargetUsers(targetUsers);
    }

    // Get survey by Specialty
    @GetMapping("/survey/specialty")
    public Survey findBySpecialty(@RequestParam String specialty) {
        return surveyService.findBySpecialty(specialty);
    }

    // Get survey by Preferences
    @GetMapping("/survey/preferences")
    public Survey findByPreferences(@RequestParam String preferences) {
        return surveyService.findByPreferences(preferences);
    }

    // Get survey by Country
    @GetMapping("/survey/country")
    public Survey findByCountry(@RequestParam String country) {
        return surveyService.findByCountry(country);
    }

    // Get survey by Region and City combination
    @GetMapping("/survey/region-and-city")
    public Survey findByRegionAndCity(@RequestParam String region, @RequestParam String city) {
        return surveyService.findByRegionAndCity(region, city);
    }

    // Get survey by manually selecting specific users
    @GetMapping("/survey/selected-users")
    public Survey findBySelectedUsers(@RequestParam String[] users) {
        return surveyService.findBySelectedUsers(users);
    }

    // Get survey by Answer Type
    @GetMapping("/survey/answer-type")
    public Survey findByAnswerType(@RequestParam String answerType) {
        return surveyService.findByAnswerType(answerType);
    }

    // Get survey by Rating range
    @GetMapping("/survey/rating")
    public Survey findByRating(@RequestParam int start, @RequestParam int end