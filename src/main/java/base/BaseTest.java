package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;
import utils.ConfigReader;

public class BaseTest {

    protected WebDriver driver;
    protected ConfigReader config = new ConfigReader();

    public void setup() {
        String browser = config.get("browser").trim().toLowerCase();
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            // default to chrome
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(config.get("baseURL"));
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
