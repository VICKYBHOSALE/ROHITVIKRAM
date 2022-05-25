package practisepom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage2leave 

{
  @FindBy(xpath="//a[@href='/index.php/leave/viewLeaveModule']")
  private WebElement LeaveButton;
  
  @FindBy(xpath="/html/body/div[1]/div[2]/ul/li[3]/ul/li[1]/a")
  private WebElement ApplyButton;
  
  
  public HomePage2leave (WebDriver driver)
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
