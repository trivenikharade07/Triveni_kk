package Testpack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pomclasses2.AmazonSignup;


public class TestClassAmazonSignIn {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\chromedriver.exe") ;
		
		WebDriver driverTest= new ChromeDriver ();
		
		driverTest.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		
		driverTest.manage().window().maximize() ;
		
		driverTest.get("https://www.amazon.in/") ;
	
		AmazonSignup amazonSignup = new AmazonSignup (driverTest) ;	
		
		amazonSignup.clickOnhelloSigninButton() ;
		amazonSignup.clickOnamazoncreateAccount() ;
		amazonSignup.sendOnfirstAndLastName();
		amazonSignup.sendOnamazonMobileNumber();
		amazonSignup.sendOnamazonPassword();
		amazonSignup.clickOnamazonContinueButton() ;
		

	}

}
