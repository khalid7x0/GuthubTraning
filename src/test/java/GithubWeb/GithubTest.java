package GithubWeb;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import io.qameta.allure.*;




public class GithubTest extends BaseClass {
String Username = "";
String Password = "";
    @Test
    @Epic("Docs flow")
    @Feature("Log in ")
    @Story("User can see documentions")
    @Owner("khalid")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Test that verifies a user cannot enter the page without logging in")
    public void homeTest()  {
        LoginPage loginPages= new LoginPage(driver);
        loginPages.login(driver,Username,Password);
    }

}
