package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageObjects.Canon_CameraObj;
import utilities.WebDriverUtility;

public class Canon_CameraStepDefintion extends Base {


	Canon_CameraObj AddToCart = new Canon_CameraObj();

	@When("^User click ADD TO CART option on ‘Canon EOS (\\d+)D’ item$")
	public void user_click_ADD_TO_CART_option_on_Canon_EOS_D_item(int arg1) throws Throwable {

		AddToCart.addToCart();
		WebDriverUtility.wait(3000);
		logger.info("User click");
		WebDriverUtility.screenShot();
	}

	@When("^User select color from dropdown ‘Red’$")
	public void user_select_color_from_dropdown_Red() throws Throwable {
		AddToCart.color();
		WebDriverUtility.wait(2000);
		logger.info("User select color from the dropdown box");
		WebDriverUtility.screenShot();
	}

	@Then("^User should see a message ‘Success: You have added Canon EOS (\\d+)D to your shopping cart!’$")
	public void user_should_see_a_message_Success_You_have_added_Canon_EOS_D_to_your_shopping_cart(int arg1)
			throws Throwable {
		AddToCart.sucess();
		WebDriverUtility.wait(3000);
		logger.info("User should see the success message after click add to cart button");
		WebDriverUtility.screenShot();

	}

//	@When("^User click ADD TO CART option on ‘Canon EOS (\\d+)D’ item$")
//	public void user_click_ADD_TO_CART_option_on_Canon_EOS_D_item(int arg1) throws Throwable {
//		AddToCart.addToCart();
//			WebDriverUtility.wait(3000);
//			logger.info("User click");
//			WebDriverUtility.screenShot();
//	}
//
//	@When("^User select color from dropdown ‘Red’$")
//	public void user_select_color_from_dropdown_Red() throws Throwable {
//		AddToCart.color();
}
