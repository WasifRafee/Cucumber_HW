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

public class StepDefinition extends TestBase {
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

	@When("^User enters the \"([^\"]*)\" in \"([^\"]*)\" field$")
	public void user_enters_the_in_field(String loginData, String field) {
		switch (field) {
		case "username" : 
			loginPage.enterUserName(loginData);
			break;
		case "password" : 
			loginPage.enterPassword(loginData);
			break;
		case "accountTitle" : 
			insertedTitle = loginData + generateRandomNum(999);
			newAccountPage.enterAccountTitle(insertedTitle);
			break;
		case "description":
			newAccountPage.enterAccountDescription(loginData);
			
		
		default: 
			System.out.println("No data");
			
			
		}
		
		
	}

	@When("^User clicks on signIn button$")
	public void user_clicks_on_signIn_button() {
		loginPage.clickSignInButton();
	}

	@Then("^User should land on Dashboard page$")
	public void user_should_land_on_Dashboard_page() {
		Assert.assertEquals("Dashboard- iBilling", loginPage.getPageTitle());
	}

	@Then("^User clicks the bankCash button$")
	public void user_clicks_the_bankCash_button() {
		dashboardPage.clickBankCashButton();
	}

	@Then("^User clicks the newAccount button$")
	public void user_clicks_the_newAccount_button() {
		dashboardPage.clickNewAccountButton();
	}

	
	

	@Then("^User clicks on submit button$")
	public void user_clicks_on_submit_button() {
	}

	@Then("^User should be able to validate account created successfully$")
	public void user_should_be_able_to_validate_account_created_successfully() {
	}




	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
