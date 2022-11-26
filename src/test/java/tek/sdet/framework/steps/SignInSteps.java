package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities​​​​​​​.CommonUtility;

public class SignInSteps extends CommonUtility{

	POMFactory factory = new POMFactory();
	
	@And("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signInPage().createNewAccountBttn);
		logger.info( "user clicked on create new account button");
	}
		
	@And("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable data) {
		List<Map<String, String>> signUpData = data.asMaps(String.class,String.class);
		sendText(factory.signInPage().nameInput,signUpData.get(0).get("name"));
		sendText(factory.signInPage().emailInput,signUpData.get(0).get("email"));
		sendText(factory.signInPage().passwordInput,signUpData.get(0).get("password"));
		sendText(factory.signInPage().confirmpasswordInput,signUpData.get(0).get("confirmPassword"));
		logger.info("user entered required information into sign up form");
		List<List<String>> signup =data.asLists(String.class);
		sendText(factory.signInPage().nameInput,signup.get(0).get(0));
	}
	
	@And("User click on SignUp button")
	public void userClickOnSignUpButton() {
		click(factory.signInPage().signUpButton);
		logger.info("user clicked on sign up Button");
		
	}
	
	@And("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().account));
		logger.info("Account was created");
	}
	
	
	
	
	
}
