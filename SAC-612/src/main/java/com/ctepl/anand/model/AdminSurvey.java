package com.ctepl.anand.model;

import java.util.Date;
import java.util.List;

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
   private String status;
   private String surveyState;
   private String pageNameOrLocation;
   private String targetUsers;
   private String specialty;
   private String preferences;
   private String country;
   private String region;
   private String city;
   private List<User> specificUsers;
   private List<Question> questions;
   private String title;
   private String answerType;
   private int start;
   private int end;
   private Date startDate;
   private Date endDate;
   private List<UserResponse> userResponseOnQuestions;

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

   public String getTargetUsers() {
      return targetUsers;
   }

   public void setTargetUsers(String targetUsers) {
      this.targetUsers = targetUsers;
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

   public List<User> getSpecificUsers() {
      return specificUsers;
   }

   public void setSpecificUsers(List<User> specificUsers) {
      this.specificUsers = specificUsers;
   }

   public List<Question> getQuestions() {
      return questions;
   }

   public void setQuestions(List<Question> questions) {
      this.questions = questions;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getAnswerType() {
      return answerType;
   }

   public void setAnswerType(String answerType) {
      this.answerType = answerType;
   }

   public int getStart() {
      return start;
   }

   public void setStart(int start) {
      this.start = start;
   }

   public int getEnd() {
      return end;
   }

   public void setEnd(int end) {
      this.end = end;
   }

   public Date getStartDate() {
      return startDate;
   }

   public void setStartDate(Date startDate) {
      this.startDate = startDate;
   }

   public Date getEndDate() {
      return endDate;
