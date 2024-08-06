package tests;

import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = new LoginPage(driver);
        driver.get("http://localhost:4040");

        loginPage.enterUsername("newuser2");
        loginPage.enterPassword("newpassword");
        loginPage.clickLogin();

        assertTrue(driver.getTitle().contains("Dashboard"));
    }
}
