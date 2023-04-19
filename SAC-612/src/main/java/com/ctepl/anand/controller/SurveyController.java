package com.ctepl.anand.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ctepl.anand.model.Survey;
import com.ctepl.anand.service.SurveyService;

@RestController
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

    @GetMapping("/surveys")
    public List<Survey> getAllSurveys() {
        return surveyService.getAllSurveys();
    }

    @GetMapping("/surveys/{id}")
    public Optional<Survey> getSurveyById(@PathVariable Long id) {
        return surveyService.getSurveyById(id);
    }

    @PostMapping("/surveys")
    public Survey createSurvey(@RequestBody Survey survey) {
        return surveyService.createSurvey(survey);
    }

    @PutMapping("/surveys")
    public Survey updateSurvey(@RequestBody Survey survey) {
        return surveyService.updateSurvey(survey);
    }

    @DeleteMapping("/surveys/{id}")
    public void deleteSurvey(@PathVariable Long id) {
        surveyService.deleteSurvey(id);
    }

}