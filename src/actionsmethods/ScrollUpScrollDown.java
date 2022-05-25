package actionsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpScrollDown
{
 public static void main(String[] args) 
 {
	System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\LATEST CHROME WEB DRIVER\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/");
	//WebElement position = driver.findElement(By.xpath("//a[text()='Position']"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("arguments[0].scrollIntoView(true);", position);
	js.executeScript("window.scrollBy(0,1000)");// scroll down
	js.executeScript("window.scrollBy(0,-900)");//scroll up
	js.executeScript("window.scrollBy(500,0)");//scroll right
	js.executeScript("window.scrollBy(-500,0)");//scroll left
 }
}