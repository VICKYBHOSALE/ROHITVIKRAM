package practisepom1wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage1A 
{
      WebDriver driver;
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
  	
  	public LogInPage1A(WebDriver driver)
  	{            this.driver=driver;
  		PageFactory.initElements(driver,this);
  	}
  	public void sendusername()
  	{
  		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
  		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='txtUsername']")));
  		username.sendKeys("Admin");
  	}
  	public void sendpass()
  	{
  		password.sendKeys("admin123");
  	}
  	public void submitclick()
  	{
  		submit.click();
  	}
  	
      
}
