package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class hpLaptopObj extends Base{

	public hpLaptopObj() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
	private WebElement userIsOnDesktop;
	
	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement clickOnShowAllDesktop;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement clickAddToCartMenu;
	
	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement selectQty;
	
	@FindBy(xpath = "//button[@id='button-cart']") 
	private WebElement clickAddToCartButton;
	
	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement addSuccess;
	
	public void desktop () {
		userIsOnDesktop.click();
	}
	
	public void showAllDesktop() {
		clickOnShowAllDesktop.click();
	}
	
	public void addToCartMenu() {
		clickAddToCartMenu.click();
	}
	
	public void selectQty () {
		selectQty.sendKeys("1");
		
	}
	
	public void addToCart() {
		clickAddToCartButton.click();
	}
	
	public void success() {
		addSuccess.isDisplayed();
		
	}
	


}
