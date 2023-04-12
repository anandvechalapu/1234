package com.ctepl.anand.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user_stories")
public class UserStory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "jira_api")
    private String jiraApi;
    
    @Column(name = "title")
    private String title;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "assigned_team_member")
    private String assignedTeamMember;
    
    @Column(name = "real_time_data")
    private String realTimeData;
    
    @Column(name = "acceptance_criteria")
    private List<String> acceptanceCriteria;
    
    @Column(name = "acceptance_testing")
    private List<String> acceptanceTesting;
    
    @Column(name = "definition_of_done")
    private List<String> definitionOfDone;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getJiraApi() {
        return jiraApi;
    }
    
    public void setJiraApi(String jiraApi) {
        this.jiraApi = jiraApi;
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
    
    public String getAssignedTeamMember() {
        return assignedTeamMember;
    }
    
    public void setAssignedTeamMember(String assignedTeamMember) {
        this.assignedTeamMember = assignedTeamMember;
    }
    
    public String getRealTimeData() {
        return realTimeData;
    }
    
    public void setRealTimeData(String realTimeData) {
        this.realTimeData = realTimeData;
    }
    
    public List<String> getAcceptanceCriteria() {
        return acceptanceCriteria;
    }
    
    public void setAcceptanceCriteria(List<String> acceptanceCriteria) {
        this.acceptanceCriteria = acceptanceCriteria;
    }
    
    public List<String> getAcceptanceTesting() {
        return acceptanceTesting;
    }
    
    public void setAcceptanceTesting(List<String> acceptanceTesting) {
        this.acceptanceTesting = acceptanceTesting;
    }
    
    public List<String> getDefinitionOfDone() {
        return definitionOfDone;
    }
    
    public void setDefinitionOfDone(List<String> definitionOfDone) {
        this.definitionOfDone = definitionOfDone;
    }
}