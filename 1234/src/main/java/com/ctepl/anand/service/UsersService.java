package com.ctepl.anand.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctepl.anand.model.Users;
import com.ctepl.anand.repository.UsersRepository;

@Service("usersService")
public class UsersService {

	@Autowired
	private UsersRepository usersRepository;
	
	public Optional<Users> findByUserName(String userName) {
		return usersRepository.findByUserName(userName);
	}
	
	public List<Users> findByParentType(String parentType) {
		return usersRepository.findByParentType(parentType);
	}
	
	public List<Users> findByWholesaler(String wholesaler) {
		return usersRepository.findByWholesaler(wholesaler);
	}
	
	public List<Users> findByBranch(String branch) {
		return usersRepository.findByBranch(branch);
	}
	
	public void archiveById(Long id) {
		usersRepository.archiveById(id);
	}
	
	public void activateById(Long id) {
		usersRepository.activateById(id);
	}
	
	public void deleteById(Long id) {
		usersRepository.deleteById(id);
	}
}