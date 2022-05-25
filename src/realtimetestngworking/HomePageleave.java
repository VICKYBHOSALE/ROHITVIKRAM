package realtimetestngworking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageleave 

{
  @FindBy(xpath="//a[@href='/index.php/leave/viewLeaveModule']")
  private WebElement LeaveButton;
  
  @FindBy(xpath="/html/body/div[1]/div[2]/ul/li[3]/ul/li[1]/a")
  private WebElement ApplyButton;
  
  
  public HomePageleave (WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
  public void clickleavebutton()
  {
	  LeaveButton.click();
  }
  public void appyleave() 
  {
	  ApplyButton.click();
  }
  
   
   
}
