package Pomclasses4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SigninDisneyHotstar {
	
	//Initialization of WebElement
	
	@FindBy(xpath="//div[@role='presentation']")
	private WebElement loginDisneyHotstar ;
	
	@FindBy(xpath="//button[@class='email-or-fb-signin']")
	private WebElement emailDisney ;
	
	@FindBy(xpath="//input[@id='emailID']")
	private WebElement emailidDisney ;
	
	@FindBy(xpath="//button[@class='submit-button']")
	private WebElement continueButtonDisney ;
	
	@FindBy(xpath="//input[@id='phoneNo']")
	private WebElement mobilenoDisney ;
	
	@FindBy(xpath="//button[@class='submit-button']")
	private WebElement continuebuttonverifymob ;
	
	@FindBy(xpath="//button[@class='submit-button']")
	private WebElement submitDisney ;
	
	@FindBy(xpath="//div[@class='close-btn']")
	private WebElement submitDisneypopup ;
	
	//Constructor
	
	private WebDriver driver ;
	private Actions action ;
	private WebDriverWait wait;
	
	public SigninDisneyHotstar(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver ;
		action =new Actions(this.driver) ;
		wait = new WebDriverWait(driver,20) ;
		
	}
	//methods
	public void clickOnloginDisneyHotstar ()
	{
		loginDisneyHotstar.click();
	}
	public void clickOnemailDisney ()
	{
		emailDisney.click();
	}
	public void sendOnemailidDisney () 
	{
		emailidDisney.sendKeys("trivenikharade380@gmail.com");
	}
	public void clickOncontinueButtonDisney () 
	{
		continueButtonDisney.click();
	}
	public void sendOnmobilenoDisney() 
	{
		mobilenoDisney.sendKeys("9309580957");
	}
	public void clickOncontinuebuttonverifymob() 
	{
		continuebuttonverifymob.click();
	}
	
	public void clickOnsubmitDisney() 
	{
		submitDisney.click();
	}
	public void clickOnsubmitDisneypopup() 
	{
		submitDisneypopup.click();
	}
}
