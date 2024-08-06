package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BasePage {

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@type='submit' and @value='Register']")
    private WebElement registerButton;

    public RegistrationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username) {
        waitForElement(usernameField);
        usernameField.sendKeys(username);
    }

    public void enterEmail(String email) {
        waitForElement(emailField);
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        waitForElement(passwordField);
        passwordField.sendKeys(password);
    }

    public void clickRegister() {
        waitForElement(registerButton);
        registerButton.click();
    }
}
