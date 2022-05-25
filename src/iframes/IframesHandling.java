package iframes;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframesHandling

{
public static void main(String[] args) throws InterruptedException 
 {
	System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\LATEST CHROME WEB DRIVER\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.w3schools.com/js/js_popup.asp");
	WebElement Alerttry= driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
    Alerttry.click();
    ArrayList<String>AllWdAdd=new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(AllWdAdd.get(1));
    driver.switchTo().frame("iframeResult");// i frame var swtich karav lagel
    WebElement tryit=driver.findElement(By.xpath("//button[text()='Try it']"));
    tryit.click();
    Thread.sleep(1000);
    driver.switchTo().alert().dismiss();
    Thread.sleep(1000);
    //driver.quit();
    //driver.switchTo().defaultContent();
    driver.switchTo().parentFrame();// main webpage vrch confirm la click karnyasati adhi switch kel
    Thread.sleep(2000);
    WebElement theme= driver.findElement(By.xpath("//a[@title='Change Theme']"));
    theme.click();
    Thread.sleep(5000);
    driver.switchTo().defaultContent();
    Thread.sleep(5000);
    WebElement html=driver.findElement(By.xpath("//a[text()='HTML']"));
    html.click();
    driver.quit();
    
    
 }
}
