package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtablesforloop 
{
  public static void main(String[] args) throws InterruptedException
     {

      System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\LATEST CHROME WEB DRIVER\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
      driver.get("https://www.w3schools.com/html/html_tables.asp");
      Thread.sleep(2000);
      
     
	  
	  for(int j=2;j<8;j++)
	   {
		  
	  
	       for(int i=0;i<3;i++)
	    {
	      List<WebElement> Tabledata=driver.findElements(By.xpath("//table[@id='customers']//tr["+j+"]//td"));
		  String cellvalue=Tabledata.get(i).getText();
		  System.out.print(cellvalue  +  "         ||              ");
	    }
	       System.out.println();
      
       }
     }
}

