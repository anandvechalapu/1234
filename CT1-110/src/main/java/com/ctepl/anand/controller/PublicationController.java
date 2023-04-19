package com.ctepl.anand.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctepl.anand.entity.Publication;
import com.ctepl.anand.service.PublicationService;

@RestController
@RequestMapping("/publications")
public class PublicationController {

	@Autowired
	private PublicationService publicationService;
	
	@GetMapping
	public List<Publication> getAllPublications() {
		return publicationService.getAllPublications();
	}
	
	@GetMapping("/{id}")
	public Optional<Publication> getPublicationById(@PathVariable Long id) {
		return publicationService.getPublicationById(id);
	}
	
	@PostMapping
	public Publication addPublication(@RequestBody Publication publication) {
		return publicationService.addPublication(publication);
	}
	
	@PutMapping
	public Publication updatePublication(@RequestBody Publication publication) {
		return publicationService.updatePublication(publication);
	}
	
	@DeleteMapping("/{id}")
	public void deletePublicationById(@PathVariable Long id) {
		publicationService.deletePublicationById(id);
	}
	
	@GetMapping("/name/{name}")
	public List<Publication> findByName(@PathVariable String name) {
		return publicationService.findByName(name);
	}
	
	@GetMapping("/days/{days}")
	public List<Publication> findByDays(@PathVariable String days) {
		return publicationService.findByDays(days);
	}
	
	@GetMapping("/publisher/{publisher}")
	public List<Publication> findByPublisher(@PathVariable String publisher) {
		return publicationService.findByPublisher(publisher);
	}
	
	@GetMapping("/active/{active}")
	public List<Publication> findByActive(@PathVariable Boolean active) {
		return publicationService.findByActive(active);
	}
	
	@DeleteMapping("/name/{name}")
	public void deleteByName(@PathVariable String name) {
		publicationService.deleteByName(name);
	}
	
	@DeleteMapping("/days/{days}")
	public void deleteByDays(@PathVariable String days) {
		publicationService.deleteByDays(days);
	}
	
	@DeleteMapping("/publisher/{publisher}")
	public void deleteByPublisher(@PathVariable String publisher) {
		publicationService.deleteByPublisher(publisher);
	}
	
	@DeleteMapping("/active/{active}")
	public void deleteByActive(@PathVariable Boolean active) {
		publicationService.deleteByActive(active);
	}
	
}