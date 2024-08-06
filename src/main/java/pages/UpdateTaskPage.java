package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateTaskPage extends BasePage {

    @FindBy(id = "content")
    private WebElement taskField;

    @FindBy(xpath = "//input[@type='submit' and @value='Submit Task']")
    private WebElement submitTaskButton;

    public UpdateTaskPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterTaskContent(String content) {
        waitForElement(taskField);
        taskField.clear();
        taskField.sendKeys(content);
    }

    public void clickSubmitTask() {
        waitForElement(submitTaskButton);
        submitTaskButton.click();
    }
}
