package com.ctepl.anand.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctepl.anand.model.Publications;
import com.ctepl.anand.repository.PublicationsRepository;

@Service
public class PublicationsService {
    
    @Autowired
    private PublicationsRepository publicationsRepository;
    
    public Publications getPublicationByName(String name) {
        return publicationsRepository.findByName(name);
    }
    
    public Publications getPublicationByPublisher(String publisher) {
        return publicationsRepository.findByPublisher(publisher);
    }
    
    public Publications getPublicationByDay(String day) {
        return publicationsRepository.findByDay(day);
    }
    
    public Publications getPublicationByActive(boolean active) {
        return publicationsRepository.findByActive(active);
    }
    
    public List<Publications> getAllPublicationsOrderedByNameAsc(){
        return publicationsRepository.findAllByOrderByNameAsc();
    }
    
    public List<Publications> getAllPublicationsOrderedByPublisherAsc(){
        return publicationsRepository.findAllByOrderByPublisherAsc();
    }
    
    public List<Publications> getAllPublicationsOrderedByDayAsc(){
        return publicationsRepository.findAllByOrderByDayAsc();
    }
    
    public List<Publications> getAllActivePublicationsOrderedByNameAsc(){
        return publicationsRepository.findAllByActiveTrueOrderByNameAsc();
    }
    
    public List<Publications> getAllInactivePublicationsOrderedByNameAsc(){
        return publicationsRepository.findAllByActiveFalseOrderByNameAsc();
    }
    
    public Publications savePublication(Publications publication) {
        return publicationsRepository.save(publication);
    }
    
    public void deletePublication(Publications publication) {
        publicationsRepository.delete(publication);
    }

}