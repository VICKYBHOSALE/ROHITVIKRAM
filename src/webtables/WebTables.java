package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables
{
 public static void main(String[] args) throws InterruptedException
 {
	 System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\LATEST CHROME WEB DRIVER\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
	 driver.get("https://www.w3schools.com/html/html_tables.asp");
	 Thread.sleep(2000);
List<WebElement> Tabledata=driver.findElements(By.xpath("//table[@id='customers']//tr//td"));
	String cellvalue=Tabledata.get(0).getText();
	System.out.println(cellvalue);
	

 }
}
