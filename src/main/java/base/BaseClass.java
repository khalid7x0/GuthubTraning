package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
    public WebDriver driver;

@BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/.idea/Driver/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.getCurrentUrl();
        driver.get("https://github.com/login");
    }

@AfterClass
    public void teardown() throws InterruptedException {
    driver.quit();
    }
}
