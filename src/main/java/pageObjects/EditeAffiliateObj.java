package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class EditeAffiliateObj extends Base{
	
	public EditeAffiliateObj() {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy (xpath = " //a[contains(text(),'Edit your affiliate information')]")
		private WebElement editeAffilite;
	
	@FindBy (xpath = "//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/fieldset[2]/div[2]/div[1]/div[3]/label[1]/input[1]")
	private WebElement bankTransfer;
	
	@FindBy (xpath = "//input[@id='input-bank-name']")
	private WebElement bankName;
	
	@FindBy (xpath = "//input[@id='input-bank-branch-number']")
	private WebElement branchNum;
	
	@FindBy (xpath = "//input[@id='input-bank-swift-code']")
	private WebElement SwiftCode;
	
	@FindBy (xpath = "//input[@id='input-bank-account-name']")
	private WebElement acctName;
	
	@FindBy (xpath = "//input[@id='input-bank-account-number']")
	private WebElement acctNumber;
	
	@FindBy (xpath = "//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	private WebElement Continue;
	
	@FindBy (xpath = "//body/div[@id='account-account']/div[1]")
	private WebElement msgDisplay;
	
	
	public void editInfo() {
		WebDriverUtility.clickOnElement(editeAffilite);
	}
	
	public void bankTrans() {
		WebDriverUtility.clickOnElement(bankTransfer);
	
	}
	
	public void bankInfo(String BankNam) {
		WebDriverUtility.enterValue(bankName, "BNK");
		
	}
	
	public void BranchN(String BrName) {
		WebDriverUtility.enterValue(branchNum, "420");
	}
	
	public void SweiftCode(String Swift) {
		WebDriverUtility.enterValue(SwiftCode, "999");
		
	}
	public void accountName(String Nam) {
		WebDriverUtility.enterValue(acctName, "ABC");
	}
	
	public void AccountNum(String accNum) {
		WebDriverUtility.enterValue(acctNumber, "0234875204875");
		
	}
	
	public void continues() {
		WebDriverUtility.clickOnElement(Continue);
	}
		
	public void msg() {
		WebDriverUtility.isElementDisplayed(msgDisplay);
	}
}



