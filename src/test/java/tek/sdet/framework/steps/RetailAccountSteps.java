package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities​​​​​​​.CommonUtility;

public class RetailAccountSteps extends CommonUtility{

	POMFactory factory = new POMFactory();
	
	@When("User click on Sign in Option")
	public void userClickOnSignInOption() {
	   click(factory.accountPage().signIn);
	   logger.info( "user clicked on Sign in Option");
	}

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.accountPage().accountOptionBttn);
		logger.info( "user clicked on account option");
	}
	
	@And("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phone) {
		 sendText(factory.accountPage().nameInputField, name);
		 sendText(factory.accountPage().phoneNumberField, phone);
		 logger.info( "user update Name and Phone number into the account update section");
	}
	
	@And("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().personalInfoUpdateBttn);
		logger.info( "user click on Update button");
	}
	
	@Then("User profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().profileUpdateMsg));
		logger.info( "user profile information was updated successfully");
	}
	
	@And("User enter below information")
	public void userEnterBelowInformation(DataTable data) {
		List<Map<String, String>> addressForm = data.asMaps(String.class,String.class);;
		sendText(factory.accountPage().previousPasswordField,addressForm.get(0).get("previousPassword"));
		sendText(factory.accountPage().newPasswordField,addressForm.get(0).get( "newPassword"));
		sendText(factory.accountPage().confirmPasswordField,addressForm.get(0).get( "confirmPassword"));
		logger.info( "user entered provided information to change password");
	}
	
	
	@And("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
		click(factory.accountPage().changePasswordBttn);
	}
	

	
	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
	   click(factory.accountPage().addPaymentMethodLink);
	   logger.info("user clicked on add a payment method link");
	}
	
	
	
	@And("User click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().updateYourCardBttn);
		logger.info("user clicked on update your card button");
	}
	
	@And("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().firstCardOnAccountEndingIn4599);
		click(factory.accountPage().cardRemoveBttn);
		logger.info("user clicked on remove option of card section");
	}
	
	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		getElementText(factory.accountPage().firstCardOnAccountEndingIn4599);
		logger.info("payment details were removed");
	}
	
	@Then("a message should be displayed 'Payment Method updated Successfully'")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
		getElementText(factory.accountPage().cardInfoUpdateMsg);
		logger.info("'Payment Method updated Successfully' message was displayed");
	}
	
	@And("User click on Add Address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addAddressBttn);
		logger.info("user clicked on add address button");
	}
	
	@And("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountPage().editYourAddressBttn);
		logger.info("user clicked on edit address option");
	}
	
	@Then("a message should be displayed 'Payment Method added successfully'")
	public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() {
		getElementText(factory.accountPage().cardAddedToastMsg);
		logger.info("'Payment Method Added Successfully' message was displayed");
	}

	@And("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.accountPage().updateYourAddressBttn);
		logger.info("user clicked on update your card button");
	}
	
	@And("User edit information with below data")
	public void userEditInformationWithBelowData(DataTable data) {
		List<Map<String, String>> cardInfo = data.asMaps(String.class,String.class);
		clear(factory.accountPage().cardNumberInputField, "cardNumber");
		sendText(factory.accountPage().cardNumberInputField,cardInfo.get(0).get("cardNumber"));
		clear(factory.accountPage().nameOnCardInputField,"nameOnCard");
		sendText(factory.accountPage().nameOnCardInputField,cardInfo.get(0).get("nameOnCard"));
		//click(factory.accountPage().expirationMonthDropDown);
		selectByIndex(factory.accountPage().expirationMonthDropDown, 1);
		//click(factory.accountPage().expirationYearDropDown);
		selectByIndex(factory.accountPage().expirationYearDropDown, 1);
		clear(factory.accountPage().securityCodeInputField, "securityCode");
		sendText(factory.accountPage().securityCodeInputField,cardInfo.get(0).get( "securityCode"));
		logger.info( "user updated required information into Debit or Credit card form");
		List<List<String>> card = data.asLists(String.class);
	}

	
	@And("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.accountPage().removeAddressBttn);
		logger.info("user clicked on remove option of address section");
	}
	
	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		scrollPageDownWithJS();
		click(factory.accountPage().firstCardOnAccountEndingIn4599);
	    click(factory.accountPage().cardEditBttn);
	    logger.info("user clicked on Edit option of card section");
	}
	
	@And("User fill New Address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable info) {
		List<Map<String, String>> addressForm = info.asMaps(String.class,String.class);
		selectByValue(factory.accountPage().countryDropDown, "United States");
		sendText(factory.accountPage().nameField,addressForm.get(0).get("fullName"));
		sendText(factory.accountPage().phoneNumberFields,addressForm.get(0).get( "phoneNumber"));
		sendText(factory.accountPage().streetInputField,addressForm.get(0).get( "streetAddress"));
		sendText(factory.accountPage().apartmentInputField,addressForm.get(0).get( "apt"));
		sendText(factory.accountPage().cityInputField,addressForm.get(0).get( "city"));
		selectByValue(factory.accountPage().stateDropDown, "California");
		sendText(factory.accountPage().zipCodeInputField,addressForm.get(0).get( "zipCode"));
		logger.info( "user entered required information into address form");
		List<List<String>> address = info.asLists(String.class);
		sendText(factory.accountPage().nameField,address.get(0).get(0));
	}

	@And("user fill new address form with below information")
	public void userFillNewaddressFormWithBelowInformation(DataTable info) {
		
		List<Map<String, String>> addressForm = info.asMaps(String.class,String.class);
		selectByValue(factory.accountPage().countryDropDown, "United States");
		
		factory.accountPage().nameField.sendKeys(Keys.COMMAND + "a");
		sendText(factory.accountPage().nameField,addressForm.get(0).get( "fullName"));
		//clearTextUsingSendKeys(factory.accountPage().nameField);
		
		factory.accountPage().phoneNumberFields.sendKeys(Keys.COMMAND + "a");
		sendText(factory.accountPage().phoneNumberFields,addressForm.get(0).get( "phoneNumber"));
		//clearTextUsingSendKeys(factory.accountPage().phoneNumberFields);
		
		sendText(factory.accountPage().streetInputField,addressForm.get(0).get( "streetAddress"));
		sendText(factory.accountPage().apartmentInputField,addressForm.get(0).get( "apt"));
		sendText(factory.accountPage().cityInputField,addressForm.get(0).get( "city"));
		selectByValue(factory.accountPage().stateDropDown, "California");	
		
		factory.accountPage().zipCodeInputField.sendKeys(Keys.COMMAND + "a");
		sendText(factory.accountPage().zipCodeInputField,addressForm.get(0).get( "zipCode"));
		//clearTextUsingSendKeys(factory.accountPage().zipCodeInputField);
		
		logger.info( "user entered required information into address form");
		List<List<String>> address = info.asLists(String.class);
	}
	
	@Then("a message should be displayed ‘Address Added Successfully’")
	public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
		getElementText(factory.accountPage().addressAddedSuccessfullyMsg);
		logger.info("'Address Added Successfully' message was displayed");
	}
	
	@Then("a message should be displayed 'Password Updated Successfully'")
	public void aMessageShouldBeDisplayedPasswordUpdatedSuccessfully() {
		getElementText(factory.accountPage().passwordChangeSuccessMsg);
		logger.info("Password was updated successfully");
	}

	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
	 click(factory.accountPage().removeAddressBttn);
     Assert.assertTrue(waitTillAbsence(factory.accountPage().firstAddressInAddressList));
     System.out.println("Address Remove Successfully");
	}
	
	@Then("a message should be displayed 'Address Updated Successfully'")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
		getElementText(factory.accountPage().addressUpdatedSuccessfullyMsg);
		logger.info("a message was displayed 'Address Updated Successfully'");
	}
	
	 public static void main(String[] args) throws Exception {
	      try {
	         assert args.length > 0;
	      }
	      catch (AssertionError e) {
	         System.out.println(e.getMessage());
	      }
	   }

}
