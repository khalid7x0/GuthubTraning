package pages;

import OpjectPath.LoginOpjects;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import OpjectPath.homeOpjects;

public class HomePage extends homeOpjects {
    WebDriver driver = null;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

//    public void openURL(WebDriver driver){
//        driver.get("https://tuwaiq.edu.sa/");
//    }
    public void clickDocs(WebDriver driver) {
        WebElement docs=driver.findElement(Docs);
        new Actions(driver)
                .scrollToElement(docs)
                .click(docs)
                .perform();

}
}

