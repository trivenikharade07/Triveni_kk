package Pomclasses2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonLogin {
	
	@FindBy(xpath = "//span[text()='Hello, sign in']")
	private WebElement helloLoginButton ;
	
	@FindBy(xpath = "//input[@id='ap_email']")
	private WebElement amazonEmailAddLogin ;
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement amazonContinueButtonlogin ;

	@FindBy(xpath = "//input[@id='ap_password']")
	private WebElement amazonloginPassword ;
	
	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement amazonSigninButton ;
	
	private WebDriver driver ;
	private Actions action ;
	private WebDriverWait wait;
	
	public AmazonLogin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
		this.driver=driver ;
		action =new Actions(this.driver) ;
		wait = new WebDriverWait(driver,20) ;
	}
	
	public void clickOnhelloLoginButton()
	{
		helloLoginButton.click();
	}
	
	public void sendOnamazonEmailAddLogin()
	{
		amazonEmailAddLogin.sendKeys("9309580957") ;
	}
	public void cliclOnamazonContinueButtonlogin() 
	{
		amazonContinueButtonlogin.click() ;
	}
	public void sendOnmazonloginPassword () 
	{
		amazonloginPassword.sendKeys("Triveni@123") ;
	}
	public void clickOnamazonSigninButton() 
	{
		amazonSigninButton.click() ; 
	}
	
}
