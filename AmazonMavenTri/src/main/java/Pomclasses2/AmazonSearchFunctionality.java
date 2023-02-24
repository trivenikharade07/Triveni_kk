package Pomclasses2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonSearchFunctionality {
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement amazonSearchButton ;
	
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	private WebElement amazonSearchBar ;
	
	private WebDriver driver ;
	private Actions action ;
	private WebDriverWait wait;
	
	public AmazonSearchFunctionality(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver ;
		action =new Actions(this.driver) ;
		wait = new WebDriverWait(driver,20) ;
	}
	
	public void sendOnamazonSearchButton ()
	{
		amazonSearchButton.sendKeys("Applemobile14pro");
	}
	public void clickOnamazonSearchBar()
	{
		amazonSearchBar.click();
	}


}
