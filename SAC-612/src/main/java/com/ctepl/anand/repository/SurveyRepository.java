package com.ctepl.anand.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ctepl.anand.model.Survey;

@Repository
public interface SurveyRepository extends JpaRepository<Survey, Long> {

    // Get survey by id
    Survey findById(long id);

    // Get survey by title
    Survey findByTitle(String title);

    // Get survey by Domain
    Survey findByDomain(String domain);

    // Get survey by Status
    Survey findByStatus(String status);

    // Get survey by Survey State
    Survey findBySurveyState(String surveyState);

    // Get survey by Page Name or Location
    Survey findByPageNameOrLocation(String pageNameOrLocation);

    // Get survey by Start and End dates
    Survey findByStartDateAndEndDate(String startDate, String endDate);

    // Get survey by Target Users
    Survey findByTargetUsers(String targetUsers);

    // Get survey by Specialty
    Survey findBySpecialty(String specialty);

    // Get survey by Preferences
    Survey findByPreferences(String preferences);

    // Get survey by Country
    Survey findByCountry(String country);

    // Get survey by Region and City combination
    @Query(value = "SELECT * FROM survey WHERE region = ?1 and city = ?2", nativeQuery = true)
    Survey findByRegionAndCity(String region, String city);

    // Get survey by manually selecting specific users
    @Query(value = "SELECT * FROM survey WHERE user_id IN ?1", nativeQuery = true)
    Survey findBySelectedUsers(String[] users);

    // Get survey by Answer Type
    Survey findByAnswerType(String answerType);

    // Get survey by Rating range
    @Query(value = "SELECT * FROM survey WHERE rating BETWEEN ?1 AND ?2", nativeQuery = true)
    Survey findByRating(int start, int end);

}