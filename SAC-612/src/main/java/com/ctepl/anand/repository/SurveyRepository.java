package com.ctepl.anand.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ctepl.anand.model.Survey;

@Repository
public interface SurveyRepository extends JpaRepository<Survey, Long> {

    // Method to get survey details by id
    Survey findById(long id);

    // Method to get survey details by domain
    Survey findByDomain(String domain);

    // Method to get survey details by title
    Survey findByTitle(String title);

    // Method to get survey details by delay time in seconds
    Survey findByDelayTime(int delayTime);

    // Method to get survey details by status
    Survey findByStatus(String status);

    // Method to get survey details by survey state
    Survey findBySurveyState(String surveyState);

    // Method to get survey details by page name or location
    Survey findByPageNameOrLocation(String pageNameOrLocation);

    // Method to get survey details by start date
    Survey findByStartDate(String startDate);

    // Method to get survey details by end date
    Survey findByEndDate(String endDate);

    // Method to get survey details by target users
    Survey findByTargetUsers(String targetUsers);

    // Method to get survey details by excluding users
    Survey findByExcludingUsers(String excludingUsers);

    // Method to get survey details by specialty
    Survey findBySpecialty(String specialty);

    // Method to get survey details by preferences
    Survey findByPreferences(String preferences);

    // Method to get survey details by country
    Survey findByCountry(String country);

    // Method to get survey details by region and city
    Survey findByRegionAndCity(String region, String city);

    // Method to get survey details by manually selecting users
    Survey findByManuallySelectingUsers(String manuallySelectingUsers);

    // Method to get survey details by question title
    Survey findByQuestionTitle(String questionTitle);

    // Method to get survey details by answer type
    Survey findByAnswerType(String answerType);

    // Method to get survey details by rating range
    Survey findByRatingRange(int ratingRange);

}