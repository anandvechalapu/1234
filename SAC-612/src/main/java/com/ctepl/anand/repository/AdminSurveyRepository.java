package com.ctepl.anand.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminSurveyRepository extends JpaRepository<AdminSurvey, Long> {

    AdminSurvey findByDomain(String domain);

    AdminSurvey findByTitleAndDescription(String title, String description);

    AdminSurvey findByDelayTimeInSeconds(int delayTimeInSeconds);

    AdminSurvey findByStatus(String status);

    AdminSurvey findBySurveyState(String surveyState);

    AdminSurvey findByPageNameOrLocation(String pageNameOrLocation);

    AdminSurvey findByStartDateAndEndDate(String startDate, String endDate);

    AdminSurvey findByTargetUsers(String targetUsers);

    AdminSurvey findByCriteria(String criteria);

    AdminSurvey findBySpecialty(String specialty);

    AdminSurvey findByPreferences(String preferences);

    AdminSurvey findByCountry(String country);

    AdminSurvey findByRegionAndCityCombination(String region, String city);

    AdminSurvey findBySpecificUsersList(String specificUsersList);

    AdminSurvey findByTitleAndAnswerType(String title, String answerType);

    AdminSurvey findByRatingRangeBetweenZeroAndFive(int ratingRange);

    AdminSurvey findByUserResponseOnQuestions(String userResponseOnQuestions);

}