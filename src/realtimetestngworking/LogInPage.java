package realtimetestngworking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage

{// actaul auatomation testing kartana asch karav lagat find elements use chya aivaji annoate find use kartat real time mde
	// username vr action karnya sati 
	@FindBy(xpath="//input[@name='txtUsername']")
	private WebElement username;
	// password vr action karnya sati 
	@FindBy(xpath="//input[@name='txtPassword']")
	private WebElement password;
	//submit button sati
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;



public  LogInPage (WebDriver driver)
{
    PageFactory.initElements(driver,this);

}
public void sendusername()
{
	username.sendKeys("Admin");
}
public void sendpassword() 
{
	password.sendKeys("admin123");
}
public void submitclick() 
{
	submit.click();
}
}
