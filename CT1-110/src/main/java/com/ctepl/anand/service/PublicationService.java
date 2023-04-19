package com.ctepl.anand.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctepl.anand.entity.Publication;
import com.ctepl.anand.repository.PublicationRepository;

@Service
public class PublicationService {

    @Autowired
    private PublicationRepository publicationRepository;

    public List<Publication> getAllPublications() {
        return publicationRepository.findAll();
    }

    public Optional<Publication> getPublicationById(Long id) {
        return publicationRepository.findById(id);
    }

    public Publication addPublication(Publication publication) {
        return publicationRepository.save(publication);
    }

    public Publication updatePublication(Publication publication) {
        return publicationRepository.save(publication);
    }

    public void deletePublicationById(Long id) {
        publicationRepository.deleteById(id);
    }

    public List<Publication> findByName(String name) {
        return publicationRepository.findByName(name);
    }

    public List<Publication> findByDays(String days) {
        return publicationRepository.findByDays(days);
    }

    public List<Publication> findByPublisher(String publisher) {
        return publicationRepository.findByPublisher(publisher);
    }

    public List<Publication> findByActive(Boolean active) {
        return publicationRepository.findByActive(active);
    }

    public void deleteByName(String name) {
        publicationRepository.deleteByName(name);
    }

    public void deleteByDays(String days) {
        publicationRepository.deleteByDays(days);
    }

    public void deleteByPublisher(String publisher) {
        publicationRepository.deleteByPublisher(publisher);
    }

    public void deleteByActive(Boolean active) {
        publicationRepository.deleteByActive(active);
    }
}