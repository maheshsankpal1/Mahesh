package tests;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {

    private LoginPage loginPage;
    private HomePage homePage;

    @BeforeMethod
    public void setUpTest() {
        setup();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @Test
    public void sampleFlow() {
        // This is an example. Replace with real locators and data for your app.
        // If example.com doesn't have these fields, test will fail.
        // For demo, we'll just verify page title contains 'Example Domain' (example.com)
        System.out.println("Running sampleFlow test..."); // Git test change

        String title = driver.getTitle();
        System.out.println("Page title: " + title);
        Assert.assertTrue(title.length() > 0, "Title should not be empty");
    }

    @AfterMethod
    public void tearDownTest() {
        tearDown();
    }
}
