package com.ctepl.anand.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctepl.anand.model.Survey;
import com.ctepl.anand.repository.SurveyRepository;

@Service
public class SurveyService {

    @Autowired
    SurveyRepository surveyRepository;

    // Get survey by id
    public Survey findById(long id) {
        return surveyRepository.findById(id);
    }

    // Get survey by title
    public Survey findByTitle(String title) {
        return surveyRepository.findByTitle(title);
    }

    // Get survey by Domain
    public Survey findByDomain(String domain) {
        return surveyRepository.findByDomain(domain);
    }

    // Get survey by Status
    public Survey findByStatus(String status) {
        return surveyRepository.findByStatus(status);
    }

    // Get survey by Survey State
    public Survey findBySurveyState(String surveyState) {
        return surveyRepository.findBySurveyState(surveyState);
    }

    // Get survey by Page Name or Location
    public Survey findByPageNameOrLocation(String pageNameOrLocation) {
        return surveyRepository.findByPageNameOrLocation(pageNameOrLocation);
    }

    // Get survey by Start and End dates
    public Survey findByStartDateAndEndDate(String startDate, String endDate) {
        return surveyRepository.findByStartDateAndEndDate(startDate, endDate);
    }

    // Get survey by Target Users
    public Survey findByTargetUsers(String targetUsers) {
        return surveyRepository.findByTargetUsers(targetUsers);
    }

    // Get survey by Specialty
    public Survey findBySpecialty(String specialty) {
        return surveyRepository.findBySpecialty(specialty);
    }

    // Get survey by Preferences
    public Survey findByPreferences(String preferences) {
        return surveyRepository.findByPreferences(preferences);
    }

    // Get survey by Country
    public Survey findByCountry(String country) {
        return surveyRepository.findByCountry(country);
    }

    // Get survey by Region and City combination
    public Survey findByRegionAndCity(String region, String city) {
        return surveyRepository.findByRegionAndCity(region, city);
    }

    // Get survey by manually selecting specific users
    public Survey findBySelectedUsers(String[] users) {
        return surveyRepository.findBySelectedUsers(users);
    }

    // Get survey by Answer Type
    public Survey findByAnswerType(String answerType) {
        return surveyRepository.findByAnswerType(answerType);
    }

    // Get survey by Rating range
    public Survey findByRating(int start, int end) {
        return surveyRepository.findByRating(start, end);
    }

    // Get all surveys
    public List<Survey> findAll() {
        return surveyRepository.findAll();
    }

}