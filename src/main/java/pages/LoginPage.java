package pages;

import OpjectPath.LoginOpjects;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginPage extends LoginOpjects {
WebDriver driver = null;
public LoginPage(WebDriver driver) {
    this.driver = driver;
}


//    public void openURL(WebDriver driver){
//        driver.get("https://tuwaiq.edu.sa/");
//    }
    public void login(WebDriver driver,String userName,String password) {
        driver.findElement(usernameloc).sendKeys(userName);
        driver.findElement(Passwordloc).sendKeys(password+ Keys.ENTER);
        //driver.findElement(loginbut).click();

}
}

