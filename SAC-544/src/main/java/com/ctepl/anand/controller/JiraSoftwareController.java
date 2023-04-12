package com.ctepl.anand.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctepl.anand.entity.JiraSoftwareConfiguration;
import com.ctepl.anand.service.JiraSoftwareService;

@RestController
@RequestMapping("/jirasoftwareconfiguration")
public class JiraSoftwareController {
	
	@Autowired
	private JiraSoftwareService service;
	
	@GetMapping
	public List<JiraSoftwareConfiguration> getAllJiraSoftwareConfigurations() {
		return service.getAllJiraSoftwareConfigurations();
	}
	
	@GetMapping("/username/{username}")
	public JiraSoftwareConfiguration getJiraSoftwareConfigurationByUserName(@PathVariable String username) {
		return service.getJiraSoftwareConfigurationByUserName(username);
	}
	
	@GetMapping("/title/{title}")
	public JiraSoftwareConfiguration getJiraSoftwareConfigurationByTitle(@PathVariable String title) {
		return service.getJiraSoftwareConfigurationByTitle(title);
	}
	
	@GetMapping("/url/{url}")
	public JiraSoftwareConfiguration getJiraSoftwareConfigurationByUrl(@PathVariable String url) {
		return service.getJiraSoftwareConfigurationByUrl(url);
	}
	
	@GetMapping("/repositoryname/{repositoryname}")
	public JiraSoftwareConfiguration getJiraSoftwareConfigurationByRepositoryName(@PathVariable String repositoryname) {
		return service.getJiraSoftwareConfigurationByRepositoryName(repositoryname);
	}
	
	@GetMapping("/password/{password}")
	public JiraSoftwareConfiguration getJiraSoftwareConfigurationByPassword(@PathVariable String password) {
		return service.getJiraSoftwareConfigurationByPassword(password);
	}
	
	@PostMapping
	public JiraSoftwareConfiguration createJiraSoftwareConfiguration(@RequestBody JiraSoftwareConfiguration configuration) {
		return service.createJiraSoftwareConfiguration(configuration);
	}
	
	@PutMapping
	public JiraSoftwareConfiguration updateJiraSoftwareConfiguration(@RequestBody JiraSoftwareConfiguration configuration) {
		return service.updateJiraSoftwareConfiguration(configuration);
	}
	
	@DeleteMapping("/username/{username}")
	public ResponseEntity<?> deleteJiraSoftwareConfigurationByUserName(@PathVariable String username) {
		service.deleteJiraSoftwareConfigurationByUserName(username);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("/title/{title}")
	public ResponseEntity<?> deleteJiraSoftwareConfigurationByTitle(@PathVariable String title) {
		service.deleteJiraSoftwareConfigurationByTitle(title);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("/url/{url}")
	public ResponseEntity<?> deleteJiraSoftwareConfigurationByUrl(@PathVariable String url) {
		service.deleteJiraSoftwareConfigurationByUrl(url);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("/repositoryname/{repositoryname}")
	public ResponseEntity<?> deleteJiraSoftwareConfigurationByRepositoryName(@PathVariable String repositoryname) {
		service.deleteJiraSoftwareConfigurationByRepositoryName(