package realworkwithtestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testngclass
{  WebDriver driver;
   @BeforeClass
   public void broweserlaunch()
   {
    System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\LATEST CHROME WEB DRIVER\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
    System.out.println("chrome browser is launch");
    Pomclassfindbyannotation inti = new Pomclassfindbyannotation(driver);
    inti.getClass();
    
  	
   }
   @BeforeMethod
   public void positivelogin()
   {   Pomclassfindbyannotation testcases = new Pomclassfindbyannotation(driver);
	   testcases.validsendusername();
	   testcases.validsendpassword();
	   testcases.validsubmitclick();
	   System.out.println("valid entry and login done"); 
   }
   @Test
   public void logoutvalidation() throws InterruptedException
   {  
	   Pomclassfindbyannotation testcasesA = new Pomclassfindbyannotation(driver);
	   System.out.println("logout is done");
	   testcasesA.clickforwelcome();
	 
	   testcasesA.clickonlogout();
	 
   }
   @AfterMethod(timeOut=5000)
   public void negativelogin()
   {  Pomclassfindbyannotation testcasesB = new Pomclassfindbyannotation(driver);
	   testcasesB.invalidsendusername();
	   testcasesB.invalidsendpassword();
	   testcasesB.validsubmitclick();
	   System.out.println("negative testcase failed");
   }
   @AfterClass(timeOut=50000)
   public void browserquit()
   {   
	   System.out.println("browser close");
	   driver.quit();
   }
   
   
}
