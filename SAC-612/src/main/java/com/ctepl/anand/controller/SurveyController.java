package com.ctepl.anand.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ctepl.anand.model.Survey;
import com.ctepl.anand.service.SurveyService;

@RestController
public class SurveyController {
	
	@Autowired
	private SurveyService surveyService;
	
	@GetMapping("/survey/findByDomain")
	public Survey findByDomain(@RequestParam(value="domain") String domain) {
		return surveyService.findByDomain(domain);
	}
	
	@GetMapping("/survey/findByTitle")
	public Survey findByTitle(@RequestParam(value="title") String title) {
		return surveyService.findByTitle(title);
	}
	
	@GetMapping("/survey/findByDelayTime")
	public Survey findByDelayTime(@RequestParam(value="delayTime") int delayTime) {
		return surveyService.findByDelayTime(delayTime);
	}
	
	@GetMapping("/survey/findByStatus")
	public Survey findByStatus(@RequestParam(value="status") String status) {
		return surveyService.findByStatus(status);
	}
	
	@GetMapping("/survey/findBySurveyState")
	public Survey findBySurveyState(@RequestParam(value="surveyState") String surveyState) {
		return surveyService.findBySurveyState(surveyState);
	}
	
	@GetMapping("/survey/findByPageName")
	public Survey findByPageName(@RequestParam(value="pageName") String pageName) {
		return surveyService.findByPageName(pageName);
	}
	
	@GetMapping("/survey/findByStartDate")
	public Survey findByStartDate(@RequestParam(value="startDate") String startDate) {
		return surveyService.findByStartDate(startDate);
	}
	
	@GetMapping("/survey/findByEndDate")
	public Survey findByEndDate(@RequestParam(value="endDate") String endDate) {
		return surveyService.findByEndDate(endDate);
	}
	
	@GetMapping("/survey/findByTargetUsers")
	public Survey findByTargetUsers(@RequestParam(value="targetUsers") String targetUsers) {
		return surveyService.findByTargetUsers(targetUsers);
	}
	
	@GetMapping("/survey/findBySpecialty")
	public Survey findBySpecialty(@RequestParam(value="specialty") String specialty) {
		return surveyService.findBySpecialty(specialty);
	}
	
	@GetMapping("/survey/findByPreferences")
	public Survey findByPreferences(@RequestParam(value="preferences") String preferences) {
		return surveyService.findByPreferences(preferences);
	}
	
	@GetMapping("/survey/findByCountry")
	public Survey findByCountry(@RequestParam(value="country") String country) {
		return surveyService.findByCountry(country);
	}
	
	@GetMapping("/survey/findByRegion")
	public Survey findByRegion(@RequestParam(value="region") String region) {
		return surveyService.findByRegion(region);
	}
	
	@GetMapping("/survey/findByCity")
	public Survey findByCity(@RequestParam(value="city") String city) {
		return surveyService.findByCity(city);
	}
	
	@GetMapping("/survey/findByUserList")
	public Survey findByUserList(@RequestParam(value="userList