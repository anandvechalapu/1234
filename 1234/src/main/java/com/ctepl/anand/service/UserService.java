package com.ctepl.anand.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctepl.anand.model.Users;
import com.ctepl.anand.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<Users> getAllUsers(){
		return userRepository.findAll();
	}
	
	public Users findUserByUserName(String userName){
		return userRepository.findByUserName(userName);
	}
	
	public Users findUserByPassword(String password){
		return userRepository.findByPassword(password);
	}
	
	public Users findUserByLevel(String level){
		return userRepository.findByLevel(level);
	}
	
	public Users findUserByParentType(String parentType){
		return userRepository.findByParentType(parentType);
	}
	
	public Users findUserByWholesaler(String wholesaler){
		return userRepository.findByWholesaler(wholesaler);
	}
	
	public Users findUserByBranch(String branch){
		return userRepository.findByBranch(branch);
	}
	
	public Users findUserByFirstName(String firstName){
		return userRepository.findByFirstName(firstName);
	}
	
	public Users findUserByLastName(String lastName){
		return userRepository.findByLastName(lastName);
	}
	
	public Users findUserByCompany(String company){
		return userRepository.findByCompany(company);
	}
	
	public Users findUserByPostcode(String postcode){
		return userRepository.findByPostcode(postcode);
	}
	
	public Users findUserByTelephoneNo(String telephoneNo){
		return userRepository.findByTelephoneNo(telephoneNo);
	}
	
	public Users findUserByEmailAddress(String emailAddress){
		return userRepository.findByEmailAddress(emailAddress);
	}
	
	public Users findUserByDateCreated(String dateCreated) {
		return userRepository.findByDateCreated(dateCreated);
	}
	
	public Users findUserByLastModified(String lastModified) {
		return userRepository.findByLastModified(lastModified);
	}
	
	public void editUser(Users user) {
		userRepository.save(user);
	}
	
	public void viewUser(String userName) {
		Users user = userRepository.findByUserName(userName);
		String userDetails = user.getUserName() + " " + user.getPassword() + " " + user.getLevel() + " " + user.getParentType() + " " + user.getWholesaler() + " " + user.getBranch() + " " + user.getFirstName() + " " + user.getLastName() + " " + user.getCompany() + " " + user.getPostcode() + " " + user.getTelephoneNo() + " " + user.getEmailAddress() + " " + user.getDateCreated() + " " + user.getLastModified();
		System.out.println(userDetails);
	}
	
	public void downloadData(String userName) {
		Users user = userRepository.findByUserName(userName);
		String userDetails = user.getUserName() + " " + user.getPassword() + " " + user.getLevel() + " " + user.getParentType() + " " + user.getWholesaler() + " " + user.getBranch() + " " + user.getFirstName() + " " + user.getLastName() + " " + user.getCompany() + " " + user.getPostcode() + " " + user.getTelephoneNo() + " " + user.getEmailAddress() + " " + user.getDateCreated() + " " + user.getLastMod