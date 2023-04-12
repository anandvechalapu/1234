package com.ctepl.anand.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctepl.anand.entity.JiraSoftwareConfiguration;
import com.ctepl.anand.repository.JiraSoftwareRepository;

@Service
public class JiraSoftwareService {
	
	@Autowired
	private JiraSoftwareRepository repository;
	
	public List<JiraSoftwareConfiguration> getAllJiraSoftwareConfigurations() {
		return repository.findAll();
	}
	
	public JiraSoftwareConfiguration getJiraSoftwareConfigurationByUserName(String userName) {
		return repository.findByUserName(userName);
	}
	
	public JiraSoftwareConfiguration getJiraSoftwareConfigurationByTitle(String title) {
		return repository.findByTitle(title);
	}
	
	public JiraSoftwareConfiguration getJiraSoftwareConfigurationByUrl(String url) {
		return repository.findByUrl(url);
	}
	
	public JiraSoftwareConfiguration getJiraSoftwareConfigurationByRepositoryName(String repositoryName) {
		return repository.findByRepositoryName(repositoryName);
	}
	
	public JiraSoftwareConfiguration getJiraSoftwareConfigurationByPassword(String password) {
		return repository.findByPassword(password);
	}
	
	public JiraSoftwareConfiguration createJiraSoftwareConfiguration(JiraSoftwareConfiguration configuration) {
		return repository.save(configuration);
	}
	
	public JiraSoftwareConfiguration updateJiraSoftwareConfiguration(JiraSoftwareConfiguration configuration) {
		return repository.save(configuration);
	}
	
	public void deleteJiraSoftwareConfigurationByUserName(String userName) {
		repository.deleteByUserName(userName);
	}
	
	public void deleteJiraSoftwareConfigurationByTitle(String title) {
		repository.deleteByTitle(title);
	}
	
	public void deleteJiraSoftwareConfigurationByUrl(String url) {
		repository.deleteByUrl(url);
	}
	
	public void deleteJiraSoftwareConfigurationByRepositoryName(String repositoryName) {
		repository.deleteByRepositoryName(repositoryName);
	}
	
	public void deleteJiraSoftwareConfigurationByPassword(String password) {
		repository.deleteByPassword(password);
	}
	
	public Optional<JiraSoftwareConfiguration> findJiraSoftwareConfigurationById(Long id) {
		return repository.findById(id);
	}
}