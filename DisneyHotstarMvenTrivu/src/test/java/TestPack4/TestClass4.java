package TestPack4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pomclasses4.LanguageDisneyHotstar;
import Pomclasses4.SigninDisneyHotstar;

public class TestClass4 {
	
	  public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\chromedriver.exe") ;
			 
			WebDriver driverTest= new ChromeDriver ();
			
			driverTest.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			driverTest.manage().window().maximize() ;
			driverTest.get("https://www.hotstar.com/in") ;
			
			SigninDisneyHotstar signinDisneyHotstar=new SigninDisneyHotstar(driverTest) ;
			
			signinDisneyHotstar.clickOnloginDisneyHotstar() ;
			signinDisneyHotstar.clickOnemailDisney() ;
			signinDisneyHotstar.sendOnemailidDisney() ;
			signinDisneyHotstar.clickOncontinueButtonDisney() ;
			signinDisneyHotstar.sendOnmobilenoDisney() ;
			signinDisneyHotstar.clickOnsubmitDisney() ;
			
			LanguageDisneyHotstar languageDisneyHotstar = new LanguageDisneyHotstar(driverTest) ;
			
			languageDisneyHotstar.clickOnThreedotsofHotstar() ;
			languageDisneyHotstar.clickOnlanguagebuttonHotstar() ;
			languageDisneyHotstar.clickOnmarathiselecthotstar() ;
	  }

}
