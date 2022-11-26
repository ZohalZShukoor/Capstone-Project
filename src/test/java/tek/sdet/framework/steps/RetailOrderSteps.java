package tek.sdet.framework.steps;



import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities​​​​​​​.CommonUtility;

public class RetailOrderSteps extends CommonUtility {

	POMFactory factory = new POMFactory();
	
	@And("User click on Orders section")
	public void userClickOnOrderSection() {
		click(factory.orderPage().orderBttn);
		logger.info( "user clicked on Order Button");
	}
	
	@And("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		click(factory.orderPage().showOrderDetailLink);
		logger.info( "user clicked on first order in the list");
	}
	
	@And("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.orderPage().cancelTheOrderBttn);
		logger.info( "user click on Cancel The Order button");
	}
	
	@And("User select the cancelation Reason ‘Bought wrong item’")
	public void userSelectTheCancelationreasonBoughtWrongItem() {
		selectByIndex(factory.orderPage().orderCancelReasonInput,1);
		logger.info( "user selected the cancelation reason 'Bought wrong item'");
	}
	
	@And("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderPage().cancelOrderSubmitBttn);
		logger.info("user clicked on cancel order submit button");
	}
	
	@Then("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled() {
		getElementText(factory.orderPage().cancelationOrderMsg);
		logger.info("cancelation message was displayed");
	}
	
	@And("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.orderPage().returnItemsBttn);
		logger.info( "user clicked on Return Items button");
	}
	
	@And("User select the Return Reason ‘Item damaged’")
	public void userSelectTheReturnReasonItemDamaged() {
		selectByIndex(factory.orderPage().returnItemreason,2);
		logger.info("user selected the Return Reason 'Item damaged'");
	}
	
	@And("User select the drop off service ‘FedEx’")
	public void userSelectTheDropOffServiceFedEx() {
		selectByIndex(factory.orderPage().dropOffService,2);
		logger.info("user select the drop off service 'FedEx'");
	}
	
	@And("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderPage().returnOrderBttn);
		logger.info("user clicked on cancel order submit button");
	}
	
	@Then("a cancelation message should be displayed ‘Return was successful’")
	public void aCancelationMessageShouldBeDisplayedReturnWasSuccessful() {
		getElementText(factory.orderPage().returnItemMsg);
		logger.info("cancelation message was displayed 'return was successful'");
	}
	
	@And("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.orderPage().orderReviewBttn);
		logger.info("user clicked on Review button");
	}
	
	@And("User write Review headline {string} and {string}")
	public void userWriteHeadlineHeadlineValueAndReviewText(String headlineValue, String reviewText) {
		sendText(factory.orderPage().addHeadlineField,headlineValue);
		sendText(factory.orderPage().addWrittenField,reviewText);
	}
	
	@And("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderPage().addReviewBttn);
		logger.info("user clicked on Add your Review button");
	}
	
	@Then("a review message should be displayed ‘Your review was added successfully’")
	public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully() {
		getElementText(factory.orderPage().reviewAddedSuccessfullyMsg);
		logger.info("Your review was added successfully message was displayed");
	}
	
	
}
