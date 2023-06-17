package Step_Definition;

import Base.TestBase;
import Pages.EmployeeTimesheet_Pages;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class EmployeeTimesheet extends TestBase {
    //@Given("^I am on the HRM App$")
    //public void iAmOnTheHRMApp() {
    //}

    @When("^I click on the Time section$")
    public void iClickOnTheTimeSection() throws InterruptedException {
        EmployeeTimesheet_Pages Pages = PageFactory.initElements(driver,EmployeeTimesheet_Pages.class);
        Pages.ClickHRMTimeMenu();
        Thread.sleep(3000);
    }

    @And("^I click on the Timesheet sub-section$")
    public void iClickOnTheTimesheetSubSection() throws InterruptedException {
        EmployeeTimesheet_Pages Pages = PageFactory.initElements(driver,EmployeeTimesheet_Pages.class);
        Pages.ClickSubFeatureTimesheet();
        Thread.sleep(2000);
    }

    @And("^I select the Employee Timesheets sub-section$")
    public void iSelectTheEmployeeTimesheetsSubSection() throws InterruptedException {
        EmployeeTimesheet_Pages Pages = PageFactory.initElements(driver,EmployeeTimesheet_Pages.class);
        Pages.ClickOnEmployeeTimesheet();
        Thread.sleep(3000);
    }

    @Then("^I should be navigated to Select-Employee page$")
    public void iShouldBeNavigatedToSelectEmployeePage() throws InterruptedException {
        EmployeeTimesheet_Pages Pages = PageFactory.initElements(driver,EmployeeTimesheet_Pages.class);
        Pages.ConfirmEmployeeTimeSheetPage();
        Thread.sleep(3000);
    }



    @When("^I click on the Employee Name field$")
    public void iClickOnTheEmployeeNameField() throws InterruptedException {
        EmployeeTimesheet_Pages Pages = PageFactory.initElements(driver,EmployeeTimesheet_Pages.class);
        Pages.ClickOnNameFieldForSelectEmployee();

    }


    @And("^I click the View Button$")
    public void iClickTheViewButton() throws InterruptedException {
        EmployeeTimesheet_Pages Pages = PageFactory.initElements(driver,EmployeeTimesheet_Pages.class);
        Pages.ClickViewBtn();
        Thread.sleep(2000);
    }

    @Then("^I should get an error message$")
    public void iShouldGetAnErrorMessage() {
        EmployeeTimesheet_Pages Pages = PageFactory.initElements(driver,EmployeeTimesheet_Pages.class);
        Pages.AssertInvalidErrorMessage();
    }


    @When("^I click on the view button for Paul Collings$")
    public void iClickOnTheViewButtonForPaulCollings() {
        EmployeeTimesheet_Pages Pages = PageFactory.initElements(driver,EmployeeTimesheet_Pages.class);
        Pages.ClickViewButtonPC();
    }

    @Then("^I should get to Paul Collings timesheet page$")
    public void iShouldGetToPaulCollingsTimesheetPage() {
        EmployeeTimesheet_Pages Pages = PageFactory.initElements(driver,EmployeeTimesheet_Pages.class);
        Pages.AssertTimesheetPageForPC();
    }

    @And("^I click on timesheet period toggle button backward and forward$")
    public void iClickOnTimesheetPeriodToggleButtonBackwardAndForward() {
        EmployeeTimesheet_Pages Pages = PageFactory.initElements(driver,EmployeeTimesheet_Pages.class);
        Pages.ClickToggleButtonBackwards();
        Pages.ClickToggleButtonBKWAgain();
        Pages.ClickToggleButtonFWD();
    }


    @When("^I click on the Edit button for Paul Collings timesheet page$")
    public void iClickOnTheEditButtonForPaulCollingsTimesheetPage() {
        EmployeeTimesheet_Pages Pages = PageFactory.initElements(driver,EmployeeTimesheet_Pages.class);
        Pages.ClickEditButton();
    }

    @And("^I click on the delete icon button to delete a timesheet role$")
    public void iClickOnTheDeleteIconButtonToDeleteATimesheetRole() {
        EmployeeTimesheet_Pages Pages = PageFactory.initElements(driver,EmployeeTimesheet_Pages.class);
        Pages.ClickEditIconButton();

        }


    @When("^I Click on the cancel button$")
    public void iClickOnTheCancelButton() {
        EmployeeTimesheet_Pages Pages = PageFactory.initElements(driver,EmployeeTimesheet_Pages.class);
        Pages.ClickCancelButton();
    }

    @Then("^I should be take to my timesheet page$")
    public void iShouldBeTakeToMyTimesheetPage() {
        EmployeeTimesheet_Pages Pages = PageFactory.initElements(driver,EmployeeTimesheet_Pages.class);
        Pages.AssertTimesheetForPCPage();
    }

    @And("^I click on the Reset button$")
    public void iClickOnTheResetButton() {
        EmployeeTimesheet_Pages Pages = PageFactory.initElements(driver,EmployeeTimesheet_Pages.class);
        Pages.ClickResetButton();
    }

    @Then("^I should be navigated to the Edit page with the restored deleted timesheet role$")
    public void iShouldBeNavigatedToTheEditPageWithTheRestoredDeletedTimesheetRole() {
        EmployeeTimesheet_Pages Pages = PageFactory.initElements(driver,EmployeeTimesheet_Pages.class);
        Pages.AssertEditTimesheetPagePC();
    }

    @And("^I click on the Save button$")
    public void iClickOnTheSaveButton() {
        EmployeeTimesheet_Pages Pages = PageFactory.initElements(driver,EmployeeTimesheet_Pages.class);
        Pages.ClickSaveButton();
    }

    @Then("^I should be navigated to My time sheet page$")
    public void iShouldBeNavigatedToMyTimeSheetPage() {
        EmployeeTimesheet_Pages Pages = PageFactory.initElements(driver,EmployeeTimesheet_Pages.class);
        Pages.AssertTimesheet3Page();
        Pages.AssertPerformedActionForPC();
    }
}
