package practisepom2gobalwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage1B 
{            WebDriverWait wait;//gobal wait decaration and import from selenium.org
	// actaul auatomation testing kartana asch karav lagat find elements use chya aivaji annoate find use kartat real time mde
	  	// username vr action karnya sati 
	  	@FindBy(xpath="//input[@name='txtUsername']")
	  	private WebElement username;
	  	// password vr action karnya sati 
	  	@FindBy(xpath="//input[@name='txtPassword']")
	  	private WebElement password;
	  	//submit button sati
	  	@FindBy(xpath="//input[@type='submit']")
	  	private WebElement submit;
	  	
	  public LogInPage1B(WebDriver driver)
	  {
		  wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		  PageFactory.initElements(driver,this);
	  }
		public void sendusername()
	  	{
	  		
	  	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='txtUsername']")));
	  	username.sendKeys("Admin");
	  	}
	  	public void sendpass()
	  	{wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='txtPassword']")));
	  		password.sendKeys("admin123");
	  	}
	  	public void submitclick()
	  	{wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit']")));
	  		submit.click();
	  	}
	  	
}
