package browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_browser_Chromebrowser
{
	  public static void main(String[] args) 
	  {
		  
		    {    // fire fox browser use kel url mde whatsapp web ghetl
			  System.setProperty("webdriver.gecko.driver","D:\\SELENIUM\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			  WebDriver driver =new FirefoxDriver();// like upcasting object sub to superclass mnjech upcasting sarkh
			  //syntax ahe superclass refrence obj name= new constructor of sub class
			  driver.get("https://web.whatsapp.com/");// url of whats app
			  
			}
		    {   // chrome browser use kel url mde bpms bolvl 
		  	  System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		  	  WebDriver driver =new ChromeDriver();//like upcasting object sub to superclass mnjech upcasting sarkh
			  //syntax ahe superclass refrence obj name= new constructor of sub class
		  	  driver.get("https://mahavastu.maharashtra.gov.in/index.php?signin=1");// url of bpms 
		  	  
		  	}
		    
		  
	  }

}
