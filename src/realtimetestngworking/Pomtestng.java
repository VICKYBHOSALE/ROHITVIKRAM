package realtimetestngworking;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import practisepom.HomePage2leave;
import practisepom2gobalwait.LogInPage1B;

public class Pomtestng
{   WebDriver driver;
WebDriverWait wait;
	@BeforeClass
	public void browserlaunch()
 {
  System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\LATEST CHROME WEB DRIVER\\chromedriver_win32\\chromedriver.exe");
   driver= new ChromeDriver();
  driver.get("https://opensource-demo.orangehrmlive.com/");  
    LogInPage1B inti = new LogInPage1B(driver);
    inti.getClass();
 }
	@Test(priority=1)
	public void oragehrlogin()
	{  LogInPage1B HRLOGIN = new LogInPage1B(driver);
	HRLOGIN.sendusername();
	HRLOGIN.sendpass();
	HRLOGIN.submitclick();
	System.out.println("log in again with valid credential");
	}
	@Test(priority=2)
	public void Borangehrhomepage()
	{
		HomePage2leave leavebutton = new HomePage2leave(driver);
	   	leavebutton.clickleavebutton();
	    leavebutton.appyleave();
	    System.out.println("apply for leave is start");
	}
	
	@BeforeMethod
	public void testcasestart()
	{
		System.out.println(" test case start");
	}
	
	@AfterMethod
	public void testcasedone()
	{
		System.out.println("test execution done");
	}
	@AfterClass
	public void quitbrowser()
	{
		driver.quit();
		System.out.println("browser is closed");
	}
	
	
	
	
	
}