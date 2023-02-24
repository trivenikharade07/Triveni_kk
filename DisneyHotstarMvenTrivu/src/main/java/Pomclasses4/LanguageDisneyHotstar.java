package Pomclasses4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LanguageDisneyHotstar {
	
	@FindBy(xpath="(//span[@class='line'])[2]")
	private WebElement ThreedotsofHotstar ;
	
	@FindBy(xpath="//div[@class='iconClass languages']")
	private WebElement languagebuttonHotstar  ;
	
	@FindBy(xpath="//img[@alt='Marathi']")
	private WebElement marathiselecthotstar ;
	
  
	//constructor : Initialization  of WebElements :
	
	private WebDriver driver ;
	private Actions action ;
	private WebDriverWait wait;
	
	public LanguageDisneyHotstar(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver ;
		action =new Actions(this.driver) ;
		wait = new WebDriverWait(driver,20) ;
	}
	//methods : initialization of WebElements :
	public void clickOnThreedotsofHotstar ()
	{
		ThreedotsofHotstar.click();
	}
	public void clickOnlanguagebuttonHotstar ()
	{
		languagebuttonHotstar.click();
	}
	public void clickOnmarathiselecthotstar () 
	{
		marathiselecthotstar.click();
	}
	
	

}
