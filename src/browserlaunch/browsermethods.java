package browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browsermethods
{
         public static void main(String[] args) throws InterruptedException
      {
     		// code to launch the browser.
     		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\LATEST CHROME WEB DRIVER\\chromedriver_win32\\chromedriver.exe");
     		WebDriver driver = new ChromeDriver();
     		
     		// to enter the url.
     		driver.get("https://www.google.com/");
     		Thread.sleep(6000);
     		
     		// what is current url.
     		String url = driver.getCurrentUrl();
     		System.out.println(url);
     		
     		// to get the title of the tab.
     		String expectedtitle="Google";
     		String actualtitle = driver.getTitle();
     		System.out.println(actualtitle);
     	
     		if (expectedtitle.equalsIgnoreCase(actualtitle)) {
     			System.out.println("Testcase is passed");
     		}else {
     			System.out.println("Testcase is failed");
     		}
     		Thread.sleep(6000);
     		// maximize the browser.
     		driver.manage().window().maximize();
     		Thread.sleep(6000);
     		/// you cannnot minimize of the browser in earlier version
     	  // cz selenium not supported the toolbar access of sysytem if we minimize then webbased application go in 
     		// desktop tool bar so we cant to minimize but now selenium java 4.1.2 version we can use minimize and
     		// and we perform some task after webpage minimize

     		// navigate.
     		driver.navigate().to("https://www.facebook.com/");
     		Thread.sleep(6000);
     		driver.navigate().back();      /// google
     		Thread.sleep(6000);
     		driver.navigate().forward();   /// facebook
     		Thread.sleep(6000);
     		driver.navigate().refresh();
     		Thread.sleep(6000);
     		
     		// you can not minmize but you can set the size. (this is trial and error)
     		
     		org.openqa.selenium.Dimension d= new org.openqa.selenium.Dimension(100,300);
     		driver.manage().window().setSize(d);
     		Thread.sleep(6000);
     		
     		// set the position on screen.(this is trial and error)
     		org.openqa.selenium.Point p	= new org.openqa.selenium.Point(500,800);
     		driver.manage().window().setPosition(p);
     		Thread.sleep(6000);
     		
     		Thread.sleep(2000);  // This is wait provided in milliseconds to control the script execution speed.
     		
     		// to close the browser. 
     		driver.close();
     		Thread.sleep(6000);
     		
     		driver.quit();
     		// close command and quit command:- close command==> will close current tab only. quit command will close all the tabs.
     	}
     }
	  

