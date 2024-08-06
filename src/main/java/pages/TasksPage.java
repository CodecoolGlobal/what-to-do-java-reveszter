package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage extends BasePage {

    @FindBy(id = "content")
    private WebElement taskField;

    @FindBy(xpath = "//input[@type='submit' and @value='Submit Task']")
    private WebElement submitTaskButton;

    @FindBy(xpath = "//button[text()='Logout']")
    private WebElement logoutButton;

    public TasksPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterTask(String taskContent) {
        waitForElement(taskField);
        taskField.sendKeys(taskContent);
    }

    public void clickSubmitTask() {
        waitForElement(submitTaskButton);
        submitTaskButton.click();
    }

    public void clickLogout() {
        waitForElement(logoutButton);
        logoutButton.click();
    }

    public boolean isTaskDisplayed(String taskContent) {
        try {
            return driver.findElement(By.xpath("//td[text()='" + taskContent + "']")).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void clickUpdateTask(String taskContent) {
        String xpath = "//td[text()='" + taskContent + "']/following-sibling::td/a[text()='Update']";
        WebElement updateLink = driver.findElement(By.xpath(xpath));
        waitForElement(updateLink);
        updateLink.click();
    }

    public void clickDeleteTask(String taskContent) {
        WebElement deleteLink = driver.findElement(By.xpath("//td[text()='" + taskContent + "']/following-sibling::td/a[text()='Delete']"));
        waitForElement(deleteLink);
        deleteLink.click();
    }
}
