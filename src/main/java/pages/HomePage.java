package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By welcomeText = By.tagName("h1"); // example locator

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getWelcomeText() {
        return driver.findElement(welcomeText).getText();
    }
}
