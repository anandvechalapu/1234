·       User should be able to log out from the application without any issue.

@Repository
public interface LogoutRepository {
    
    void logoutUser();
    
    void redirectToLoginScreen();
    
    void clickFunctionalitiesOnPage();

}