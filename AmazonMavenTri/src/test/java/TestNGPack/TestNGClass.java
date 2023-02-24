package TestNGPack;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
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
import Pomclasses2.AmazonAddToCart;
import Pomclasses2.AmazonLogin;
import Pomclasses2.AmazonSearchFunctionality;
import Pomclasses2.AmazonSignOut;
import Pomclasses2.AmazonSignup;

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
	public void verify()
	{
        System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\chromedriver.exe") ;	
		driverTest= new ChromeDriver ();
		driverTest.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
		driverTest.manage().window().maximize() ;
		System.out.println("Before Class");
		
	}
	
	@BeforeMethod
	public void VerifyLaunchAmazon ()
	{
		driverTest.get("https://www.amazon.in/") ;
		
	}
	
	@Test
	public void test1 ()
	{

        AmazonSignup amazonSignup = new AmazonSignup (driverTest) ;	
		
		amazonSignup.clickOnhelloSigninButton() ;
		amazonSignup.clickOnamazoncreateAccount() ;
		amazonSignup.sendOnfirstAndLastName();
		amazonSignup.sendOnamazonMobileNumber();
		amazonSignup.sendOnamazonPassword();
		amazonSignup.clickOnamazonContinueButton() ;
		
        String amazonSignupyurl= driverTest.getCurrentUrl() ;
		System.out.println(amazonSignupyurl);
		
		
//		if(amazonSignupyurl.equals(""))
//		{
//			System.out.println("TestCaseoFamazonSignupIs=PASSED");
//		}
//		else
//		{
//			System.out.println("TestCaseofamazonSignupIs=Failed");
//		}
        
		System.out.println("Test1");
	}
	
	
	@AfterMethod
	public void afterMethod()
	
	{
//		AmazonSignOut amazonSignOut=new AmazonSignOut(driverTest);
////		ArrayList<String> addr1 = new ArrayList<String>(driverTest.getWindowHandles());	 
////		 driverTest.switchTo().window(addr1.get(0));
//		 
//		amazonSignOut.clickOnamazonhelloTriveniButton() ;
//		amazonSignOut.clickOnamazonSignOut() ;
//		
//		String amazonSignOuturl = driverTest.getCurrentUrl() ;
//		System.out.println(amazonSignOuturl);
//		
//		if(amazonSignOuturl.equals("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0"))
//		{
//			System.out.println("TestCaseofIs=PASSED");
//		}
//		else
//		{
//			System.out.println("TestCaseoFSignoutIs=Failed");
//		}
		
		System.out.println("After Method");		
	}
	
	
	@AfterClass
	
	public void afterClass()
	{	
	    // driverTest.quit();
		System.out.println("After Class") ;	
		System.out.println("Before Class") ;
		System.out.println("After Method") ;
		System.out.println("Before Method") ;
		System.out.println("Test") ;
		
	}	
	
}

