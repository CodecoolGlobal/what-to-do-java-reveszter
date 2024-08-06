package tests;

import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.ProfilePage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProfileTest extends BaseTest {

    @Test
    public void testViewProfile() {
        LoginPage loginPage = new LoginPage(driver);
        driver.get("http://localhost:4040");

        loginPage.enterUsername("newuser2");
        loginPage.enterPassword("newpassword");
        loginPage.clickLogin();

        ProfilePage profilePage = new ProfilePage(driver);

        assertEquals("newuser2", profilePage.getUsername());
    }
}