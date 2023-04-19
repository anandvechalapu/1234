SurveyByRatingRange(int ratingRange) {
        return surveyRepository.findByRatingRange(ratingRange);
    }

    // Method to delete survey details
    public void deleteSurvey(long id) {
        surveyRepository.deleteById(id);
    }
}

package com.ctepl.anand.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctepl.anand.model.Survey;
import com.ctepl.anand.service.SurveyService;

@RestController
@RequestMapping("/survey")
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

    // Method to save survey details
    @PostMapping("/save")
    public void saveSurvey(@RequestBody Survey survey) {
        surveyService.saveSurvey(survey);
    }

    // Method to get all survey details
    @GetMapping("/all")
    public List<Survey> getAllSurveys() {
        return surveyService.getAllSurveys();
    }

    // Method to get survey details by id
    @GetMapping("/{id}")
    public Survey getSurveyById(@PathVariable long id) {
        return surveyService.getSurveyById(id);
    }

    // Method to get survey details by domain
    @GetMapping("/domain/{domain}")
    public Survey getSurveyByDomain(@PathVariable String domain) {
        return surveyService.getSurveyByDomain(domain);
    }

    // Method to get survey details by title
    @GetMapping("/title/{title}")
    public Survey getSurveyByTitle(@PathVariable String title) {
        return surveyService.getSurveyByTitle(title);
    }

    // Method to get survey details by delay time in seconds
    @GetMapping("/delayTime/{delayTime}")
    public Survey getSurveyByDelayTime(@PathVariable int delayTime) {
        return surveyService.getSurveyByDelayTime(delayTime);
    }

    // Method to get survey details by status
    @GetMapping("/status/{status}")
    public Survey getSurveyByStatus(@PathVariable String status) {
        return surveyService.getSurveyByStatus(status);
    }

    // Method to get survey details by survey state
    @GetMapping("/state/{surveyState}")
    public Survey getSurveyBySurveyState(@PathVariable String surveyState) {
        return surveyService.getSurveyBySurveyState(surveyState);
    }

    // Method to get survey details by page name or location
    @GetMapping("/pageNameOrLocation/{pageNameOrLocation}")
    public Survey getSurveyByPageNameOrLocation(@PathVariable String pageNameOrLocation) {
        return surveyService.getSurveyByPageNameOrLocation(pageNameOrLocation);
    }

    // Method to get survey details by start date
    @GetMapping("/startDate/{startDate}")
    public Survey getSurveyByStartDate(@PathVariable String startDate) {
        return surveyService.getSurveyByStartDate(startDate);
    }

    // Method to get survey details by end date
    @GetMapping("/endDate/{endDate}")
    public Survey getSurveyByEndDate(@PathVariable String endDate) {
        return surveyService.getSurveyByEndDate(endDate);
    }

    // Method to get survey details by target users
    @GetMapping("/targetUsers/{targetUsers}")
    public Survey getSurveyByTargetUsers(@PathVariable String targetUsers) {
        return surveyService.get