package com.sacral.1234.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Help {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String headerMenuOption;
    private String functionalities;
    private String featuresInformation;
    
    public Help() {}
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getHeaderMenuOption() {
        return headerMenuOption;
    }
    
    public void setHeaderMenuOption(String headerMenuOption) {
        this.headerMenuOption = headerMenuOption;
    }
    
    public String getFunctionalities() {
        return functionalities;
    }
    
    public void setFunctionalities(String functionalities) {
        this.functionalities = functionalities;
    }
    
    public String getFeaturesInformation() {
        return featuresInformation;
    }
    
    public void setFeaturesInformation(String featuresInformation) {
        this.featuresInformation = featuresInformation;
    }
    
}