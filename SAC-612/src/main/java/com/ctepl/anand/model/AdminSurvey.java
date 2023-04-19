package com.ctepl.anand.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AdminSurvey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String domain;
    private String title;
    private String description;
    private int delayTimeInSeconds;
    private String status;
    private String surveyState;
    private String pageNameOrLocation;
    private String startDate;
    private String endDate;
    private String targetUsers;
    private String criteria;
    private String specialty;
    private String preferences;
    private String country;
    private String region;
    private String city;
    private String specificUsersList;
    private String answerType;
    private int ratingRange;
    private String userResponseOnQuestions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDelayTimeInSeconds() {
        return delayTimeInSeconds;
    }

    public void setDelayTimeInSeconds(int delayTimeInSeconds) {
        this.delayTimeInSeconds = delayTimeInSeconds;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSurveyState() {
        return surveyState;
    }

    public void setSurveyState(String surveyState) {
        this.surveyState = surveyState;
    }

    public String getPageNameOrLocation() {
        return pageNameOrLocation;
    }

    public void setPageNameOrLocation(String pageNameOrLocation) {
        this.pageNameOrLocation = pageNameOrLocation;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getTargetUsers() {
        return targetUsers;
    }

    public void setTargetUsers(String targetUsers) {
        this.targetUsers = targetUsers;
    }

    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSpecificUsersList() {
        return specificUsersList;
    }

    public void setSpecificUsersList(String specificUsersList) {
        this.specificUsersList = specificUsersList;
    }

    public String getAnswerType() {