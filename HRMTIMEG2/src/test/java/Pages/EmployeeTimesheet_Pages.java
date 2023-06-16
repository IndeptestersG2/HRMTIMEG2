package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmployeeTimesheet_Pages {

    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a/span")
    public static WebElement ClickTimeMenu;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span")
    public static WebElement IClickTimeSheet;

    @FindBy(how = How.LINK_TEXT, using = "Employee Timesheets")
    public static WebElement IClickEmployeeTimesheet;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/h6")
    public static WebElement AssertEmployeeTimesheetPage;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/form/div[1]/div/div/div/div[2]/div/div/input")
    public static WebElement ClickUserNameField;


    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/form/div[2]/button")
    public static WebElement IClickViewButton;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/form/div[1]/div/div/div/span")
    public static WebElement ErrorMessageAssert;



    public void ClickHRMTimeMenu() {
        ClickTimeMenu.click();
    }

    public void ClickSubFeatureTimesheet() {
        IClickTimeSheet.click();
    }

    public void ClickOnEmployeeTimesheet() {
        IClickEmployeeTimesheet.click();
    }

    public void ConfirmEmployeeTimeSheetPage() {
        AssertEmployeeTimesheetPage.isDisplayed();
    }

    public void ClickOnNameFieldForSelectEmployee() {
        ClickUserNameField.click();
    }

    public void ClickViewBtn() {
        IClickViewButton.click();
    }

    public void AssertInvalidErrorMessage() {
        ErrorMessageAssert.isDisplayed();
        String ExpectedErrorMessage = "Required";
        String ActualErrorMessage = ErrorMessageAssert.getText();
        Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
        System.out.println(ActualErrorMessage);
    }
}


