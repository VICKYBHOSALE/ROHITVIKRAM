package webelemtmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISselectedISdisplayedISenabled 

{
	public static void main(String[] args) throws InterruptedException 
	{
	 System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\LATEST CHROME WEB DRIVER\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.navigate().to("https://www.facebook.com/");
	 Thread.sleep(1000);
	 driver.manage().window().maximize();
	 WebElement createAC= driver.findElement(By.xpath("(//div[1]//a[1])[5]"));
	 createAC.click();
	 Thread.sleep(1000);
	 WebElement mailradio= driver.findElement(By.xpath("(//span//label)[2]"));
	 boolean result= mailradio.isSelected();
	 System.out.println(result);
	 if(result==false)
	 {
		 System.out.println("mail radio button is not");
	 }
	 else 
	 {
		 System.out.println("please select male radio buttton");
	 }
	 WebElement customradio=driver.findElement(By.xpath("//label[text()='Custom']"));
	 customradio.click();
	 WebElement customselectbar= driver.findElement(By.xpath("(//div//select)[4]"));
	 boolean result1= customselectbar.isDisplayed();
	 System.out.println(result1);
	 if(result==true);
	 {
		 System.out.println("custom radio is click so selectbar is visible");
	 }
	WebElement signup=driver.findElement(By.xpath("//button[text()='Sign Up']"));
	Thread.sleep(3000);
	String Textonsignupbtn=signup.getText();
	System.out.println(Textonsignupbtn);
	String attribute=signup.getAttribute("type");
	System.out.println(attribute);
	
	}
}

