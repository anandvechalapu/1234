package com.sacral.1234.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.1234.model.Help;
import com.sacral.1234.repository.HelpRepository;

@Service
public class HelpService {
    
    @Autowired
    private HelpRepository helpRepository;
    
    //Method to find help page by clicking the 'Help' option from the header menu
    public Optional<Help> getHelpById(Long id) {
        return helpRepository.findById(id);
    }
    
    //Method to get the list of all 6 features information 
    public List<Help> getAllHelp() {
        return helpRepository.findAll();
    }
    
    //Method to find the 6 features information by clicking the functionalities displayed on page
    public Optional<Help> findByFunctionalities(String functionalities) {
        return helpRepository.findByFunctionalities(functionalities);
    }
    
    //Method to access the 6 features information
    public Optional<Help> findByFeaturesInformation(String featuresInformation) {
        return helpRepository.findByFeaturesInformation(featuresInformation);
    }
    
}