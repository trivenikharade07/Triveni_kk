package TestNGPack;

import java.util.ArrayList;
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
import Pomclasses2.AmazonAddToCart;
import Pomclasses2.AmazonLogin;
import Pomclasses2.AmazonMiniTv;
import Pomclasses2.AmazonSearchFunctionality;
import Pomclasses2.AmazonSignOut;

public class TestNGClassFinal extends BrowserSetup {
	
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
		
		driverTest.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
		driverTest.manage().window().maximize() ;
	}
	
	@BeforeClass
	public void beforeClass()
	{
	//   System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\chromedriver.exe") ;	
	//		driverTest= new ChromeDriver ();
	//		driverTest.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
	//	driverTest.manage().window().maximize() ;
		System.out.println("Before Class");
		
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		 driverTest.get("https://www.amazon.in/") ;
		 System.out.println("Before Method");
	}
	
	@Test
	public void test1 ()
	{
		
		soft = new SoftAssert() ;
		AmazonLogin amazonLogin=new AmazonLogin (driverTest) ;
		 
		amazonLogin.clickOnhelloLoginButton() ;
		amazonLogin.sendOnamazonEmailAddLogin() ;
		amazonLogin.cliclOnamazonContinueButtonlogin() ;
		amazonLogin.sendOnmazonloginPassword() ;
		amazonLogin.clickOnamazonSigninButton() ;
		
		 String amazonLoginurl= driverTest.getCurrentUrl() ;
		 System.out.println(amazonLoginurl);
		 
		 
//			if(amazonLoginurl.equals("https://www.amazon.in/ap/signin"))
//			{
//				System.out.println("TestCaseoFamazonSearchFunctionalityIs=PASSED");
//			}
//			else
//			{
//				System.out.println("TestCaseofamazonSearchFunctionalityIs=Failed");
//			}
		 
		 String actualUrl= "https://www.amazon.in/ap/signin\"";
		 String expectedUrl= "https://www.amazon.in/ap/signin\"";
		 soft.assertEquals(actualUrl,expectedUrl);
		 soft.assertAll();
	
		System.out.println("Test1");
	}
	
	@Test
	public void test2()
	{
		 soft = new SoftAssert() ;
       AmazonSearchFunctionality amazonSearchFunctionality = new AmazonSearchFunctionality(driverTest) ;
		
		amazonSearchFunctionality.sendOnamazonSearchButton() ;
		amazonSearchFunctionality.clickOnamazonSearchBar();
        String amazonSearchFunctionalityurl= driverTest.getCurrentUrl() ;
		System.out.println(amazonSearchFunctionalityurl);
		
		
//		if(amazonSearchFunctionalityurl.equals("https://www.amazon.in/s?k=Applemobile14pro&crid=1HL5XI2KRCGK7&sprefix=%2Caps%2C170&ref=nb_sb_noss"))
//		{
//			System.out.println("TestCaseoFamazonSearchFunctionalityIs=PASSED");
//		}
//		else
//		{
//			System.out.println("TestCaseofamazonSearchFunctionalityIs=Failed");
//		}
		
		 String actualUrl="https://www.amazon.in/s?k=Applemobile14pro&crid=1HL5XI2KRCGK7&sprefix=%2Caps%2C170&ref=nb_sb_noss";
		 String expectedUrl="https://www.amazon.in/s?k=Applemobile14pro&crid=1HL5XI2KRCGK7&sprefix=%2Caps%2C170&ref=nb_sb_noss";
		 soft.assertEquals(actualUrl,expectedUrl);
		 soft.assertAll();
	
		System.out.println("Test2");
		
	}
	
	@Test
	public void test3()
	{
		
	      soft = new SoftAssert() ;
		   AmazonSearchFunctionality amazonSearchFunctionality = new AmazonSearchFunctionality(driverTest) ;
			
			amazonSearchFunctionality.sendOnamazonSearchButton() ;
			amazonSearchFunctionality.clickOnamazonSearchBar();
			
		    AmazonAddToCart amazonAddToCart = new AmazonAddToCart (driverTest) ;
			amazonAddToCart.clickOnamazonProduct() ;
			
			ArrayList<String> addr1 = new ArrayList<String>(driverTest.getWindowHandles()); 	 
			driverTest.switchTo().window(addr1.get(1));
			
			amazonAddToCart.clickOnamazonAddToCart() ;
			amazonAddToCart.clickOnclosebttonAddToCart();

			String amazonAddToCarturl = driverTest.getCurrentUrl() ;
			System.out.println(amazonAddToCarturl);
			
//			if(amazonAddToCarturl.equals("https://www.amazon.in/Apple-iPhone-128GB-Space-Black/dp/B0BDJ7P6NG/ref=sr_1_1_sspa?keywords=apple%2Bmobile%2B14%2Bpro&qid=1675273232&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1#"))
//			{
//				System.out.println("TestCaseoFamazonAddToCartIs=PASSED");
//			}
//			else
//			{
//				System.out.println("TestCaseoFamazonAddToCartIs=Failed");
//			}
			
			String actualUrl="https://www.amazon.in/Apple-iPhone-128GB-Space-Black/dp/B0BDJ7P6NG/ref=sr_1_1_sspa?keywords=apple%2Bmobile%2B14%2Bpro&qid=1675273232&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1#";
			 String expectedUrl="https://www.amazon.in/Apple-iPhone-128GB-Space-Black/dp/B0BDJ7P6NG/ref=sr_1_1_sspa?keywords=apple%2Bmobile%2B14%2Bpro&qid=1675273232&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1#";
			 soft.assertEquals(actualUrl,expectedUrl);
			 soft.assertAll();
	}
	

	@Test
	public void test4()
	{
		soft = new SoftAssert() ;
		AmazonMiniTv amazonMiniTv = new AmazonMiniTv (driverTest) ;
		amazonMiniTv.clickOnamazonMiniTvButton() ;
		amazonMiniTv.clickOnamazoznComedy() ;
		amazonMiniTv.clickOnfarziMushaira() ;
		amazonMiniTv.clickOnplayFarziMushaira() ;
		
		String amazonMiniTvurl = driverTest.getCurrentUrl() ;
		System.out.println(amazonMiniTv);
		
//		if(amazonMiniTv.equals("https://www.amazon.in/Apple-iPhone-128GB-Space-Black/dp/B0BDJ7P6NG/ref=sr_1_1_sspa?keywords=apple%2Bmobile%2B14%2Bpro&qid=1675271654&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1#"))
//		{
//			System.out.println("TestCaseoFamazonMiniTvIs=PASSED");
//		}
//		else
//		{
//			System.out.println("TestCaseoFamazonMiniTvIs=Failed");
//		}

		 String actualUrl="https://www.amazon.in/Apple-iPhone-128GB-Space-Black/dp/B0BDJ7P6NG/ref=sr_1_1_sspa?keywords=apple%2Bmobile%2B14%2Bpro&qid=1675271654&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1#";
		 
		 String expectedUrl="https://www.amazon.in/Apple-iPhone-128GB-Space-Black/dp/B0BDJ7P6NG/ref=sr_1_1_sspa?keywords=apple%2Bmobile%2B14%2Bpro&qid=1675271654&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1#";
		 soft.assertEquals(actualUrl,expectedUrl);
		 soft.assertAll();
		
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass()
	{
			AmazonSignOut amazonSignOut=new AmazonSignOut(driverTest);
			ArrayList<String> addr1 = new ArrayList<String>(driverTest.getWindowHandles());	 
			 driverTest.switchTo().window(addr1.get(0));
			 
			amazonSignOut.clickOnamazonhelloTriveniButton() ;
			amazonSignOut.clickOnamazonSignOut() ;
			
			String amazonSignOuturl = driverTest.getCurrentUrl() ;
			System.out.println(amazonSignOuturl);
			
//			if(amazonSignOuturl.equals("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0"))
//			{
//				System.out.println("TestCaseofIs=PASSED");
//			}
//			else
//			{
//				System.out.println("TestCaseoFSignoutIs=Failed");
//			}
			
			System.out.println("After Method") ;
		    driverTest.quit();
		  
		System.out.println("After Classs");
	    System.out.println("After method");
	    System.out.println("Before class");
	    System.out.println("after class");
	    System.out.println("");
	    
	}	
	
}
