
package browserlaunch;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// different task perform on webpage with using browser methods/
public class Browsermethods1 
{
   public static void main(String[] args) throws InterruptedException
   {
	  System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\LATEST CHROME WEB DRIVER\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://web.whatsapp.com/");
	  Thread.sleep(2000);
	  driver.navigate().to("https://www.mahavastu.maharashtra.gov.in/index.php?para=bW9kdWxlPWdlbmVyYWwmYWN0aW9uPWRhc2hib2FyZCZzZWx0eXBlPUI=");
	  Thread.sleep(2000);
	  driver.navigate().back();
	  Thread.sleep(2000);
	  driver.navigate().forward();
	  Thread.sleep(2000);
	  driver.navigate().refresh();
	  Thread.sleep(2000);
	  String url=driver.getCurrentUrl();
	  System.out.println(url);
	  Thread.sleep(2000);
	  String title=driver.getTitle();
	  System.out.println(title);
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.manage().window().minimize();
	   Thread.sleep(2000);
	   driver.manage().window().maximize();
	   driver.get("https://www.youtube.com/");
      Thread.sleep(2000);
      Dimension d =new Dimension(1200,1400);//(width,height) in pixel size and this is trial basis work of screen size
      driver.manage().window().setSize(d);
      Thread.sleep(2000);
      Point p = new Point(400,600);// it will work from where to start the origin (X,Y)
      driver.manage().window().setPosition(p);
      Thread.sleep(2000);
      driver.close();// close the tab when 2 or more browser are open in 1 web page to close that 1 particular tab
      Thread.sleep(2000);
      driver.quit();// close the all web browser
      
      
      
      
      
      
      
      
      
      
      
      

	  
	  
   }
}
