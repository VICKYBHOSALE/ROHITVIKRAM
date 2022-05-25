package realworkwithtestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pomclassfindbyannotation 
{   WebDriver driver;
    WebDriverWait wait;
	@FindBy(xpath="//input[@name='txtUsername']")
	private WebElement username;
	@FindBy(xpath="//input[@name='txtPassword']")
	private WebElement password;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	@FindBy(xpath="/html/body/div[1]/div[1]/a[2]")
	private WebElement welcomebutton;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	public  Pomclassfindbyannotation (WebDriver driver)
	{
	  PageFactory.initElements(driver,this);
	  wait= new WebDriverWait(driver,Duration.ofSeconds(20));
	}
	public void validsendusername()
	{
		username.sendKeys("Admin");
	}
	public void validsendpassword() 
	{
		password.sendKeys("admin123");
	}
	public void validsubmitclick() 
	{
		submit.click();
	}
	public void clickforwelcome()
	{
		welcomebutton.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Logout']")));
	}
	public void clickonlogout()
	{  
	   logout.click();
	}
	
	public void invalidsendusername()
	{
		username.sendKeys("Admin");
	}
	public void invalidsendpassword() 
	{
		password.sendKeys("admin1234");
	}
	public void invalidsubmitclick() 
	{
		submit.click();
	}
}
