package browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelementwithusingbyclass 
{
   public static void main(String[] args) throws InterruptedException 
   
   {  
	  System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\LATEST CHROME WEB DRIVER\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(2500);
	  
	  Dimension d =new Dimension(300,800);//(width,height) in pixel size and this is trial basis work of screen size
      driver.manage().window().setSize(d);
      Thread.sleep(2500);
      
      WebElement username=driver.findElement(By.id("email"));
      username.sendKeys("vikrambhosale100@gmail.com");
      WebElement pass=driver.findElement(By.id("pass"));
      pass.sendKeys("123 456789@");
      username.sendKeys("vikrambhosale100@gmail.com");
      WebElement LogIn =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
      LogIn.click(); 
    
      
          
   }
}
