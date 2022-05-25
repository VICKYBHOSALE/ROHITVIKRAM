package practisepom1wait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass1A
{

    public static void main(String[] args)  
    
    {
    	 System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\LATEST CHROME WEB DRIVER\\chromedriver_win32\\chromedriver.exe");
   	  WebDriver driver=new ChromeDriver();
   	 
   	  driver.manage().window().maximize();
   	  
   	  driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
   	  
   	  LogInPage1A LOGIN = new LogInPage1A(driver);
   	LOGIN.sendusername();
   	LOGIN.sendpass();
   	LOGIN.submitclick();
   }
}
