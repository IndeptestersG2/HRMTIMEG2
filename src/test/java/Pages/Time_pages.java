package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Time_pages {

    @FindBy(how = How.NAME, using = "username")
    public static WebElement UserNamesLoginField;

    @FindBy(how = How.NAME, using = "password")
    public static WebElement passwordLoginField;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    public static WebElement LoginButton;


    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a/span")
    public static WebElement TimeMenuButton;


    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6[2]")
    public static WebElement AssertTimeMeunPage;


    public void EnterLoginUsername() {
        UserNamesLoginField.sendKeys("Admin");
    }

    public void EnterLoginPassword() {
        passwordLoginField.sendKeys("admin123");
    }

    public void ClickLoginBtn() {
        LoginButton.click();
    }

    public void ClickTimeMenu() {
        TimeMenuButton.click();
    }

    public void AssertTimeMenu() {
       AssertTimeMeunPage.isDisplayed();
    }
}


















