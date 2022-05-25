package popups;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopups 

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
	String Mainadd=AllWdAdd.get(0);//0 index var nehmi main window cha address asel
	System.out.println(Mainadd);
	String linewd=AllWdAdd.get(1);
	System.out.println(linewd);
	String promptwd=AllWdAdd.get(2);
	System.out.println(promptwd);
	String confirmtwd=AllWdAdd.get(3);
	System.out.println(confirmtwd);
	String alerttwd=AllWdAdd.get(4);
	System.out.println(alerttwd);
	String MainwdURL=driver.getCurrentUrl();
	System.out.println(MainwdURL);
	driver.switchTo().window(AllWdAdd.get(1));
	String lineaddwd=driver.getCurrentUrl();
	System.out.println(lineaddwd);
	driver.switchTo().window(AllWdAdd.get(2));
	String promptaddwd=driver.getCurrentUrl();
	System.out.println(promptaddwd);
	driver.switchTo().window(AllWdAdd.get(3));
	String confirmwdadd=driver.getCurrentUrl();
	System.out.println(confirmwdadd);
	driver.switchTo().window(AllWdAdd.get(4));
	String alertwdadd=driver.getCurrentUrl();
	System.out.println(alertwdadd);
	
	
	
	
	
  }
}
