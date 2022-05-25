package browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxbrowser 
{public static void main(String[] args) 
{
	  
    {   //  
	  System.setProperty("webdriver.gecko.driver","D:\\SELENIUM\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	  WebDriver driver =new FirefoxDriver();
	  driver.get("https://web.whatsapp.com/");   
	}
    
  
}
}
