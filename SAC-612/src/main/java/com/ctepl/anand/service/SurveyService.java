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
	
	public Survey findByDomain(String domain) {
		return surveyRepository.findByDomain(domain);
	}
	
	public Survey findByTitle(String title) {
		return surveyRepository.findByTitle(title);
	}
	
	public Survey findByDelayTime(int delayTime) {
		return surveyRepository.findByDelayTime(delayTime);
	}
	
	public Survey findByStatus(String status) {
		return surveyRepository.findByStatus(status);
	}
	
	public Survey findBySurveyState(String surveyState) {
		return surveyRepository.findBySurveyState(surveyState);
	}
	
	public Survey findByPageName(String pageName) {
		return surveyRepository.findByPageName(pageName);
	}
	
	public Survey findByStartDate(String startDate) {
		return surveyRepository.findByStartDate(startDate);
	}
	
	public Survey findByEndDate(String endDate) {
		return surveyRepository.findByEndDate(endDate);
	}
	
	public Survey findByTargetUsers(String targetUsers) {
		return surveyRepository.findByTargetUsers(targetUsers);
	}
	
	public Survey findBySpecialty(String specialty) {
		return surveyRepository.findBySpecialty(specialty);
	}
	
	public Survey findByPreferences(String preferences) {
		return surveyRepository.findByPreferences(preferences);
	}
	
	public Survey findByCountry(String country) {
		return surveyRepository.findByCountry(country);
	}
	
	public Survey findByRegion(String region) {
		return surveyRepository.findByRegion(region);
	}
	
	public Survey findByCity(String city) {
		return surveyRepository.findByCity(city);
	}
	
	public Survey findByUserList(String userList) {
		return surveyRepository.findByUserList(userList);
	}
	
	public Survey findByQuestionTitle(String questionTitle) {
		return surveyRepository.findByQuestionTitle(questionTitle);
	}
	
	public Survey findByAnswerType(String answerType) {
		return surveyRepository.findByAnswerType(answerType);
	}
	
	public Survey findByRatingRange(int ratingRange) {
		return surveyRepository.findByRatingRange(ratingRange);
	}
	
	public List<Survey> findAll() {
		return surveyRepository.findAll();
	}
	
	public Survey save(Survey survey) {
		return surveyRepository.save(survey);
	}
	
	public void delete(Survey survey) {
		surveyRepository.delete(survey);
	}
}