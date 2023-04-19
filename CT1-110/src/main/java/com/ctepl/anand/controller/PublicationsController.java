package com.ctepl.anand.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctepl.anand.model.Publications;
import com.ctepl.anand.service.PublicationsService;

@RestController
@RequestMapping("/publications")
public class PublicationsController {
    
    @Autowired
    private PublicationsService publicationsService;
    
    @GetMapping("/{name}")
    public Publications getPublicationByName(@PathVariable String name) {
        return publicationsService.getPublicationByName(name);
    }
    
    @GetMapping("/publisher/{publisher}")
    public Publications getPublicationByPublisher(@PathVariable String publisher) {
        return publicationsService.getPublicationByPublisher(publisher);
    }
    
    @GetMapping("/day/{day}")
    public Publications getPublicationByDay(@PathVariable String day) {
        return publicationsService.getPublicationByDay(day);
    }
    
    @GetMapping("/active/{active}")
    public Publications getPublicationByActive(@PathVariable boolean active) {
        return publicationsService.getPublicationByActive(active);
    }
    
    @GetMapping("/allOrderedByNameAsc")
    public List<Publications> getAllPublicationsOrderedByNameAsc(){
        return publicationsService.getAllPublicationsOrderedByNameAsc();
    }
    
    @GetMapping("/allOrderedByPublisherAsc")
    public List<Publications> getAllPublicationsOrderedByPublisherAsc(){
        return publicationsService.getAllPublicationsOrderedByPublisherAsc();
    }
    
    @GetMapping("/allOrderedByDayAsc")
    public List<Publications> getAllPublicationsOrderedByDayAsc(){
        return publicationsService.getAllPublicationsOrderedByDayAsc();
    }
    
    @GetMapping("/allActiveOrderedByNameAsc")
    public List<Publications> getAllActivePublicationsOrderedByNameAsc(){
        return publicationsService.getAllActivePublicationsOrderedByNameAsc();
    }
    
    @GetMapping("/allInactiveOrderedByNameAsc")
    public List<Publications> getAllInactivePublicationsOrderedByNameAsc(){
        return publicationsService.getAllInactivePublicationsOrderedByNameAsc();
    }
    
    @PostMapping
    public Publications savePublication(@RequestBody Publications publication) {
        return publicationsService.savePublication(publication);
    }
    
    @PutMapping
    public Publications updatePublication(@RequestBody Publications publication) {
        return publicationsService.savePublication(publication);
    }

}