package com.ctepl.anand.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctepl.anand.entity.UserStory;
import com.ctepl.anand.service.UserStoryService;

@RestController
@RequestMapping("/userstories")
public class UserStoryController {

    @Autowired
    private UserStoryService userStoryService;
    
    @GetMapping("/byJiraApi")
    public List<UserStory> findUserStoriesByJiraApi() {
        return userStoryService.findUserStoriesByJiraApi();
    }

    @GetMapping("/byTitleAndDescription")
    public List<UserStory> findUserStoriesByTitleAndDescription() {
        return userStoryService.findUserStoriesByTitleAndDescription();
    }

    @GetMapping("/byAssignedTeamMember")
    public List<UserStory> findUserStoriesByAssignedTeamMember() {
        return userStoryService.findUserStoriesByAssignedTeamMember();
    }

    @GetMapping("/byRealTimeData")
    public List<UserStory> findUserStoriesByRealTimeData() {
        return userStoryService.findUserStoriesByRealTimeData();
    }

    @GetMapping("/byAcceptanceCriteria")
    public List<UserStory> findUserStoriesByAcceptanceCriteria() {
        return userStoryService.findUserStoriesByAcceptanceCriteria();
    }

    @GetMapping("/byAcceptanceTesting")
    public List<UserStory> findUserStoriesByAcceptanceTesting() {
        return userStoryService.findUserStoriesByAcceptanceTesting();
    }

    @GetMapping("/byDefinitionOfDone")
    public List<UserStory> findUserStoriesByDefinitionOfDone() {
        return userStoryService.findUserStoriesByDefinitionOfDone();
    }
}