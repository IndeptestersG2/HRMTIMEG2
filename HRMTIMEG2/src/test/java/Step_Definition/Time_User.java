package Step_Definition;

import Base.TestBase;
import Pages.Time_pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class Time_User extends TestBase {

    @Given("^I click on the Time Menu$")
    public void iClickOnTheTimeMenu() throws InterruptedException {
        Time_pages pages = PageFactory.initElements(driver, Time_pages.class);
        pages.ClickTimeMenu();
        Thread.sleep(3000);

    }

    @Then("^I should see the Time/Timesheet page$")
    public void iShouldSeeTheTimeTimesheetPage() {
        Time_pages pages = PageFactory.initElements(driver, Time_pages.class);
        pages.AssertTimeMenu();
    }
}
