package Testpack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pomclasses2.AmazonLogin;
import Pomclasses2.AmazonSignOut;

public class TestClassSignOutAmazon {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\chromedriver.exe") ;
		WebDriver driverTest= new ChromeDriver () ;
		driverTest.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS) ;
		driverTest.manage().window().maximize() ;	
		driverTest.get("https://www.amazon.in/") ;
		
		
		AmazonLogin amazonLogin=new AmazonLogin (driverTest) ;
		
		amazonLogin.clickOnhelloLoginButton() ;
		amazonLogin.sendOnamazonEmailAddLogin() ;
		amazonLogin.cliclOnamazonContinueButtonlogin() ;
		amazonLogin.sendOnmazonloginPassword() ;
		amazonLogin.clickOnamazonSigninButton() ;
		
		AmazonSignOut amazonSignOut=new AmazonSignOut(driverTest);
		amazonSignOut.clickOnamazonhelloTriveniButton() ;
		amazonSignOut.clickOnamazonSignOut() ;
		
}

}
