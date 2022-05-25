package actionsmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazonlogin 
{  
  public static void main(String[] args) throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\LATEST CHROME WEB DRIVER\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebDriverWait	wait= new WebDriverWait(driver,Duration.ofSeconds(20));
  		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]")));
		Actions act = new Actions(driver);
		WebElement VIKRAM = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]"));

		act.moveToElement(VIKRAM).build().perform();
		
		driver.findElement(By.xpath("//span[@class='nav-text'and text()='Your Orders']")).click();	
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9834047757");
		act.click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[2]/span")).click();
		act.click().build().perform();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div[1]/div/div/form/div/div[1]/input")).sendKeys("Vikram@18");
		act.click().build().perform();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div[1]/div/div/form/div/div[2]/span")).click();
		act.click().build().perform();
		driver.quit();
  }
}
