package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserSetup {


	public static WebDriver openChromeBrowser ()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\chromedriver.exe") ;
		WebDriver driver = new ChromeDriver() ;
		return driver ;
	}
	
	public static WebDriver openFireFoxBrowser() 
	{
		System.setProperty("webdriver.gecko.driver","D:\\Automation\\Selenium\\geckodriver-v0.32.2-win-aarch64") ;
		WebDriver driver = new FirefoxDriver() ;
		return driver ;
	}
	
	public static WebDriver openOperaBrowser() 
	{
		System.setProperty("webdriver.opera.driver","D:\\Automation\\Selenium\\operadriver_win64") ;
		WebDriver driver = new OperaDriver() ;
		return driver ;
	}

}

