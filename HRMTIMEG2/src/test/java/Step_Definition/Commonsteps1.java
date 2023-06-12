package Step_Definition;

import Base.TestBase;
import Pages.Time_pages;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Commonsteps1 extends TestBase {

    @Before
    public void setup() throws IOException{
        initialize();
    }



    @Given("^I am on the HRM application$")
    public void iAmOnTheHRMApplication() {
        driver.manage() .deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();

        }


    @And("^I login$")
    public void iLogin() throws InterruptedException {
        Time_pages pages = PageFactory.initElements(driver, Time_pages.class);
        pages.EnterLoginUsername();
        pages.EnterLoginPassword();
        pages.ClickLoginBtn();
        Thread.sleep(3000);



    }
}
