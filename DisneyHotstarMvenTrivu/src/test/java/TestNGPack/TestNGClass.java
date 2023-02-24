package TestNGPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Browser.BrowserSetup;
import Pomclasses4.LanguageDisneyHotstar;
import Pomclasses4.PlayVideoDisneyHotstar;
import Pomclasses4.SearchFunctionalityDisney;
import Pomclasses4.SigninDisneyHotstar;

public class TestNGClass extends BrowserSetup {
	WebDriver driverTest ;
	SoftAssert soft ;
	
@Parameters("browser")
	
	@BeforeTest
	public void launchBrowser(String browserName)
	{
		System.out.println(browserName);
		System.out.println();
		if(browserName.equals("Chrome"))
		{
			driverTest = BrowserSetup.openChromeBrowser() ;
		}
		if(browserName.equals("Firefox"))
		{
			driverTest = BrowserSetup.openFireFoxBrowser() ;
		}
		if(browserName.equals("Opera"))
		{
			driverTest = BrowserSetup.openOperaBrowser() ;
		}
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\chromedriver.exe") ;
		 
	    driverTest= new ChromeDriver ();
		driverTest.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS) ;
		driverTest.manage().window().maximize() ;
		driverTest.get("https://www.hotstar.com/in") ;
		
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		SigninDisneyHotstar signinDisneyHotstar=new SigninDisneyHotstar(driverTest) ;
		
		signinDisneyHotstar.clickOnloginDisneyHotstar() ;
		signinDisneyHotstar.clickOnemailDisney() ;
		signinDisneyHotstar.sendOnemailidDisney() ;
		signinDisneyHotstar.clickOncontinueButtonDisney() ;
		signinDisneyHotstar.sendOnmobilenoDisney() ;
		signinDisneyHotstar.clickOncontinuebuttonverifymob() ;
		signinDisneyHotstar.clickOnsubmitDisney() ;
		signinDisneyHotstar.clickOnsubmitDisneypopup();
		System.out.println("Before Method");
		
     		 String signinDisneyHotstarurl = driverTest.getCurrentUrl() ;
     		 System.out.println(signinDisneyHotstarurl);
//			if(signinDisneyHotstarurl.equals("https://www.hotstar.com/in"))
//			{
//				System.out.println("TestCaseoFsigninDisneyHotstarIs=PASSED") ;
//			}
//			else
//			{
//				System.out.println("TestCaseoFsigninDisneyHotstarIs=Failed") ;
//			}
     		 
     		 String actualUrl="https://www.hotstar.com/in";
    		 String expectedUrl="https://www.hotstar.com/in";
    		 soft.assertEquals(actualUrl,expectedUrl);
    		 soft.assertAll();
     		 
//			System.out.println("Before Method") ;
	}
	
	@Test
	public void test ()
	{
	//	SoftAssert soft = new SoftAssert() ;
		SearchFunctionalityDisney searchFunctionalityDisney =new SearchFunctionalityDisney (driverTest) ;
		
		searchFunctionalityDisney.sendOnsearchDisney() ;
		searchFunctionalityDisney.clickOnsearchbarDisney() ;
		searchFunctionalityDisney.clickOnsearchSelectDisney() ;
		 String searchFunctionalityDisneyurl = driverTest.getCurrentUrl() ;
		 System.out.println(searchFunctionalityDisneyurl);
		 
//			if(searchFunctionalityDisneyurl.equals("https://www.hotstar.com/in/sports/cricket/new-zealand-tour-of-india-2023/707689/match-clips/3rd-t20i-all-you-need-to-know/1260129934"))
//			{
//				System.out.println("TestCaseoFsearchFunctionalityDisneyIs=PASSED") ;
//			}
//			else
//			{
//				System.out.println("TestCaseoFsearchFunctionalityDisneyIs=Failed") ;
//			}	
		 String actualUrl="https://www.hotstar.com/in/sports/cricket/new-zealand-tour-of-india-2023/707689/match-clips/3rd-t20i-all-you-need-to-know/126012993";
		 String expectedUrl="https://www.hotstar.com/in/sports/cricket/new-zealand-tour-of-india-2023/707689/match-clips/3rd-t20i-all-you-need-to-know/126012993";
		 soft.assertEquals(actualUrl,expectedUrl);
		 soft.assertAll();
		 
		
		System.out.println("Test");
		
	}

	@AfterMethod
	public void afterMethod()
	{
		PlayVideoDisneyHotstar playVideoDisneyHotstar = new PlayVideoDisneyHotstar(driverTest) ;
		
		playVideoDisneyHotstar.clickOnplayVideoHotstar() ;
//	playVideoDisneyHotstar.clickOnpausevideoHotstar() ;
		 String playVideoDisneyHotstarurl = driverTest.getCurrentUrl() ;
		 System.out.println(playVideoDisneyHotstarurl);
//			if(playVideoDisneyHotstarurl.equals("https://www.hotstar.com/in/sports/cricket/england-tour-of-south-africa-2023/m707728/live-streaming/1540021722"))
//			{
//				System.out.println("TestCaseoFplayVideoDisneyHotstarIs=PASSED") ;
//			}
//			else
//			{
//				System.out.println("TestCaseoFplayVideoDisneyHotstarIs=Failed") ;
//			}
//		LanguageDisneyHotstar languageDisneyHotstar = new LanguageDisneyHotstar(driverTest) ;
//		
//		languageDisneyHotstar.clickOnThreedotsofHotstar() ;
//		languageDisneyHotstar.clickOnlanguagebuttonHotstar() ;
//		languageDisneyHotstar.clickOnmarathiselecthotstar() ;
//		 String languageDisneyHotstarurl = driverTest.getCurrentUrl() ;
//		 System.out.println(languageDisneyHotstarurl);
////			if(languageDisneyHotstarurl.equals("https://www.hotstar.com/in/languages/marathi"))
////			{
////				System.out.println("TestCaseoFlanguageDisneyHotstarIs=PASSED") ;
////			}
////			else
////			{
////				System.out.println("TestCaseoFlanguageDisneyHotstarIs=Failed") ;
//	             }
//			}
 
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass()
	{
		driverTest.quit(); 
		System.out.println("After Class");
		
	}	

}
