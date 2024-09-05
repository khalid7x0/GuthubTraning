package GithubWeb;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.HomePage;
import OpjectPath.LoginOpjects;


public class GithubHomeTest extends BaseClass {

    String Username = "";
    String Password = "";
    @Test

    public void homeTest() throws InterruptedException {
        LoginPage loginPages= new LoginPage(driver);
        loginPages.login(driver,Username,Password);

HomePage homePage = new HomePage(driver);
homePage.clickDocs(driver);
        Assert.assertEquals(driver.findElement(By.id("title-h1")).getText(),"GitHub Docs");
    }
}
