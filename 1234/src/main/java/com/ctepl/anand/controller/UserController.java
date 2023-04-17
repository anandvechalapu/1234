package com.ctepl.anand.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ctepl.anand.entity.Branches;
import com.ctepl.anand.entity.User;
import com.ctepl.anand.service.BranchesService;
import com.ctepl.anand.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private BranchesService branchesService;
	
	@PostMapping("/add-user")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
	
	@PostMapping("/edit-user")
	public void editUser(@RequestBody User user) {
		userService.editUser(user);
	}
	
	@PostMapping("/delete-user")
	public void deleteUser(@RequestBody User user) {
		userService.deleteUser(user);
	}
	
	@GetMapping("/search-user")
	public User searchUser(@RequestParam("userName") String userName) {
		return userService.searchUser(userName);
	}
	
	@GetMapping("/view-user-list")
	public List<User> viewUserList() {
		return userService.viewUserList();
	}
	
	@GetMapping("/download-user-list")
	public void downloadUserList() {
		userService.downloadUserList();
	}
	
	@PostMapping("/move-user-to-archived-data")
	public void moveUserToArchivedData(@RequestBody User user) {
		userService.moveUserToArchivedData(user);
	}
	
	@PostMapping("/activate-user")
	public void activateUser(@RequestBody User user) {
		userService.activateUser(user);
	}
	
	@GetMapping("/view-paginated-archived-users")
	public List<User> viewPaginatedArchivedUsers() {
		return userService.viewPaginatedArchivedUsers();
	}
	
	@GetMapping("/find-by-wholesaler-and-name")
	public Branches findByWholesalerAndName(@RequestParam("wholesaler") String wholesaler,
			@RequestParam("name") String name) {
		return branchesService.findByWholesalerAndName(wholesaler, name);
	}
	
	@GetMapping("/find-by-wholesaler-and-number")
	public Branches findByWholesalerAndNumber(@RequestParam("wholesaler") String wholesaler,
			@RequestParam("number") String number) {
		return branchesService.findByWholesalerAndNumber(wholesaler, number);
	}
	
	@GetMapping("/find-by-nfrn-region")
	public List<Branches> findByNFRNRegion(@RequestParam("NFRNRegion") String NFRNRegion) {
		return branchesService.findByNFRNRegion(NFRNRegion);
	}
	
	@GetMapping("/find-by-tv-region")
	public List<Branches> findByTVRegion(@RequestParam("TVRegion") String TVRegion) {
		return branchesService.findByTVRegion(TVRegion);
	}
	
	@GetMapping("/find-by-no-aatsat-values-and-active")
	public List<Branches> findByNoAATSATValuesAndActive(@RequestParam("NoAATSATValues") String No