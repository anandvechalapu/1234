package com.ctepl.anand.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ctepl.anand.model.Survey;

public interface SurveyRepository extends JpaRepository<Survey, Long> {

    @Query("SELECT s FROM Survey s WHERE s.domain = :domain")
    Survey findByDomain(@Param("domain") String domain);

    @Query("SELECT s FROM Survey s WHERE s.title = :title")
    Survey findByTitle(@Param("title") String title);

    @Query("SELECT s FROM Survey s WHERE s.delayTime = :delayTime")
    Survey findByDelayTime(@Param("delayTime") int delayTime);

    @Query("SELECT s FROM Survey s WHERE s.status = :status")
    Survey findByStatus(@Param("status") String status);

    @Query("SELECT s FROM Survey s WHERE s.surveyState = :surveyState")
    Survey findBySurveyState(@Param("surveyState") String surveyState);
    
    @Query("SELECT s FROM Survey s WHERE s.pageName = :pageName")
    Survey findByPageName(@Param("pageName") String pageName);

    @Query("SELECT s FROM Survey s WHERE s.startDate = :startDate")
    Survey findByStartDate(@Param("startDate") String startDate);

    @Query("SELECT s FROM Survey s WHERE s.endDate = :endDate")
    Survey findByEndDate(@Param("endDate") String endDate);

    @Query("SELECT s FROM Survey s WHERE s.targetUsers = :targetUsers")
    Survey findByTargetUsers(@Param("targetUsers") String targetUsers);

    @Query("SELECT s FROM Survey s WHERE s.specialty = :specialty")
    Survey findBySpecialty(@Param("specialty") String specialty);

    @Query("SELECT s FROM Survey s WHERE s.preferences = :preferences")
    Survey findByPreferences(@Param("preferences") String preferences);

    @Query("SELECT s FROM Survey s WHERE s.country = :country")
    Survey findByCountry(@Param("country") String country);

    @Query("SELECT s FROM Survey s WHERE s.region = :region")
    Survey findByRegion(@Param("region") String region);

    @Query("SELECT s FROM Survey s WHERE s.city = :city")
    Survey findByCity(@Param("city") String city);

    @Query("SELECT s FROM Survey s WHERE s.userList = :userList")
    Survey findByUserList(@Param("userList") String userList);

    @Query("SELECT s FROM Survey s WHERE s.questionTitle = :questionTitle")
    Survey findByQuestionTitle(@Param("questionTitle") String questionTitle);

    @Query("SELECT s FROM Survey s WHERE s.answerType = :answerType")
    Survey findByAnswerType(@Param("answerType") String answerType);

    @Query("SELECT s FROM Survey s WHERE s.ratingRange = :ratingRange")
    Survey findByRatingRange(@Param("ratingRange") int ratingRange);

}