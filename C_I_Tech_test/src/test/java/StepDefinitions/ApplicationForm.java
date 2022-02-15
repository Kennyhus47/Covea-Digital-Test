package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import PageObjects.ApplicationFormPage;
import PageObjects.HomePage;
import PageObjects.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class ApplicationForm extends TestBase{

	WebDriver driver = getDriver();
	ApplicationFormPage formpage;
	HomePage homepage;

	@Before 
	public void Browser_Setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Given("I am on the Homepage")
	public void i_am_on_the_homepage() throws Throwable {
		
	}

	@Given("I click on My quote page Link")
	public void i_click_on_my_quote_page_link() throws Throwable {

	}

	@Given("The user is on the quote page")
	public void the_user_is_on_the_quote_page() throws Throwable {

	}

	@When("the dropdown is selected")
	public void the_dropdown_is_selected() throws Throwable {

	}

	@Then("user can select the title MR")
	public void user_can_select_the_title_mr() throws Throwable {

	}

	@When("an invalid email address \\\"([^\\\"]*)\\\" is entered$")
	public void an_invalid_email_address_is_entered(String email) throws Throwable {

	}
	@When("an invalid password \\\"([^\\\"]*)\\\" is entered$")
	public void an_invalid_password_is_entered(String passw) throws Throwable {

	}

	@Then("an error is displayed")
	public void an_error_is_displayed() throws Throwable {
		 
	}

	@When("a valid email address \\\"([^\\\"]*)\\\" entered$")
	public void a_valid_email_address_entered(String email) throws Throwable {

	}

	@When("a valid password \\\"([^\\\"]*)\\\" is entered$")
	public void a_valid_password_is_entered(String passw) throws Throwable {

	}

	@Then("no error is displayed")
	public void no_error_is_displayed() throws Throwable {

	}

	@When("they complete the Your Details Section and enter a valid postcode \\\"([^\\\"]*)\\\" and clicks find address$")
	public void they_complete_the_your_details_section_and_enter_a_valid_postcode_and_clicks_find_address(String postcode) throws Throwable {

	}

	@Then("a list of addresses is shown")
	public void a_list_of_addresses_is_shown() throws Throwable {
		
	}

	@When("I select dropdown button")
	public void i_select_dropdown_button() {

	}

	@When("I select the title MR")
	public void i_select_the_title_mr() {

	}

	@When("I enter Firstname \\\"([^\\\"]*)\\\" Surname \\\"([^\\\"]*)\\\" address \\\"([^\\\"]*)\\\" details$")
	public void i_enter_firstname_surname_address_details(String firstname, String surname, String email) {
	  
	}

	@When("I enter confirm email address \\\"([^\\\"]*)\\\" telephone \\\"([^\\\"]*)\\\" postcode \\\"([^\\\"]*)\\\" details$")
	public void i_enter_confirm_email_address_telephone_postcode_details(String confirmemail, String tel, String postcode) {
	 
	}

	@And("I click continue")
	public void i_click_continue() throws Throwable {

	}

	@Then("the summary page is displayed")
	public void the_summary_page_is_displayed() throws Throwable {
		 
	}

	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
