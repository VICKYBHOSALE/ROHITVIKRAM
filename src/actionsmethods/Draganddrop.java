package actionsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop 
{
  public static void main(String[] args) throws InterruptedException
  
  {System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\LATEST CHROME WEB DRIVER\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://tiermaker.com/create/top-cricket-players-72452");
	Thread.sleep(10000);
	driver.manage().window().maximize();
	WebElement source= driver.findElement(By.xpath("//div[@id='11']"));
	Thread.sleep(2000);
	WebElement dest = driver.findElement(By.xpath("(//div[@class='tier sort'])[1]"));
	Thread.sleep(2000);
	WebElement sourcedhoni=driver.findElement(By.xpath("//div[@id=\'15\']"));
	WebElement destdhoni = driver.findElement(By.xpath("(//div[@class='tier sort'])[5]"));
	Actions act = new Actions(driver);
	act.dragAndDrop(source, dest).build().perform();
	act.dragAndDrop(sourcedhoni, destdhoni).perform();  }
}
