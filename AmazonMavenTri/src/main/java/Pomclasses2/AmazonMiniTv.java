package Pomclasses2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonMiniTv {
	
	@FindBy(xpath = "//a[text()='Amazon miniTV']")
	private WebElement amazonMiniTvButton   ;
	
	@FindBy(xpath = "//h1[text()='Comedy']")
	private WebElement amazonComedy ;
	
	@FindBy(xpath = "(//div[@ id='__next']//div)[47]")
	private WebElement farziMushaira ;
	
	@FindBy(xpath = "(//img[@decoding='async'])[2]")
	private WebElement playFarziMushaira ;
	
//	@FindBy(xpath = "(//img[@role='button'])[2]")
//	private WebElement pauseFarziMushaira ;
	
	private WebDriver driver ;
	private Actions action ;
	private WebDriverWait wait;
	
	public AmazonMiniTv(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver ;
		action =new Actions(this.driver) ;
		wait = new WebDriverWait(driver,20) ;
	}
	
	public void clickOnamazonMiniTvButton()
	{
		amazonMiniTvButton.click();
	}
	public void clickOnamazoznComedy()
	{
		amazonComedy.click();
	}
	public void clickOnfarziMushaira()
	{
	    farziMushaira.click();
	}
	public void clickOnplayFarziMushaira()
	{
		playFarziMushaira.click();
	}
//	public void clickOnpauseFarziMushaira ()
//	{
//		pauseFarziMushaira.click();
//	}

}
