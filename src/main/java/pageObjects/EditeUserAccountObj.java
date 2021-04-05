package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class EditeUserAccountObj extends Base{

	public EditeUserAccountObj () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[contains(text(),'Edit your account information')]")
		private WebElement EditAccount;
	
	@FindBy (xpath = "//input[@id='input-firstname']")
	private WebElement fName;
	
	@FindBy (xpath = "//input[@id='input-lastname']")
	private WebElement lName;
	
	@FindBy (xpath = "//input[@id='input-email']")
	private WebElement emails;
	
	@FindBy (xpath = "//input[@id='input-telephone']")
	private WebElement phone;
	
	@FindBy (xpath = "//body/div[@id='account-edit']/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")
	private WebElement continues;
	
	@FindBy (xpath = "//body/div[@id='account-account']/div[1]")
	private WebElement msgSuccess;
	
	public void editeAccount() {
		WebDriverUtility.clickOnElement(EditAccount);
	}
	
	public void firstName(String FName) {
		WebDriverUtility.enterValue(fName, "John");
	}
	
	public void lastName (String LName) {
		WebDriverUtility.enterValue(lName, "Khans");
	}
	
	public void Email(String email){
		WebDriverUtility.enterValue(emails,"jonkhan@gmail.com");
	}
		
	public void phone(){
		WebDriverUtility.enterValue(phone, "same");
		
	}
	public void Continue(String Contt) {
		WebDriverUtility.clickOnElement(continues);
	}
		
	public void Success() {
		WebDriverUtility.isElementDisplayed(msgSuccess);
		
	}
	
	
	
	
	
		
		
	
	
}

