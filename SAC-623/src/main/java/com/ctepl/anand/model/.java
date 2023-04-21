package com.ctepl.anand.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer{
    
    @Id
    private Long customerId;
    private String name;
    private String mobileNumber;
    private String address;
    private String email;
    private String annualIncome;
    private String familyIncome;
    private String crifScore;
    private String consent;
    private String declaration;
    private String authority;
    private String spouseScore;
    private String spouseData;
    private String coi;
    private String feed;
    private String product;
    
    public Long getCustomerId() {
        return customerId;
    }
    
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getMobileNumber() {
        return mobileNumber;
    }
    
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getAnnualIncome() {
        return annualIncome;
    }
    
    public void setAnnualIncome(String annualIncome) {
        this.annualIncome = annualIncome;
    }
    
    public String getFamilyIncome() {
        return familyIncome;
    }
    
    public void setFamilyIncome(String familyIncome) {
        this.familyIncome = familyIncome;
    }
    
    public String getCrifScore() {
        return crifScore;
    }
    
    public void setCrifScore(String crifScore) {
        this.crifScore = crifScore;
    }
    
    public String getConsent() {
        return consent;
    }
    
    public void setConsent(String consent) {
        this.consent = consent;
    }
    
    public String getDeclaration() {
        return declaration;
    }
    
    public void setDeclaration(String declaration) {
        this.declaration = declaration;
    }
    
    public String getAuthority() {
        return authority;
    }
    
    public void setAuthority(String authority) {
        this.authority = authority;
    }
    
    public String getSpouseScore() {
        return spouseScore;
    }
    
    public void setSpouseScore(String spouseScore) {
        this.spouseScore = spouseScore;
    }
    
    public String getSpouseData() {
        return spouseData;
    }
    
    public void setSpouseData(String spouseData) {
        this.spouseData = spouseData;
    }
    
    public String getCoi() {
        return coi;
    }
    
    public void setCoi(String coi) {
        this.coi = coi;
    }
    
    public String getFeed() {
        return feed;
    }
    
    public void setFeed(String feed) {
        this.feed = feed;
    }
    
    public String getProduct() {
        return product;
    }
    
    public void setProduct(String product) {
        this.product = product;
    }
}