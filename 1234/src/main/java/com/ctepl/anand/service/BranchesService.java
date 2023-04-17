package com.ctepl.anand.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctepl.anand.model.Branches;
import com.ctepl.anand.repository.BranchesRepository;

@Service
public class BranchesService {

    @Autowired
    BranchesRepository branchesRepository;

    // Create Method
    public Branches create(Branches branches) {
        if(!branchesRepository.existsById(branches.getNumber())) {
            return branchesRepository.save(branches);
        }
        return null;
    }

    // Edit Method
    public Branches edit(Branches branches) {
        if(branchesRepository.existsById(branches.getNumber())) {
            return branchesRepository.save(branches);
        }
        return null;
    }
    
    // View Method
    public Branches view(Branches branches) {
        if(branchesRepository.existsById(branches.getNumber())) {
            return branchesRepository.findById(branches.getNumber()).get();
        }
        return null;
    }

    // Download Method
    public void download(Branches branches) {
        if(branchesRepository.existsById(branches.getNumber())) {
            List<Branches> branchesList = branchesRepository.findAll();
            //Write the branchesList to a .csv file
        }
    }
}