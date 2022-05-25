package utility;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 

{   public static WebDriver driver;
	public static  void getscreenshot(WebDriver driver) throws IOException
	{
	    File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    Date currentdate=new Date();
	    System.out.println(currentdate);
	    String currentscreenshotdate = currentdate.toString().replace(" ", "_").replace(":", "_")+".jpg";
	    File dest = new File("D:\\SELENIUM\\takescreen\\"+currentscreenshotdate+".jpg");
	    FileHandler.copy(source, dest);
	}
	
    public static void main(String[] args) throws InterruptedException, IOException 
    
    {   //code to launch the webbrowser
    	System.setProperty("webdriver.gecko.driver","D:\\SELENIUM\\geckodriver-v0.30.0-win64\\geckodriver.exe");
  	  WebDriver driver =new FirefoxDriver();
		driver.navigate().to("https://www.mahavastu.maharashtra.gov.in/index.php?signin=1");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		getscreenshot(driver);
		WebElement emailid= driver.findElement(By.xpath("(//div[1]//input[1])[2]"));
		emailid.sendKeys("vikramsihbhosale95@gmail.com");
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.xpath("(//div[1]//input[1])[3]"));
		password.sendKeys("Vikram@18");
		Thread.sleep(2000);
		WebElement captch=driver.findElement(By.xpath("(//div[1]//input[1])[4]"));
		captch.sendKeys("6T2DX3");
		getscreenshot(driver);
			
	}
}
