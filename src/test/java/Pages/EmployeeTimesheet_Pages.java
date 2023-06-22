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

    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[3]/div/div[3]/div/button")
    public static WebElement ViewButtonPaulC;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[2]/div[2]/div/form/div[1]/div[1]/h6")
    public static WebElement AssertTimeSheetPagePC;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[1]/div[2]/div/button[1]/i")
    public static WebElement ToggleButtonBackWards;

   // @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[1]/div[2]/div/button[1]/i")
    //public static WebElement ToggleButtonBackWards2;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[1]/div[2]/div/button[2]/i")
    public static WebElement ToggleButtonForward;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/button")
    public static WebElement EditButtonPC;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[10]/button/i")
    public static WebElement EditIconBtn;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/button[1]")
    public static WebElement CancelButton;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[2]/div[2]/div/form/div[1]/div[1]/h6")
    public static WebElement AssertTimeSheetPagePC2;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/button")
    public static WebElement EditButtonAgain;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/button[2]")
    public static WebElement ResetButton;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[2]/div[2]/div/form/div[1]/div[1]/h6")
    public static WebElement AssertEditTimesheetPage;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/button[3]")
    public static WebElement SaveButton;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[2]/div[2]/div/form/div[1]/div[1]/h6")
    public static WebElement AssertTimeSheetPagePC3;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[2]/div[2]/div/div/div[1]/h6")
    public static WebElement AssertPerformedAction;



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

    public void ClickViewButtonPC() {
        ViewButtonPaulC.click();
    }

    public void AssertTimesheetPageForPC() {
        AssertTimeSheetPagePC.isDisplayed();
        String ExpectedDisplayPage = "Timesheet for Paul Collings";
        String ActualDisplayPage = AssertTimeSheetPagePC.getText();
        Assert.assertEquals(ExpectedDisplayPage, ActualDisplayPage);
        System.out.println(ActualDisplayPage);
    }

    public void ClickToggleButtonBackwards() {
        ToggleButtonBackWards.click();
    }

    public void ClickToggleButtonFWD() {
        ToggleButtonForward.click();
    }

    public void ClickEditButton() {
        EditButtonPC.click();
    }

    public void ClickEditIconButton() {
        EditIconBtn.click();
    }

    public void ClickCancelButton() {
       CancelButton.click();
    }

    public void AssertTimesheetForPCPage() {
        AssertTimeSheetPagePC2.isDisplayed();
        String ExpectedDisplayPage = "My Timesheet";
        String ActualDisplayPage = AssertTimeSheetPagePC2.getText();
        Assert.assertEquals(ExpectedDisplayPage, ActualDisplayPage);
        System.out.println(ActualDisplayPage);
    }

    public void ClickEditButtonAgain() {
        EditButtonAgain.click();
    }

    public void ClickResetButton() {
      ResetButton.click();
    }

    public void AssertEditTimesheetPagePC() {
        AssertEditTimesheetPage.getText();
        String ExpectedDisplayPage = "Edit Timesheet";
        String ActualDisplayPage = AssertEditTimesheetPage.getText();
        Assert.assertEquals(ExpectedDisplayPage, ActualDisplayPage);
        System.out.println(ActualDisplayPage);

    }

    public void ClickSaveButton() {
       SaveButton.click();
    }

    public void AssertTimesheet3Page() {
        AssertTimeSheetPagePC3.isDisplayed();
    }

    public void AssertPerformedActionForPC() {
        AssertPerformedAction.getText();
        String ExpectedDisplayPage = "Actions Performed on the Timesheet";
        String ActualDisplayPage = AssertPerformedAction.getText();
        Assert.assertEquals(ExpectedDisplayPage, ActualDisplayPage);
        System.out.println(ActualDisplayPage);
    }
}





