package Pomclasses4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchFunctionalityDisney {
	
	@FindBy(xpath="//input[@id='searchField']")
	private WebElement searchDisney ;
	
	@FindBy(xpath="//div[@class='search-wrap']")
	private WebElement searchbarDisney ;
	
	@FindBy(xpath="(//span[@class='content-title'])[1]")
	private WebElement searchSelectDisney ;
	
	//Constructor
	private WebDriver driver ;
	private Actions action ;
	private WebDriverWait wait;
	
	public SearchFunctionalityDisney(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver ;
		action =new Actions(this.driver) ;
		wait = new WebDriverWait(driver,20) ;
	}
	//methods
	public void sendOnsearchDisney ()
	{
		searchDisney.sendKeys("mahabharat");
	}
	public void clickOnsearchbarDisney ()
	{
		searchbarDisney.click();
	}
	public void clickOnsearchSelectDisney () 
	{
		searchSelectDisney.click();
	}

}
