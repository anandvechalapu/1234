package com.ctepl.anand.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.ctepl.anand.entity.AdminSurvey;
import com.ctepl.anand.entity.Question;
import com.ctepl.anand.entity.User;
import com.ctepl.anand.service.AdminSurveyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin-survey")
public class AdminSurveyController {

    @Autowired
    private AdminSurveyService adminSurveyService;

    @GetMapping("/by-domain")
    public Optional<AdminSurvey> findByDomain(String domain) {
        return adminSurveyService.findByDomain(domain);
    }

    @GetMapping("/by-status")
    public Optional<AdminSurvey> findByStatus(String status) {
        return adminSurveyService.findByStatus(status);
    }

    @GetMapping("/by-state")
    public Optional<AdminSurvey> findBySurveyState(String surveyState) {
        return adminSurveyService.findBySurveyState(surveyState);
    }

    @GetMapping("/by-page-name-or-location")
    public Optional<AdminSurvey> findByPageNameOrLocation(String pageNameOrLocation) {
        return adminSurveyService.findByPageNameOrLocation(pageNameOrLocation);
    }

    @GetMapping("/by-target-users")
    public Optional<AdminSurvey> findByTargetUsers(String targetUsers) {
        return adminSurveyService.findByTargetUsers(targetUsers);
    }

    @GetMapping("/by-specialty")
    public Optional<AdminSurvey> findBySpecialty(String specialty) {
        return adminSurveyService.findBySpecialty(specialty);
    }

    @GetMapping("/by-preferences")
    public Optional<AdminSurvey> findByPreferences(String preferences) {
        return adminSurveyService.findByPreferences(preferences);
    }

    @GetMapping("/by-country")
    public Optional<AdminSurvey> findByCountry(String country) {
        return adminSurveyService.findByCountry(country);
    }

    @GetMapping("/by-region-and-city")
    public Optional<AdminSurvey> findByRegionAndCity(
        @RequestParam("region") String region, 
        @RequestParam("city") String city
    ) {
        return adminSurveyService.findByRegionAndCity(region, city);
    }

    @GetMapping("/by-specific-users")
    public Optional<AdminSurvey> findBySpecificUsers(List<User> specificUsers) {
        return adminSurveyService.findBySpecificUsers(specificUsers);
    }

    @GetMapping("/by-questions-title-and-answer-type")
    public Optional<AdminSurvey> findByQuestionsTitleAndAnswerType(
        @RequestParam("title") String title, 
        @RequestParam("answerType") String answerType
    ) {
        return adminSurveyService.findByQuestionsTitleAndAnswerType(title, answerType);
    }

    @GetMapping("/by-rating-range")
    public Optional<AdminSurvey> findByRatingRange(
        @RequestParam("start") int start, 
        @RequestParam("end") int end
    ) {
        return adminSurveyService.findByRatingRange(start, end);
    }

    @GetMapping("/by-start-date-and-end-date")
    public Optional<AdminSurvey> findByStartDateAndEndDate(
        @RequestParam("startDate