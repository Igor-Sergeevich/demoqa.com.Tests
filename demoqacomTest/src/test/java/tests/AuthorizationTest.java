package tests;

import Page.AuthorizationPage;
import org.testng.annotations.Test;


public class AuthorizationTest extends BaseTest {

    public AuthorizationTest(String url) {
        super("https://demoqa.com/login");

    }

    @Test
    public void checkPage() {
        AuthorizationPage authorizationPage = new AuthorizationPage();
        authorizationPage.checkAuthorizationPage();
    }

    @Test
    public void checkPositiveAuthorization() {
        AuthorizationPage authorizationPage = new AuthorizationPage();
        authorizationPage.checkAuthorization("name", "password");
    }

}
