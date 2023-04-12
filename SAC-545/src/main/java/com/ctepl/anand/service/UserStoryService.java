package com.ctepl.anand.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctepl.anand.repository.UserStoryRepository;
import com.ctepl.anand.entity.UserStory;

@Service
public class UserStoryService {
    
    @Autowired
    private UserStoryRepository userStoryRepository;
    
    public List<UserStory> findUserStoriesByJiraApi(){
        return userStoryRepository.findUserStoriesByJiraApi();
    }
    
    public List<UserStory> findUserStoriesByTitleAndDescription(){
        return userStoryRepository.findUserStoriesByTitleAndDescription();
    }
    
    public List<UserStory> findUserStoriesByAssignedTeamMember(){
        return userStoryRepository.findUserStoriesByAssignedTeamMember();
    }
    
    public List<UserStory> findUserStoriesByRealTimeData(){
        return userStoryRepository.findUserStoriesByRealTimeData();
    }
    
    public List<UserStory> findUserStoriesByAcceptanceCriteria(){
        return userStoryRepository.findUserStoriesByAcceptanceCriteria();
    }
    
    public List<UserStory> findUserStoriesByAcceptanceTesting(){
        return userStoryRepository.findUserStoriesByAcceptanceTesting();
    }
    
    public List<UserStory> findUserStoriesByDefinitionOfDone(){
        return userStoryRepository.findUserStoriesByDefinitionOfDone();
    }
}