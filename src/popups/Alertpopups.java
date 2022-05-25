package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopups 
{
 public static void main(String[] args) throws InterruptedException
 {
	System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\LATEST CHROME WEB DRIVER\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
     		driver.get("https://demo.guru99.com/test/delete_customer.php");
     		//driver.manage().window().maximize();
     		driver.findElement(By.xpath("//input[@type='submit']")).click();
     		Alert alt=driver.switchTo().alert();
     		alt.accept();
     		String text=alt.getText();
            System.out.println(text);
            Alert altA=driver.switchTo().alert();
            altA.accept();
            String textA=altA.getText();
            System.out.println(textA);
     		driver.quit();
     		
 }
}
