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


}
