package practisepom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestClass 

{
    public static void main(String[] args)  
    
    {
    	 System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\LATEST CHROME WEB DRIVER\\chromedriver_win32\\chromedriver.exe");
   	  WebDriver driver=new ChromeDriver();
   	 
   	  driver.manage().window().maximize();
   	  
   	  driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
   	  
   	  // thread chya aivaji waits
   	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
   	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='txtPassword']")));
   	  
   	  // calling of actions wic was declare in pom class by reating obect of tat class
   	LogInPage1 loginpage = new LogInPage1(driver);
   	    //perform actions of send keys of username with help of refrence variable name loginpage
   	loginpage.sendusername();
   	//perform actions of send keys of password with help of refrence variable name loginpage
   	loginpage.sendpassword();
  //perform actions of click submit button with help of refrence variable name loginpage
   	loginpage.submitclick();      
   	// home page varc leave button click karaych
   	HomePage2leave leavebutton = new HomePage2leave(driver);
   	leavebutton.clickleavebutton();
    leavebutton.appyleave();
    //apply eave cha webapge aandle akaratana tya class ch object bnvava lagl
    Applyleave3 funtionperform=new Applyleave3(driver);
    funtionperform.appyforleave();
    funtionperform.subforleave();
    funtionperform.leavestart();
    funtionperform.leaveend();
    funtionperform.sideclick();
    funtionperform.finalapply();
	}
}
