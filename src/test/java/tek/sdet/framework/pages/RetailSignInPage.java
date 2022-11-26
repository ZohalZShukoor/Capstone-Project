package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup{
	public RetailSignInPage() {
        PageFactory.initElements(getDriver(), this);
    }
	
	@FindBy(xpath = "//a[@id='signinLink']") 
	public WebElement signIn;
	 
	@FindBy(xpath ="//input[@id='email']")
	public WebElement emailField;
		
	@FindBy(xpath = "//input[@id='password']")
	public WebElement passwordField;
		
	@FindBy(xpath = "//button[@id='loginBtn']")
	public WebElement loginButton;
		
	@FindBy(id="accountLink")
	public WebElement account;
	
	@FindBy(xpath = "//a[@id='newAccountBtn']")
	public WebElement createNewAccountBttn;
	
	@FindBy(id="nameInput")
	public WebElement nameInput;
	
	@FindBy(id="emailInput")
	public WebElement emailInput;
	
	@FindBy(id="passwordInput")
	public WebElement passwordInput;
	
	@FindBy(id="confirmPasswordInput")
	public WebElement confirmpasswordInput;
	
	@FindBy(id="signupBtn")
	public WebElement signUpButton;

	@FindBy(id="profileImage")
	public WebElement profileImage;
}
