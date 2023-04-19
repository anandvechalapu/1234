package com.ctepl.anand.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Survey {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String domain;
	private String title;
	private int delayTime;
	private String status;
	private String surveyState;
	private String pageName;
	private String startDate;
	private String endDate;
	private String targetUsers;
	private String specialty;
	private String preferences;
	private String country;
	private String region;
	private String city;
	private String userList;
	private String questionTitle;
	private String answerType;
	private int ratingRange;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public int getDelayTime() {
		return delayTime;
	}
	public void setDelayTime(int delayTime) {
		this.delayTime = delayTime;
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
	public String getPageName() {
		return pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
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
	public String getUserList() {
		return userList;
	}
	public void setUserList(String userList) {
		this.userList = userList;
	}
	public String getQuestionTitle() {
		return questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	public String getAnswerType() {
		return answerType;
	}
	public void setAnswerType(String answerType) {
		this.answerType = answerType;
	}
	public int getRatingRange() {
		return ratingRange;