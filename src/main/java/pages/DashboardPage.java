package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {
	WebDriver driver;
	
	public DashboardPage (WebDriver driver) {
		this.driver= driver;
	}


////h5[contains(text(),'Add New Account')]

		//Element Library
	@FindBy(how= How.XPATH, using = "//span[contains(text(),'Bank & Cash')]")WebElement BankCash;
	@FindBy(how= How.XPATH, using = "//a[contains(text(),'New Account')]")WebElement NewAccount;

		public void clickBankCashButton() {
			BankCash.click();
		}
		public void clickNewAccountButton() {
			NewAccount.click();
		}
}
