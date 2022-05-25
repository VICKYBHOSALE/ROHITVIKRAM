package findelementsmethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements 

{
public static void main(String[] args)
 {

	System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\LATEST CHROME WEB DRIVER\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/js/js_popup.asp");
	List<WebElement> links=driver.findElements(By.xpath("//a"));
	int j=links.size();
	System.out.println(j);// total link kiti he get krt
	List<WebElement> buttons = driver.findElements(By.xpath("//a[text()='Try it Yourself »']"));
	int i = buttons.size();
	System.out.println(i);
	for(i=0;i<buttons.size();i++)
	{
	    buttons.get(i).click();
	    
	}
	
 }
}
