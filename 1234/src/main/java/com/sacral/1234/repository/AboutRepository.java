·       User should be able to send email to NDM without login.

package com.sacral.1234.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutRepository extends JpaRepository<About, Long> {
    About findByIntroduction(String introduction);
    About findByGoals(String goals);
    About findByEmailUsOption(String emailUsOption);
    About findByAccessWithoutLogin(Boolean accessWithoutLogin);
    About findBySendEmailWithoutLogin(Boolean sendEmailWithoutLogin);
    About findByLinkToMainANMWWebsite(String linkToMainANMWWebsite);
}