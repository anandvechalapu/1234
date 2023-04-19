package com.ctepl.anand.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctepl.anand.model.AdminSurvey;
import com.ctepl.anand.repository.AdminSurveyRepository;

@Service
public class AdminSurveyService {

    @Autowired
    private AdminSurveyRepository adminSurveyRepository;

    public AdminSurvey findByDomain(String domain) {
        return adminSurveyRepository.findByDomain(domain);
    }

    public AdminSurvey findByTitleAndDescription(String title, String description) {
        return adminSurveyRepository.findByTitleAndDescription(title, description);
    }

    public AdminSurvey findByDelayTimeInSeconds(int delayTimeInSeconds) {
        return adminSurveyRepository.findByDelayTimeInSeconds(delayTimeInSeconds);
    }

    public AdminSurvey findByStatus(String status) {
        return adminSurveyRepository.findByStatus(status);
    }

    public AdminSurvey findBySurveyState(String surveyState) {
        return adminSurveyRepository.findBySurveyState(surveyState);
    }

    public AdminSurvey findByPageNameOrLocation(String pageNameOrLocation) {
        return adminSurveyRepository.findByPageNameOrLocation(pageNameOrLocation);
    }

    public AdminSurvey findByStartDateAndEndDate(String startDate, String endDate) {
        return adminSurveyRepository.findByStartDateAndEndDate(startDate, endDate);
    }

    public AdminSurvey findByTargetUsers(String targetUsers) {
        return adminSurveyRepository.findByTargetUsers(targetUsers);
    }

    public AdminSurvey findByCriteria(String criteria) {
        return adminSurveyRepository.findByCriteria(criteria);
    }

    public AdminSurvey findBySpecialty(String specialty) {
        return adminSurveyRepository.findBySpecialty(specialty);
    }

    public AdminSurvey findByPreferences(String preferences) {
        return adminSurveyRepository.findByPreferences(preferences);
    }

    public AdminSurvey findByCountry(String country) {
        return adminSurveyRepository.findByCountry(country);
    }

    public AdminSurvey findByRegionAndCityCombination(String region, String city) {
        return adminSurveyRepository.findByRegionAndCityCombination(region, city);
    }

    public AdminSurvey findBySpecificUsersList(String specificUsersList) {
        return adminSurveyRepository.findBySpecificUsersList(specificUsersList);
    }

    public AdminSurvey findByTitleAndAnswerType(String title, String answerType) {
        return adminSurveyRepository.findByTitleAndAnswerType(title, answerType);
    }

    public AdminSurvey findByRatingRangeBetweenZeroAndFive(int ratingRange) {
        return adminSurveyRepository.findByRatingRangeBetweenZeroAndFive(ratingRange);
    }

    public AdminSurvey findByUserResponseOnQuestions(String userResponseOnQuestions) {
        return adminSurveyRepository.findByUserResponseOnQuestions(userResponseOnQuestions);
    }

    public List<AdminSurvey> findAllAdminSurveys() {
        return adminSurveyRepository.findAll();
    }

}