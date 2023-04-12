package com.ctepl.anand.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserStoryRepository extends JpaRepository<UserStory, Long> {
    
    List<UserStory> findUserStoriesByJiraApi();
    
    List<UserStory> findUserStoriesByTitleAndDescription();
    
    List<UserStory> findUserStoriesByAssignedTeamMember();
    
    List<UserStory> findUserStoriesByRealTimeData();
    
    List<UserStory> findUserStoriesByAcceptanceCriteria();
    
    List<UserStory> findUserStoriesByAcceptanceTesting();
    
    List<UserStory> findUserStoriesByDefinitionOfDone();
}