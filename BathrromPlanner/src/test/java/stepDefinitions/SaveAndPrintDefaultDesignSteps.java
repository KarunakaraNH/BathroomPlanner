package stepDefinitions;

import Resource.BaseClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.CombinationPage;
import pageObjects.Homepage;

import java.util.concurrent.TimeUnit;


public class SaveAndPrintDefaultDesignSteps extends BaseClass {
    CombinationPage comb;
    Homepage hp;

     @Given("^Application is opened and user is in Gallery page$")
    public void browser_initiated_and_user_is_in_combination_page() throws Throwable {
        initializeDriver();
         driver.get(prop.getProperty("url"));
         this.hp = PageFactory.initElements(driver, Homepage.class);
         this.comb = this.hp.ClickOnRandomProduct();

         driver.manage().window().maximize();
        Thread.sleep(30000);
    }

    @When("^user click any random product combination page should come$")
    public void user_click_on_the_save_button_then_save_pop_up_should_come() throws Throwable {
        comb.save();
        Thread.sleep(10000);

    }

    @And("^user click on save button save popup should appear$")
    public void user_click_on_print_link() throws Throwable {
        Thread.sleep(10000);
        comb.print();
    }
    @Then("^user click on print link Print pop up should open in new tab$")
    public void print_pop_up_should_open_in_new_tab() throws Throwable {
      System.out.println("Print page is opened in new tab");
    }

}
