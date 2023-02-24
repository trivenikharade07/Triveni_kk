package Pomclasses2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonSignup {
	
	@FindBy(xpath = "//span[text()='Hello, sign in']")
	private WebElement helloSigninButton ;
	
	@FindBy(xpath = "//a[@id='createAccountSubmit']")
	private WebElement amazoncreateAccount ;
	
	@FindBy(xpath = "//input[@id='ap_customer_name']")
	private WebElement firstAndLastName  ;
	
	@FindBy(xpath = "//input[@id='ap_phone_number']")
	private WebElement amazonMobileNumber ;

	@FindBy(xpath = "//input[@id='ap_password']")
	private WebElement amazonPassword ;
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement amazonContinueButton ;
	
	private WebDriver driver ;
	private Actions action ;
	private WebDriverWait wait;
	
	
	public AmazonSignup (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver ;
		action =new Actions(this.driver) ;
		wait = new WebDriverWait(driver,20) ;
		
	}
	
	public void clickOnhelloSigninButton()
	{
		helloSigninButton.click();
	}
	
	public void clickOnamazoncreateAccount ()
	{
		amazoncreateAccount.click();
	}
	
	public void sendOnfirstAndLastName ()
	{
		firstAndLastName.sendKeys("Triveni Kharade");
	}
	
	public void sendOnamazonMobileNumber() 
	{
		amazonMobileNumber.sendKeys("9309580957");
	}
	public void sendOnamazonPassword () 
	{
		amazonPassword.sendKeys("Triveni@123");
	}
	public void clickOnamazonContinueButton() 
	{
		amazonContinueButton.click(); 
	}
	
}
