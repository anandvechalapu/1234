·       Ability to click the ‘Help’ option from the header menu.·       Ability to access the 6 features information.

package com.sacral.1234.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HelpRepository extends JpaRepository<Help, Long> {
    
    //Method to find help page by clicking the 'Help' option from the header menu
    Help findByHeaderMenuOption(String headerMenuOption);
    
    //Method to find the 6 features information by clicking the functionalities displayed on page
    Help findByFunctionalities(String functionalities);
    
    //Method to access the 6 features information
    Help findByFeaturesInformation(String featuresInformation);
}