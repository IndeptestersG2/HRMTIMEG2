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
    public void iClickOnTheTimeSection() {
        EmployeeTimesheet_Pages Pages = PageFactory.initElements(driver,EmployeeTimesheet_Pages.class);
        Pages.ClickHRMTimeMenu();
    }

    @And("^I click on the Timesheet sub-section$")
    public void iClickOnTheTimesheetSubSection() {
        EmployeeTimesheet_Pages Pages = PageFactory.initElements(driver,EmployeeTimesheet_Pages.class);
        Pages.ClickSubFeatureTimesheet();
    }

    @And("^I select the Employee Timesheets sub-section$")
    public void iSelectTheEmployeeTimesheetsSubSection() {
        EmployeeTimesheet_Pages Pages = PageFactory.initElements(driver,EmployeeTimesheet_Pages.class);
        Pages.ClickOnEmployeeTimesheet();
    }

    @Then("^I should be navigated to Select-Employee page$")
    public void iShouldBeNavigatedToSelectEmployeePage() {
        EmployeeTimesheet_Pages Pages = PageFactory.initElements(driver,EmployeeTimesheet_Pages.class);
        Pages.ConfirmEmployeeTimeSheetPage();
    }



    @When("^I click on the Employee Name field$")
    public void iClickOnTheEmployeeNameField() {
        EmployeeTimesheet_Pages Pages = PageFactory.initElements(driver,EmployeeTimesheet_Pages.class);
        Pages.ClickOnNameFieldForSelectEmployee();
    }

    @And("^I type Fiona Grace on the Emplyee name field$")
    public void iTypeFionaGraceOnTheEmplyeeNameField() {
        EmployeeTimesheet_Pages Pages = PageFactory.initElements(driver,EmployeeTimesheet_Pages.class);
        Pages.EnterEmployeeUserName();
    }

    @And("^I click the View Button$")
    public void iClickTheViewButton() {
        EmployeeTimesheet_Pages Pages = PageFactory.initElements(driver,EmployeeTimesheet_Pages.class);
        Pages.ClickViewBtn();
    }

    @Then("^I should get an error message$")
    public void iShouldGetAnErrorMessage() {
        EmployeeTimesheet_Pages Pages = PageFactory.initElements(driver,EmployeeTimesheet_Pages.class);
        Pages.AssertInvalidErrorMessage();
    }


}
