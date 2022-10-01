package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewAccountPage {
	WebDriver driver;
	
	public NewAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Element Library
	@FindBy(how = How.XPATH, using = "//input[@id='account']")WebElement AccountTitle;
	@FindBy(how = How.XPATH, using = "//input[@id='description']")WebElement Description;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")WebElement Balance;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")WebElement AccountNumber;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']")WebElement ContactPerson;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")WebElement ContactPhone;
	@FindBy(how = How.XPATH, using = "//input[@id='ib_url']")WebElement InternetBankingURL;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),' Submit')]")WebElement SubmitButton;
	@FindBy(how = How.XPATH, using = "//div[i[normalize-space(contains(text(),'Account Created Successfully'))]]")WebElement Validation;
	
	
	public void enterAccountTitle(String accountTitle) {
		AccountTitle.sendKeys(accountTitle);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void enterAccountDescription(String description) {
		Description.sendKeys(description);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void enterBalance(String balance) {
		Balance.sendKeys(balance);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void enterAccountNumber(String accountNumber) {
		AccountNumber.sendKeys(accountNumber);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void enterContactPerson(String contactPerson) {
		ContactPerson.sendKeys(contactPerson);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void enterContactPhone(String contactPhone) {
		ContactPhone.sendKeys(contactPhone);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void enterInternetBankingURL(String internetBankingURL) {
		InternetBankingURL.sendKeys(internetBankingURL);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
	public void clickSubmitButton() {
		SubmitButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public boolean accountPageValidation() {
		return Validation.isDisplayed();
					
	}
	
	
	
}
