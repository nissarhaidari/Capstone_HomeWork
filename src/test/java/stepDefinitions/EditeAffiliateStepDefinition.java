package stepDefinitions;

import org.openqa.selenium.WebElement;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.EditeAffiliateObj;
import utilities.WebDriverUtility;

public class EditeAffiliateStepDefinition extends Base{
	
	EditeAffiliateObj editeAff = new EditeAffiliateObj();
	
	@When("^User click on ‘Edit your affiliate informationlink$")
	public void user_click_on_Edit_your_affiliate_informationlink() throws Throwable {
		editeAff.editInfo();
		logger.info("User should click on Edite");
		WebDriverUtility.wait(2000);
		WebDriverUtility.screenShot();
	}

	@When("^user click on Bank Transfer radio button$")
	public void user_click_on_Bank_Transfer_radio_button() throws Throwable {
		editeAff.bankTrans();
		logger.info("User should click on bank Transfer");
		WebDriverUtility.wait(2000);
		WebDriverUtility.screenShot();
	}

	@When("^User fill Bank information with below information$")
	public void user_fill_Bank_information_with_below_information(DataTable arg1) throws Throwable {
		editeAff.bankInfo("BNK");
		editeAff.BranchN("430");
		editeAff.SweiftCode("999");
		editeAff.accountName("ABC");
		editeAff.AccountNum("0234875204875");
		
		logger.info("User should fill the information");
		WebDriverUtility.wait(2000);
		WebDriverUtility.screenShot();
	}

	@Then("^User should see a success messag$")
	public void user_should_see_a_success_messag() throws Throwable {
		editeAff.msg();
		logger.info("User should see the massege displayed");
		WebDriverUtility.wait(2000);
		WebDriverUtility.screenShot();
	}


	

}
