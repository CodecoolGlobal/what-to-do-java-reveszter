package tests;

import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.TasksPage;
import pages.UpdateTaskPage;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TasksTest extends BaseTest {

    @Test
    public void testAddTask() {
        LoginPage loginPage = new LoginPage(driver);
        driver.get("http://localhost:4040/login");

        loginPage.enterUsername("newuser2");
        loginPage.enterPassword("newpassword");
        loginPage.clickLogin();

        TasksPage tasksPage = new TasksPage(driver);
        driver.get("http://localhost:4040/dashboard");

        tasksPage.enterTask("New Task");
        tasksPage.clickSubmitTask();

        assertTrue(tasksPage.isTaskDisplayed("New Task"));
    }

    @Test
    public void testUpdateTask() {
        LoginPage loginPage = new LoginPage(driver);
        driver.get("http://localhost:4040/login");

        loginPage.enterUsername("newuser2");
        loginPage.enterPassword("newpassword");
        loginPage.clickLogin();

        TasksPage tasksPage = new TasksPage(driver);
        driver.get("http://localhost:4040/dashboard");

        tasksPage.enterTask("Task to Update");
        tasksPage.clickSubmitTask();

        tasksPage.clickUpdateTask("Task to Update");

        UpdateTaskPage updateTaskPage = new UpdateTaskPage(driver);
        updateTaskPage.enterTaskContent("Updated Task");
        updateTaskPage.clickSubmitTask();

        assertTrue(tasksPage.isTaskDisplayed("Updated Task"));
    }

    @Test
    public void testDeleteTask() {
        LoginPage loginPage = new LoginPage(driver);
        driver.get("http://localhost:4040/login");

        loginPage.enterUsername("newuser2");
        loginPage.enterPassword("newpassword");
        loginPage.clickLogin();

        TasksPage tasksPage = new TasksPage(driver);
        driver.get("http://localhost:4040/dashboard");

        tasksPage.enterTask("Task to Delete");
        tasksPage.clickSubmitTask();

        assertTrue(tasksPage.isTaskDisplayed("Task to Delete"));

        tasksPage.clickDeleteTask("Task to Delete");

        assertFalse(tasksPage.isTaskDisplayed("Task to Delete"));
    }
}
