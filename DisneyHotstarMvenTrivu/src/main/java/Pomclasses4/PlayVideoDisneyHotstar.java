package Pomclasses4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlayVideoDisneyHotstar {

	
	@FindBy(xpath="(//div[@class='details'])[21]")
	private WebElement playVideoHotstar;
	
	@FindBy(xpath="//img[@alt='pause']")
	private WebElement pausevideoHotstar ;
	
	//constructor : Initialization  of WebElements :
	
	private WebDriver driver ;
	private Actions action ;
	private WebDriverWait wait;
	
	public PlayVideoDisneyHotstar(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver ;
		action =new Actions(this.driver) ;
		wait = new WebDriverWait(driver,20) ;
	}

	public void clickOnplayVideoHotstar() 
	{
		playVideoHotstar.click();
	}
	public void clickOnpausevideoHotstar()
	{
		pausevideoHotstar.click();
	}
	
}
