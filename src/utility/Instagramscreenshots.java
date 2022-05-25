package utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Instagramscreenshots 
{
 WebDriver driver;
 public static void screenshot(WebDriver driver) throws IOException
 {
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Date currentdate=new Date();
	System.out.println(currentdate);
	String currentscreenshotdate = currentdate.toString().replace(" ", "_").replace(":", "_")+".jpg";
    File dest = new File("D:\\SELENIUM\\takescreen\\"+currentscreenshotdate+".jpg");
    FileHandler.copy(source, dest);
 }
  public static void main(String[] args) throws InterruptedException, IOException
  {
	  System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\LATEST CHROME WEB DRIVER\\chromedriver_win32\\chromedriver.exe");
  	  WebDriver driver =new ChromeDriver();
  	  driver.get("https://www.instagram.com/");
  	  Thread.sleep(2000);
  	 
  	  driver.findElement(By.xpath("(//input[@class='_2hvTZ pexuQ zyHYP'])[1]")).sendKeys("9834047757");
  	  Thread.sleep(1000);
  	  WebElement pwd= driver.findElement(By.xpath("//input[@name=\"password\"]"));
  	  Thread.sleep(1000);
  	  boolean result2=pwd.isEnabled();
  	  System.out.println(result2+"  LOGIN BUTTON INTERACTABLE");
  	  Thread.sleep(2000);
  	  pwd.sendKeys("Vikram@18");
  	screenshot(driver);
 
  	  WebElement login = driver.findElement(By.xpath("//div[text()='Log In']"));
  	Thread.sleep(2000);
  	  boolean result =login.isDisplayed();
  	  System.out.println(result);
  	  boolean result1 = login.isEnabled();
  	  System.out.println(result1);	 
  	  login.click();
  	 // driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div/div/div/button")).click();
  	  Thread.sleep(3000);
  	  screenshot(driver);
  }
 
}
