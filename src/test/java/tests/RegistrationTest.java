package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegistrationTest extends BaseTest {

    @Test
    public void testSuccessfulRegistration() {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        driver.get("http://localhost:4040/register");

        registrationPage.enterUsername("newuser2");
        registrationPage.enterEmail("newuser2@example.com");
        registrationPage.enterPassword("newpassword");
        registrationPage.clickRegister();


        assertTrue(driver.getTitle().contains("Login"));
    }
}
