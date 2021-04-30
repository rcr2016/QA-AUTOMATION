package login;

import base.BaseTests;
import pages.LoginPage;
import pages.SecureAreaPage;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage =  loginPage.clickLoginButton();
        assertEquals(secureAreaPage.getAlertText(), "You logged into a secure area! x", "Alert text is incorrect");
    }
}
