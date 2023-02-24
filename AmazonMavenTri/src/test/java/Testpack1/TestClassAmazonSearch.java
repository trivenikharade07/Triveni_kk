package Testpack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pomclasses2.AmazonSearchFunctionality;
import Pomclasses2.AmazonSignup;

public class TestClassAmazonSearch {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\chromedriver.exe") ;
		WebDriver driverTest= new ChromeDriver ();
		driverTest.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		driverTest.manage().window().maximize() ;	
		driverTest.get("https://www.amazon.in/") ;
		
		
		AmazonSearchFunctionality amazonSearchFunctionality = new AmazonSearchFunctionality(driverTest) ;
		amazonSearchFunctionality.sendOnamazonSearchButton() ;
		amazonSearchFunctionality.clickOnamazonSearchBar();
		amazonSearchFunctionality.clickOnamazonSearchBar();
	    amazonSearchFunctionality.clickOnamazonSearchBar() ;
 
	  
	}
}
