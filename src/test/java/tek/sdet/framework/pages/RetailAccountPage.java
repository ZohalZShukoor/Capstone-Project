package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{

	public RetailAccountPage() {
        PageFactory.initElements(getDriver(), this);
    }
	
	@FindBy(xpath = "//a[text()='Account']")
	public WebElement accountOptionBttn;
	
	@FindBy(xpath = "//input[@id='nameInput']")
	public WebElement nameInputField;
	
	@FindBy(xpath = "//input[@id='personalPhoneInput']")
	public WebElement phoneNumberField;
	
	@FindBy(xpath = "//button[@id='personalUpdateBtn']")
	public WebElement personalInfoUpdateBttn;
	
	@FindBy(xpath = "//div[@class='Toastify']")
	public WebElement profileUpdateMsg;
	
	@FindBy(xpath = "//a[@id='signinLink']") 
    public WebElement signIn;
	
	@FindBy(xpath = "//button[@class='text-blue-800 cursor-pointer hover:underline']")
	public WebElement cardEditBttn;
	
	@FindBy(xpath = "//input[@id='previousPasswordInput']")
	public WebElement previousPasswordField;
	
	@FindBy(xpath = "//input[@id='newPasswordInput']")
	public WebElement newPasswordField;
	
	@FindBy(xpath = "//input[@id='confirmPasswordInput']")
	public WebElement confirmPasswordField;
	
	@FindBy(xpath = "//button[@id='credentialsSubmitBtn']")
	public WebElement changePasswordBttn;
	
	@FindBy(xpath = "//div[@class='Toastify']")
	public WebElement passwordChangeSuccessMsg;
	
	
	@FindBy(xpath = "//p[text()='Add a payment method']")
	public WebElement addPaymentMethodLink;
	
	@FindBy(xpath = "//select[@id='expirationMonthInput']")
	public WebElement expirationMonthDropDown;
	
	@FindBy(xpath = "//select[@id='expirationYearInput']")
	public WebElement expirationYearDropDown;
	
	@FindBy(xpath = "//input[@id='securityCodeInput']")
	public WebElement securityCodeInputField;
	
	@FindBy(xpath = "//input[@id='cardNumberInput']")
	public WebElement cardNumberInputField;
	
	@FindBy(xpath = "//input[@id='nameOnCardInput']")
	public WebElement nameOnCardInputField;
	
	@FindBy(xpath = "//button[@id='paymentSubmitBtn']")
	public WebElement addYourCardBttn;
	
	@FindBy(xpath = "//div[text()='Payment Method added sucessfully']")
	public WebElement cardAddedToastMsg;
	
	@FindBy(xpath = "//p[text()='4599']")
	public WebElement firstCardOnAccountEndingIn4599;
	
	@FindBy(xpath = "//button[@id='addAddressBtn']")
	public WebElement addANewAddress;
	
	@FindBy(xpath = "//select[@id='countryDropdown']")
	public WebElement countryDropDown;
	
	@FindBy(css = "*[name='fullName']")
	public WebElement nameField;
	
	@FindBy(xpath = "//input[@id='phoneNumberInput']")
	public WebElement phoneNumberFields;
	
	@FindBy(xpath = "//input[@id='streetInput']")
	public WebElement streetInputField;
	
	@FindBy(xpath = "//input[@id='apartmentInput']")
	public WebElement apartmentInputField;
	
	@FindBy(xpath = "//input[@id='cityInput']")
	public WebElement cityInputField;
	
	@FindBy(xpath = "//select[@name='state']")
	public WebElement stateDropDown;
	
	@FindBy(xpath = "//input[@id='zipCodeInput']")
	public WebElement zipCodeInputField;
	
	@FindBy(xpath = "//button[@id='addressBtn']")
	public WebElement addYourAddressBtn;
	
	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement addressAddedSuccessfullyMsg;
	
	@FindBy(xpath = "//button[@id='paymentSubmitBtn']")
	public WebElement updateYourCardBttn;
	
	@FindBy(xpath = "//button[text()='remove']")
	public WebElement cardRemoveBttn;
	
	@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
	public WebElement cardInfoUpdateMsg;
	
	@FindBy(xpath = "//p[text()='Add Address']")
	public WebElement addAddressBttn;
	
	@FindBy(xpath = "//button[@id='addressBtn']")
	public WebElement addYourAddressBttn;
	
	@FindBy(xpath = "//button[text()='Edit']")
	public WebElement editYourAddressBttn;

	@FindBy(xpath = "//button[text()='Remove']")
	public WebElement removeAddressBttn;
	
	@FindBy(xpath = "//button[@id='addressBtn']")
	public WebElement updateYourAddressBttn;
	
	@FindBy(xpath = "//div[@data-id='364']")
	public WebElement firstAddressInAddressList;
	
	@FindBy(xpath = "//div[text()='Address Updated Successfully']")
	public WebElement addressUpdatedSuccessfullyMsg;
	

	
	
	
}
