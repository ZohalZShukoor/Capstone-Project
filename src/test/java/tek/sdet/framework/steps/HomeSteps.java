package tek.sdet.framework.steps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities​​​​​​​.CommonUtility;

public class HomeSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String expectedTitle = "React App";
		String actualTitle = getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		logger.info(actualTitle + " is equal to " + expectedTitle);

	}

	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().allSection);
		logger.info("user clicked on All section");
	}

	@Then("below options are present in Shop by Department sidebar")

	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable sideBar) {

		List<List<String>> actualList = new ArrayList<List<String>>();
		actualList.add(Arrays.asList("Electronics"));
		actualList.add(Arrays.asList("Computers"));
		actualList.add(Arrays.asList("Smart Home"));
		actualList.add(Arrays.asList("Sports"));
		actualList.add(Arrays.asList("Automative"));

		DataTable actual = DataTable.create(actualList);

		logger.info((Arrays.asList("Electronics") + " is present"));
		logger.info((Arrays.asList("Computers") + " is present"));
		logger.info((Arrays.asList("Smart Home") + " is present"));
		logger.info((Arrays.asList("Sports") + " is present"));
		logger.info((Arrays.asList("Automative") + " is present"));
	}

	 String department;

	 @When("User is on {string}")
	 public String userIsOn(String department) {
		   
	       switch (department) {
	        case "Electronics":
	            Assert.assertTrue(isElementDisplayed(factory.homePage().electronics));
	            logger.info("user is on Electronics section");
	            break;
	        case "Computers":
	            Assert.assertTrue(isElementDisplayed(factory.homePage().computers));
	            logger.info("user is on Computers section");
	            break;
	        case "Sports":
	            Assert.assertTrue(isElementDisplayed(factory.homePage().sports));
	            logger.info("user is on Sports section");
	            break;
	        case "Automotive":
	            Assert.assertTrue(isElementDisplayed(factory.homePage().automative));
	            logger.info("user is on Automotive section");
	            break;
	        default:
	       }
	       return this.department = department;
	 }

	@Then("below options are present in department")
    public void belowOptionsArePresentInDepartment(DataTable dataTable) {
        List<List<String>> department = dataTable.asLists();

       switch (this.department) {
        case "Electronics":
            click(factory.homePage().electronics);
            String video = getText(factory.homePage().videoGames);
            String TVAndVideo = getText(factory.homePage().tvAndVideo);
            Assert.assertEquals(TVAndVideo, department.get(0).get(0));
            Assert.assertEquals(video, department.get(0).get(1));
            logger.info(video + " options are present in department" + TVAndVideo);
            break;
        case "Computers":
            click(factory.homePage().computers);
            String Accessories = getText(factory.homePage().accessories);
            String Networking = getText(factory.homePage().networking);
            Assert.assertEquals(Accessories, department.get(0).get(0));
            Assert.assertEquals(Networking, department.get(0).get(1));
            logger.info(Accessories + " options are present in department" + Networking);
            break;
        case "Sports":
            click(factory.homePage().sports);
            String AthleticClothing = getText(factory.homePage().athleticClothing);
            String ExerciseFitness = getText(factory.homePage().exerciseAndFitness);
            Assert.assertEquals(AthleticClothing, department.get(0).get(0));
            Assert.assertEquals(ExerciseFitness, department.get(0).get(1));
            logger.info(AthleticClothing + " options are present in department" + ExerciseFitness);
            break;
        case "Automotive":
            click(factory.homePage().automative);
            String AutomativePartsAccessories = getText(factory.homePage().automativePartsAndAccessories);
            String MotorCyclePowersports = getText(factory.homePage().motorCycleAndPowersports);
            Assert.assertEquals(AutomativePartsAccessories, department.get(0).get(0));
            Assert.assertEquals(MotorCyclePowersports, department.get(0).get(1));
            logger.info(MotorCyclePowersports + " options are present in department" + AutomativePartsAccessories);
            break;
       }
   }

	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signIn);
		logger.info("User clicked on Sign in Option");
	}

	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String emailValue, String passwordValue) {
		sendText(factory.homePage().emailField, emailValue);
		sendText(factory.homePage().passwordField, passwordValue);
		logger.info("user entered email " + emailValue + " and password" + passwordValue);
	}

	@And("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.homePage().loginButton);
		logger.info("User clicked on Login Button");
	}

	@And("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().account));
		logger.info("User logged in into account");
	}

	@And("User change the category to {string}")
	public void userChangeTheCategoryTo(String category) {
		selectByVisibleText(factory.homePage().allDepartments, category);
		logger.info(category + " is selected from the drop down");
	}

	@When("User search for an item {string}")
	public void userSearchForAnItem(String value) {
		sendText(factory.homePage().searchInputField,value);
		logger.info("user entered "+value);
	}

	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePage().searchButton);
		logger.info("user clicked on search button");
	}

	@And("User click on item")
	public void userClickOnItem() {
		click(factory.homePage().kasaOutdoorSmartPlugItem);
		logger.info( "User clicked on item");
	}

	@When("User select quantity ‘{int}’") 
	public void userSelectQuantity(Integer quantity) {
		click(factory.homePage().productQTYSelect);
		selectByValue(factory.homePage().productQTYSelect,"2");
		logger.info("user selected "+quantity); 
	}
	
	@And("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.homePage().addToCartBttn);
		logger.info( "User clicked on Add To Cart Button");
	}
		
	@Then("the cart icon quantity should change to ‘{int}’")
	public void theCartIconQuantityShouldChangeTo(Integer qty) {
		Assert.assertTrue(isElementDisplayed(factory.homePage().qty2));
		logger.info("The quantity was changed to " + qty);
	}
	
	@And("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.homePage().addToCartBttn);
		click(factory.homePage().cartIcon);
		logger.info( "User clicked on Add to Cart button");	
	}
	
	@And("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.homePage().proceedToCheckoutBttn);
		logger.info( "User clicked on proceed to checkout button");
	}
	
	@And("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
		click(factory.homePage().addANewAddress);
	}
	
	@And("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable info) {
		List<Map<String, String>> addressForm = info.asMaps(String.class,String.class);
		selectByValue(factory.homePage().countryDropDown, "United States");
		sendText(factory.homePage().nameField,addressForm.get(0).get("fullName"));
		sendText(factory.homePage().phoneNumberField,addressForm.get(0).get( "phoneNumber"));
		sendText(factory.homePage().streetInputField,addressForm.get(0).get( "streetAddress"));
		sendText(factory.homePage().apartmentInputField,addressForm.get(0).get( "apt"));
		sendText(factory.homePage().cityInputField,addressForm.get(0).get( "city"));
		selectByValue(factory.homePage().stateDropDown, "California");
		sendText(factory.homePage().zipCodeInputField,addressForm.get(0).get( "zipCode"));
		logger.info( "user entered required information into address form");
		List<List<String>> address = info.asLists(String.class);
		sendText(factory.homePage().nameField,address.get(0).get(0));
	}
	
	@And("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.homePage().addYourAddressBttn);
		scrollPageDownWithJS();
		logger.info("user clicked on add your address Button");
	}
	
	
	@And("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
		click(factory.homePage().addPaymentBttn);
		logger.info( "user clicked on add a Credit or Debit Card link");
	}
	
	@And("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable data) {
		List<Map<String, String>> paymentForm = data.asMaps(String.class,String.class);
		sendText(factory.homePage().cardNumberInputField,paymentForm.get(0).get("cardNumber"));
		sendText(factory.homePage().nameOnCardInputField,paymentForm.get(0).get("nameOnCard"));
		click(factory.homePage().expirationMonthDropDown);
		selectByIndex(factory.homePage().expirationMonthDropDown, 1);
		click(factory.homePage().expirationYearDropDown);
		selectByIndex(factory.homePage().expirationYearDropDown, 1);
		sendText(factory.homePage().securityCodeInputField,paymentForm.get(0).get( "securityCode"));
		logger.info( "user entered required information into payment form");
		List<List<String>> payment = data.asLists(String.class);
		
	}
	
	@And("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.homePage().addYourCardBttn);
		logger.info("user clicked on add your card button");
	}
	
	@And("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.homePage().placeOrderBttn);
		logger.info("user clicked on place your order button");
	}
	
	@Then("a message should be displayed ‘Order Placed, Thanks’")
	public void aMessageShouldBeDisplayedOrderPlacedThanks() {
		getElementText(factory.homePage().orderPlacedMsg);
		logger.info("displayed message was ");
	}
	
	@And("User click on items")
	public void userClickOnItems() {
		click(factory.homePage().apexLegendsProduct);
		logger.info("user clicked on item");
	}
}
