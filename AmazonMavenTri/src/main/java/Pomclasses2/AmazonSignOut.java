package Pomclasses2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonSignOut {
	
	@FindBy(xpath = "//a[@class='nav-a nav-a-2 nav-truncate   nav-progressive-attribute']")
	private WebElement amazonhelloTriveniButton;
	
	@FindBy(xpath = "//span[text()='Sign Out']")
	private WebElement amazonSignOut ;
	
	private WebDriver driver ;
	private Actions action ;
	private WebDriverWait wait;
	
	public AmazonSignOut(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver ;
		action =new Actions(this.driver) ;
		wait = new WebDriverWait(driver,20) ;
	}
	
	public void clickOnamazonhelloTriveniButton ()
	{
		amazonhelloTriveniButton.click();
	}
	public void clickOnamazonSignOut()
	{
		amazonSignOut.click();
	}
	
}
