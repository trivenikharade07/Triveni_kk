package TestPack4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pomclasses4.SearchFunctionalityDisney;
import Pomclasses4.SigninDisneyHotstar;





public class TestClass2 {
	
	  public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\chromedriver.exe") ;
			 
			WebDriver driverTest= new ChromeDriver ();
			
			driverTest.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
			driverTest.manage().window().maximize() ;
			driverTest.get("https://www.hotstar.com/in") ;
			
          SigninDisneyHotstar signinDisneyHotstar=new SigninDisneyHotstar(driverTest) ;
			
			signinDisneyHotstar.clickOnloginDisneyHotstar() ;
			signinDisneyHotstar.clickOnemailDisney() ;
			signinDisneyHotstar.sendOnemailidDisney() ;
			signinDisneyHotstar.clickOncontinueButtonDisney() ;
			signinDisneyHotstar.sendOnmobilenoDisney() ;
			signinDisneyHotstar.clickOncontinuebuttonverifymob() ;
			signinDisneyHotstar.clickOnsubmitDisney() ;
			
			SearchFunctionalityDisney searchFunctionalityDisney =new SearchFunctionalityDisney (driverTest) ;
			
			searchFunctionalityDisney.sendOnsearchDisney() ;
			searchFunctionalityDisney.clickOnsearchbarDisney() ;
			searchFunctionalityDisney.clickOnsearchSelectDisney() ;
			
	  }

}
