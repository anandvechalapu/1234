package com.sacral.1234.service;

import com.sacral.1234.repository.AboutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AboutService {
    @Autowired
    private AboutRepository aboutRepository;

    public boolean sendEmailToNDMWithoutLogin() {
        About about = aboutRepository.findBySendEmailWithoutLogin(true);
        if (about != null) {
            return true;
        }
        return false;
    }
}