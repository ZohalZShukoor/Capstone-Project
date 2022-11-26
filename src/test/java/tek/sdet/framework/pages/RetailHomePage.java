package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
    public RetailHomePage() {
        PageFactory.initElements(getDriver(), this);
    }
    @FindBy(xpath = "//a[@id='signinLink']") 
    public WebElement signIn;
    
    @FindBy(xpath = "//button[@class='second-nav__all-btn']")
    public WebElement allSection;
    
    @FindBy(xpath = "//span[text()='Electronics']")
    public WebElement electronics;
    
    @FindBy(xpath = "//span[text()='Computers']")
    public WebElement computers;
    
    @FindBy(xpath = "//span[text()='Smart Home']")
    public WebElement smartHome;
    
    @FindBy(xpath = "//span[text()='Sports']")
    public WebElement sports;
    
    @FindBy(xpath = "//span[text()='Automative']")
    public WebElement automative;

    @FindBy(id = "contentHeader")
	public WebElement shopByDepartment;
    
    @FindBy(xpath = "//span[text()='TV & Video']")
    public WebElement tvAndVideo;
    
    @FindBy(xpath = "//span[text()='Video Games']")
    public WebElement videoGames;
    
    @FindBy(xpath = "//span[text()='Accessories']")
    public WebElement accessories;
    
    @FindBy(xpath = "//span[text()='Networking']")
    public WebElement networking;
    
    @FindBy(xpath = "//span[text()='Smart Home Lightning']")
    public WebElement smartHomeLighting;
    
    @FindBy(xpath = "//span[text()='Plugs and Outlets']")
    public WebElement plugsAndOutlets;
    
    @FindBy(xpath = "//span[text()='Athletic Clothing']")
    public WebElement athleticClothing;
    
    @FindBy(xpath = "//span[text()='Exercise & Fitness']")
    public WebElement exerciseAndFitness;  
    
    @FindBy(xpath = "//span[text()='Automative Parts & Accessories']")
    public WebElement automativePartsAndAccessories;
    
    @FindBy(xpath = "//span[text()='MotorCycle & Powersports']")
    public WebElement motorCycleAndPowersports;
    
	@FindBy(id="email")
	public WebElement emailField;
	
	@FindBy(id="password")
	public WebElement passwordField;
	
	@FindBy(id="loginBtn")
	public WebElement loginButton;
	
	@FindBy(id="accountLink")
	public WebElement account;
	
	@FindBy(id = "search")
	public WebElement allDepartments;
	
	@FindBy(id = "searchInput")
	public WebElement searchInputField;
	
	@FindBy(xpath="//button[@class='search__btn']")
	public WebElement searchButton;
	
	@FindBy(xpath = "//p[text()='Kasa Outdoor Smart Plug']")
	public WebElement kasaOutdoorSmartPlugItem;
	
	@FindBy(xpath = "//select[@class='product__select']")
	public WebElement productQTYSelect;
	
	@FindBy(xpath = "//span[text()='Add to Cart']")
	public WebElement addToCartBttn;
	
	@FindBy(xpath = "//button[@id='submenuBtn']")
	public WebElement subMenuBttn;
	
	@FindBy(xpath = "//select[@class='product__select']")
	public WebElement qty2;
	
	@FindBy(xpath = "//p[text()='Cart ']")
	public WebElement cartIcon;
	
	@FindBy(xpath = "//button[@id='proceedBtn']")
	public WebElement proceedToCheckoutBttn;
	
	@FindBy(xpath = "//button[@id='addAddressBtn']")
	public WebElement addANewAddress;
	
	@FindBy(xpath = "//select[@id='countryDropdown']")
	public WebElement countryDropDown;
	
	@FindBy(xpath = "//input[@id='fullNameInput']")
	public WebElement nameField;
	
	@FindBy(xpath = "//input[@id='phoneNumberInput']")
	public WebElement phoneNumberField;
	
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
	public WebElement addYourAddressBttn;
	
	@FindBy(xpath = "//button[@id='addPaymentBtn']")
	public WebElement addPaymentBttn;
	
	@FindBy(xpath = "//p[text()='Add a payment method']")
	public WebElement addPaymentLink;
	
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
	
	@FindBy(xpath = "//button[@id='placeOrderBtn']")
	public WebElement placeOrderBttn;
	
	@FindBy(xpath = "//*[@class='Toastify']")
	//@FindBy(xpath = "//p[text()='Order Placed, Thanks']")
	public WebElement orderPlacedMsg;
	
	@FindBy(xpath ="//p[text()='Apex Legends - 1,000 Apex Coins']")
	public WebElement apexLegendsProduct;
    
}