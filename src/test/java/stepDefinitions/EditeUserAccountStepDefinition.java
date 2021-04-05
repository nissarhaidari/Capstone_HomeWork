package stepDefinitions;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.EditeUserAccountObj;
import utilities.WebDriverUtility;

public class EditeUserAccountStepDefinition extends Base{

	EditeUserAccountObj userEdit = new EditeUserAccountObj();
	
	@When("^User click on ‘Edit your account information’ link$")
	public void user_click_on_Edit_your_account_information_link() throws Throwable {
		userEdit.editeAccount();
		logger.info("User should click on edite account information");
		WebDriverUtility.wait(2000);
		WebDriverUtility.screenShot();
		
	}

	@When("^User modify below information |firstname|lastName|email|telephone|$")
	public void user_modify_below_information_firstname_lastName_email_telephone() throws Throwable {
	    
		userEdit.firstName(null);
		userEdit.lastName(null);
		userEdit.Email(null);
		userEdit.phone();
		logger.info("User should click on edite account information");
		WebDriverUtility.wait(2000);
		WebDriverUtility.screenShot();
	}
	@When("^User modify below information$")
	public void user_modify_below_information(DataTable arg1) throws Throwable {
		userEdit.Continue(null);
	
	}

	@Then("^User should see a message ‘Success: Your account has been successfully updated\\.’$")
	public void user_should_see_a_message_Success_Your_account_has_been_successfully_updated() throws Throwable {
		userEdit.Success();
	}

}
