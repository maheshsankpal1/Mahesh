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
        System.out.println("Running 1");
        System.out.println("Running 2");
        System.out.println("Running 3");

        String title = driver.getTitle();
        System.out.println("Page title: " + title);
        Assert.assertTrue(title.length() > 0, "Title should not be empty");
        
        System.out.println("Branch develop");
        System.out.println("Branch develop2");
        System.out.println("Branch develop3");
        System.out.println("Branch develop4");

    }

    @AfterMethod
    public void tearDownTest() {
        tearDown();
    }
}
