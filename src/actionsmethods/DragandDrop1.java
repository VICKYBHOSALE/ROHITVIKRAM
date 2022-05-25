package actionsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop1
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\LATEST CHROME WEB DRIVER\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/droppable/");
	WebElement source = driver.findElement(By.xpath("//div[@id=\'draggable\']"));
	WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));
	Actions act = new Actions (driver);
	act.dragAndDrop(source, dest).build().perform()	;
	
}
}
