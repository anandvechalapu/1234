package com.sacral.1234.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class About {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String introduction;
    private String goals;
    private String emailUsOption;
    private Boolean accessWithoutLogin;
    private Boolean sendEmailWithoutLogin;
    private String linkToMainANMWWebsite;

    public About(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    public String getEmailUsOption() {
        return emailUsOption;
    }

    public void setEmailUsOption(String emailUsOption) {
        this.emailUsOption = emailUsOption;
    }

    public Boolean getAccessWithoutLogin() {
        return accessWithoutLogin;
    }

    public void setAccessWithoutLogin(Boolean accessWithoutLogin) {
        this.accessWithoutLogin = accessWithoutLogin;
    }

    public Boolean getSendEmailWithoutLogin() {
        return sendEmailWithoutLogin;
    }

    public void setSendEmailWithoutLogin(Boolean sendEmailWithoutLogin) {
        this.sendEmailWithoutLogin = sendEmailWithoutLogin;
    }

    public String getLinkToMainANMWWebsite() {
        return linkToMainANMWWebsite;
    }

    public void setLinkToMainANMWWebsite(String linkToMainANMWWebsite) {
        this.linkToMainANMWWebsite = linkToMainANMWWebsite;
    }

}