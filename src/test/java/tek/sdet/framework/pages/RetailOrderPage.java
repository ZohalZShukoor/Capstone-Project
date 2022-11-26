package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{
	
	public RetailOrderPage() {
        PageFactory.initElements(getDriver(), this);
    }
	
	@FindBy(xpath = "//a[@id='orderLink']")
	public WebElement orderBttn;
	
	@FindBy(xpath = "//p[text()='Show Details']")
	public WebElement showOrderDetailLink;
	
	@FindBy(xpath = "//button[@id='cancelBtn']")
	public WebElement cancelTheOrderBttn;
	
	@FindBy(xpath = "//select[@id='reasonInput']")
	public WebElement orderCancelReasonInput;
	
	@FindBy(xpath = "//button[@id='orderSubmitBtn']")
	public WebElement cancelOrderSubmitBttn;
	
	@FindBy(xpath = "//p[text()='Your Order Has Been Cancelled']")
	public WebElement cancelationOrderMsg;
	
	@FindBy(xpath = "//button[@id='returnBtn']")
	public WebElement returnItemsBttn;

	@FindBy(xpath = "//select[@id='reasonInput']")
	public WebElement returnItemreason;
	
	@FindBy(xpath = "//select[@id='dropOffInput']")
	public WebElement dropOffService;
	
	@FindBy(xpath = "//button[@id='orderSubmitBtn']")
	public WebElement returnOrderBttn;
	
	@FindBy(xpath = "//p[text()='Return was successfull']")
	public WebElement returnItemMsg;
	
	@FindBy(xpath = "//button[@id='reviewBtn']")
	public WebElement orderReviewBttn;
	
	@FindBy(xpath = "//input[@id='headlineInput']")
	public WebElement addHeadlineField;
	
	@FindBy(xpath = "//textarea[@id='descriptionInput']")
	public WebElement addWrittenField;
	
	@FindBy(xpath = "//button[@id='reviewSubmitBtn']")
	public WebElement addReviewBttn;
	
	@FindBy(xpath = "//div[text()='Your review was added successfully']")
	public WebElement reviewAddedSuccessfullyMsg;
}
