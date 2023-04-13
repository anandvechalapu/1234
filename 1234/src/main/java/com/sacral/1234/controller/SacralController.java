package com.sacral.1234.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.1234.model.About;
import com.sacral.1234.model.Help;
import com.sacral.1234.service.AboutService;
import com.sacral.1234.service.HelpService;
import com.sacral.1234.service.LogoutService;

@RestController
@RequestMapping("/1234")
public class SacralController {

    @Autowired
    private AboutService aboutService;

    @Autowired
    private HelpService helpService;

    @Autowired
    private LogoutService logoutService;

    //API to access and read About page without login
    @GetMapping("/about")
    public About getAbout() {
        return aboutService.sendEmailToNDMWithoutLogin();
    }

    //API to access and read Help page without login
    @GetMapping("/help/{id}")
    public Optional<Help> getHelpById(@PathVariable Long id) {
        return helpService.getHelpById(id);
    }

    //API to read list of 6 features information from Help page
    @GetMapping("/help")
    public List<Help> getAllHelp() {
        return helpService.getAllHelp();
    }

    //API to access and read 6 features information from Help page
    @GetMapping("/help/functionalities/{functionalities}")
    public Optional<Help> getHelpByFunctionalities(@PathVariable String functionalities) {
        return helpService.findByFunctionalities(functionalities);
    }

    //API to access and read 6 features information from Help page
    @GetMapping("/help/features/{featuresInformation}")
    public Optional<Help> getHelpByFeaturesInformation(@PathVariable String featuresInformation) {
        return helpService.findByFeaturesInformation(featuresInformation);
    }

    //API to logout user from the application after clicking the Logout button.
    @PostMapping("/logout")
    public void logout() {
        logoutService.logout();
    }

}