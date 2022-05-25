package browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_browser
{
    public static void main(String[] args) throws InterruptedException
    
    {
	  System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\LATEST CHROME WEB DRIVER\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://mahavastu.maharashtra.gov.in/index.php?signin=1");// bpms url launch krel
	  Thread.sleep(6000);// kahi vel pause gheil execution la throw karav lagt interrupted execution mnun like warning
	  driver.get("https://www.youtube.com/watch?v=8nF7txM7mdU");//you tube url launch krel 6000 mili sec nantr
	  driver.navigate().back();// get nantr pan navigate use krun back jata yet browser mde
	  driver.navigate().forward();// get nantr pan navigate use krun forward jata yet browser mde
	  
	}
}
