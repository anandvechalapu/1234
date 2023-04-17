package com.ctepl.anand.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctepl.anand.model.Branches;
import com.ctepl.anand.service.BranchesService;

@RestController
@RequestMapping("/branches")
public class BranchesController {

    @Autowired
    BranchesService branchesService;

    @GetMapping("/{number}")
    public Optional<Branches> getBranchByNumber(@PathVariable String number) {
        return branchesService.view(new Branches(number));
    }

    @GetMapping("/wholesaler/{wholesaler}")
    public List<Branches> getBranchesByWholesaler(@PathVariable String wholesaler) {
        return branchesService.findByWholesaler(wholesaler);
    }

    @PostMapping
    public Branches createBranch(@RequestBody Branches branches) {
        return branchesService.create(branches);
    }

    @PutMapping
    public Branches editBranch(@RequestBody Branches branches) {
        return branchesService.edit(branches);
    }
}