package com.ctepl.anand.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctepl.anand.model.Branches;
import com.ctepl.anand.repository.BranchesRepository;

@Service
public class BranchesService {
	
	private BranchesRepository branchesRepository;
	
	@Autowired
	public BranchesService(BranchesRepository branchesRepository) {
		this.branchesRepository = branchesRepository;
	}
	
	public void create(Branches branches) {
		// Proper validation of the fields like name, number, address etc.
		if (validateBranches(branches)) {
			branchesRepository.save(branches);
		}
	}
	
	public void edit(Branches branches) {
		// Proper validation of the fields like name, number, address etc.
		if (validateBranches(branches)) {
			branchesRepository.save(branches);
		}
	}
	
	public Optional<Branches> view(long id) {
		return branchesRepository.findById(id);
	}
	
	public void deleteByNameAndWholesaler(String name, String wholesaler) {
		branchesRepository.deleteByNameAndWholesaler(name, wholesaler);
	}
	
	public void deleteByNumberAndWholesaler(String number, String wholesaler) {
		branchesRepository.deleteByNumberAndWholesaler(number, wholesaler);
	}
	
	public boolean existsByNameAndWholesaler(String name, String wholesaler) {
		return branchesRepository.existsByNameAndWholesaler(name, wholesaler);
	}
	
	public boolean existsByNumberAndWholesaler(String number, String wholesaler) {
		return branchesRepository.existsByNumberAndWholesaler(number, wholesaler);
	}
	
	public Branches findByName(String name) {
		return branchesRepository.findByName(name);
	}
	
	public Branches findByNumber(String number) {
		return branchesRepository.findByNumber(number);
	}
	
	public Branches findByWholesalerAndName(String wholesaler, String name) {
		return branchesRepository.findByWholesalerAndName(wholesaler, name);
	}
	
	public Branches findByNumberAndWholesaler(String number, String wholesaler) {
		return branchesRepository.findByNumberAndWholesaler(number, wholesaler);
	}
	
	public Branches findByNameAndWholesaler(String name, String wholesaler) {
		return branchesRepository.findByNameAndWholesaler(name, wholesaler);
	}
	
	public List<Branches> findAll() {
		return branchesRepository.findAll();
	}
	
	public void downloadBranchesAsCsvFile() {
		// Ability to download the branches as format of .csv file.
		// Code to download the branches as csv file
	}
	
	private boolean validateBranches(Branches branches) {
		// Proper validation of the fields like name, number, address etc.
		// Code to validate the branches fields
		return true;
	}
}