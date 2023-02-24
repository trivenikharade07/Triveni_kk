package Pomclasses2;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonAddToCart {
	
	@FindBy(xpath = "(//img[@data-image-source-density='1'])[1]")
	private WebElement amazonProduct ;
	
	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	private WebElement amazonAddToCart;
	
	@FindBy(xpath="//a[@id='attach-close_sideSheet-link']")
	private WebElement closebttonAddToCart ;
	
	private WebDriver driver ;
	private Actions action ;
	private WebDriverWait wait;
	
	public AmazonAddToCart (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver ;
		action =new Actions(this.driver) ;
		wait = new WebDriverWait(driver,20) ;
		
	}
	
//	ArrayList<String> addr1 = new ArrayList<String>(driver.getWindowHandles());
//	 System.out.println(addr1.get(1)); // Swich to child browser 	 
//	 driver.switchTo().window(addr1.get(1));
	 
	public void clickOnamazonProduct()
	{
		amazonProduct.click();
	}
	public void clickOnamazonAddToCart()
	{
		JavascriptExecutor javaScriptExecutor= (JavascriptExecutor)driver;
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView(true);",amazonAddToCart) ;
		amazonAddToCart.click();
		
	}
	public void clickOnclosebttonAddToCart123()
	{
		closebttonAddToCart.click();
	}
	
}
