package practisepom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Applyleave3 

{
  @FindBy(xpath="//select[@name=\"applyleave[txtLeaveType]\"]")
  private WebElement apply;
  
  @FindBy(xpath="//input[@id='calFromDate']")
  private WebElement fromdate;
  
  @FindBy(xpath="//input[@id='calToDate']")
  private WebElement todate;
  
  @FindBy(xpath="//textarea")
  private WebElement reason; 
  @FindBy(xpath="/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/p/input")
  private WebElement applybutton;
  @FindBy(xpath="@FindBy(xpath=\"/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/p/input\")\r\n"
  		+ "  private WebElement applybutton;")
  private WebElement sideclick;
  
  public Applyleave3(WebDriver driver)
  {
  	PageFactory.initElements(driver,this);
  }
  public void appyforleave()
  {
	  apply.click();
	  Select list = new Select(apply);
	  list.selectByValue("1");
  }
  public void subforleave()
  {
	  reason.sendKeys("for brother enanagement ceremony");
  }
  public void leavestart()
  {
	  fromdate.click();
	  fromdate.sendKeys("2022-05-19");  
  }
  public void leaveend()
  {
	  todate.click();
	  todate.sendKeys("2022-05-20");  	  
  }
  public void sideclick()
  {
	  sideclick.click();
  }
  public void finalapply()
  {
        applybutton.click();
  }
}


