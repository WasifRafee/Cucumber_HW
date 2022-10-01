package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.DashboardPage;
import pages.LoginPage;
import pages.NewAccountPage;
import pages.TestBase;

public class StepDefinition extends TestBase{
	LoginPage loginPage;
	DashboardPage dashboardPage;
	NewAccountPage newAccountPage;
	String insertedTitle;
	@Before
	public void setUp() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		newAccountPage = PageFactory.initElements(driver, NewAccountPage.class);
	}
	@Given("^User is on the techfios login page$") 
	public void user_is_on_the_techfios_login_page() {
		driver.get("https://techfios.com/billing/?ng=admin/");
	}
	
	@When("^User enters the username as \"([^\"]*)\"$")
	public void user_enters_the_username_as(String username) {
	  loginPage.enterUserName(username);
	}

	@When("^User enters the password as \"([^\"]*)\"$")
	public void user_enters_the_password_as(String password)  {
	 loginPage.enterPassword(password);
	}


	@And("^User clicks on signIn button$")
	public void user_clicks_on_signIn_button()  {
	  loginPage.clickSignInButton();
	}

	@Then("^User should land on Dashboard page$")
	public void user_should_land_on_Dashboard_page()  {
		Assert.assertEquals("Dashboard- iBilling", loginPage.getPageTitle());
	}

	@And("^User clicks the bankCash button$")
	public void user_clicks_the_bankCash_button() {
		dashboardPage.clickBankCashButton();
	}

	@And("^User clicks the newAccount button$")
	public void user_clicks_the_newAccount_button(){
		dashboardPage.clickNewAccountButton();
	}

	@And("^User enters accountTitle as \"([^\"]*)\"in accounts page$")
	public void user_enters_accountTitle_as_in_accounts_page(String accountTitle) {
		insertedTitle= accountTitle+generateRandomNum(999);
		newAccountPage.enterAccountTitle(insertedTitle);
	}

	@And("^User enters description as \"([^\"]*)\"in accounts page$")
	public void user_enters_description_as_in_accounts_page(String description) {
		newAccountPage.enterAccountDescription(description);
	}

	@And("^User enters initialBalance as \"([^\"]*)\"in accounts page$")
	public void user_enters_initialBalance_as_in_accounts_page(String initialBalance) {
		newAccountPage.enterBalance(initialBalance);
	}

	@And("^User enters accountNumber as \"([^\"]*)\"in accounts page$")
	public void user_enters_accountNumber_as_in_accounts_page(String accountNumber) {
		newAccountPage.enterAccountNumber(accountNumber);
	}

	@And("^User enters contactPerson as \"([^\"]*)\"in accounts page$")
	public void user_enters_contactPerson_as_in_accounts_page(String contactPerson){
		newAccountPage.enterContactPerson(contactPerson);
	}

	@And("^User enters Phone as \"([^\"]*)\"in accounts page$")
	public void user_enters_Phone_as_in_accounts_page(String contactPhone) {
		newAccountPage.enterContactPhone(contactPhone);
	}

	@And("^User enters internetBankingURL as \"([^\"]*)\"in accounts page$")
	public void user_enters_internetBankingURL_as_in_accounts_page(String internetBankingURL) {
		newAccountPage.enterInternetBankingURL(internetBankingURL);
	}


	@And("^User clicks on submit button$")
	public void user_clicks_on_submit_button()  {
	 newAccountPage.clickSubmitButton();
	}

	@Then("^User should be able to validate account created successfully$")
	public void user_should_be_able_to_validate_account_created_successfully()  {
		Assert.assertTrue("Page not Found", newAccountPage.accountPageValidation());
	}
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
