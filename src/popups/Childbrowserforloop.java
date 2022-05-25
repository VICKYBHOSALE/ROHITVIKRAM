package popups;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowserforloop 
{
	public static void main(String[] args)
	  {
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\LATEST CHROME WEB DRIVER\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		WebElement Alerttry= driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		WebElement Confirmtry= driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
		WebElement Prompttry= driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
		WebElement Linetry= driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
		Alerttry.click();Confirmtry.click();Prompttry.click();Linetry.click();
		
		String MainwdAdd=driver.getWindowHandle();
		System.out.println(MainwdAdd);
		ArrayList<String>AllWdAdd=new ArrayList<String>(driver.getWindowHandles());
		for(int i=0;i<AllWdAdd.size();i++)
		{
			String ADD= AllWdAdd.get(i);
			driver.switchTo().window(ADD);
			String URL=driver.getCurrentUrl();
			System.out.println(URL+"    "+ADD);
		}
		
		
		
		
		
	  }
}
