package com.ctepl.anand.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctepl.anand.model.Survey;
import com.ctepl.anand.repository.SurveyRepository;

@Service
public class SurveyService {

    @Autowired
    private SurveyRepository surveyRepository;

    // Method to save survey details
    public void saveSurvey(Survey survey) {
        surveyRepository.save(survey);
    }

    // Method to get all survey details
    public List<Survey> getAllSurveys() {
        return surveyRepository.findAll();
    }

    // Method to get survey details by id
    public Survey getSurveyById(long id) {
        return surveyRepository.findById(id);
    }

    // Method to get survey details by domain
    public Survey getSurveyByDomain(String domain) {
        return surveyRepository.findByDomain(domain);
    }

    // Method to get survey details by title
    public Survey getSurveyByTitle(String title) {
        return surveyRepository.findByTitle(title);
    }

    // Method to get survey details by delay time in seconds
    public Survey getSurveyByDelayTime(int delayTime) {
        return surveyRepository.findByDelayTime(delayTime);
    }

    // Method to get survey details by status
    public Survey getSurveyByStatus(String status) {
        return surveyRepository.findByStatus(status);
    }

    // Method to get survey details by survey state
    public Survey getSurveyBySurveyState(String surveyState) {
        return surveyRepository.findBySurveyState(surveyState);
    }

    // Method to get survey details by page name or location
    public Survey getSurveyByPageNameOrLocation(String pageNameOrLocation) {
        return surveyRepository.findByPageNameOrLocation(pageNameOrLocation);
    }

    // Method to get survey details by start date
    public Survey getSurveyByStartDate(String startDate) {
        return surveyRepository.findByStartDate(startDate);
    }

    // Method to get survey details by end date
    public Survey getSurveyByEndDate(String endDate) {
        return surveyRepository.findByEndDate(endDate);
    }

    // Method to get survey details by target users
    public Survey getSurveyByTargetUsers(String targetUsers) {
        return surveyRepository.findByTargetUsers(targetUsers);
    }

    // Method to get survey details by excluding users
    public Survey getSurveyByExcludingUsers(String excludingUsers) {
        return surveyRepository.findByExcludingUsers(excludingUsers);
    }

    // Method to get survey details by specialty
    public Survey getSurveyBySpecialty(String specialty) {
        return surveyRepository.findBySpecialty(specialty);
    }

    // Method to get survey details by preferences
    public Survey getSurveyByPreferences(String preferences) {
        return surveyRepository.findByPreferences(preferences);
    }

    // Method to get survey details by country
    public Survey getSurveyByCountry(String country) {
        return surveyRepository.findByCountry(country);
    }

    // Method to get survey details by region and city
    public Survey getSurveyByRegionAndCity(String region, String city) {
        return surveyRepository.findByRegionAndCity(region, city);
    }

    // Method to get survey details by manually selecting users
    public Survey getSurveyByManuallySelectingUsers(String manuallySelectingUsers) {
        return surveyRepository.findByManuallySelectingUsers(manuallySelectingUsers);
    }

    // Method to get survey details by question title
    public Survey getSurveyByQuestionTitle(String questionTitle) {
        return surveyRepository.findByQuestionTitle(questionTitle);
    }

    // Method to get survey details by answer type
    public Survey getSurveyByAnswerType(String answerType) {
        return surveyRepository.findByAnswerType(answerType);
    }

    // Method to get survey details by rating range
    public Survey get