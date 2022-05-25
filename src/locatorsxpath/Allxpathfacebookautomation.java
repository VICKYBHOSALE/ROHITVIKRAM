package locatorsxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Allxpathfacebookautomation
{
   public static void main(String[] args) throws InterruptedException
   {
	  System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\LATEST CHROME WEB DRIVER\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  Thread.sleep(2000);
	  driver.navigate().to("https://www.facebook.com/");
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  WebElement emailorphoneno=driver.findElement(By.xpath("//input[@type='text']"));
	  emailorphoneno.sendKeys("8698766003");
	  Thread.sleep(2000);
	  WebElement password = driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
	  password.sendKeys("vikram@123");
	  Thread.sleep(2000);
	  WebElement showpassword = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/div/a/div"));
	  showpassword.click();
	  Thread.sleep(2000);
	  showpassword.click();
	  Thread.sleep(2000);
	  WebElement loginclick = driver.findElement(By.xpath("//button[text()='Log In']"));
	  loginclick.click();
	  Thread.sleep(2000);
	  WebElement forgotpassword = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	  forgotpassword.click();
	  Thread.sleep(2000);
	  WebElement cancelforgot = driver.findElement(By.xpath("//a[text()='Cancel']"));
	  cancelforgot.click();
	  Thread.sleep(2000);
	  WebElement signupfb = driver.findElement(By.xpath("//div//a[2]"));
	  signupfb.click();
	  WebElement firstname=driver.findElement(By.xpath("//div//input[@type=\"text\"]"));
	  firstname.sendKeys("vikram");
	  Thread.sleep(2000);
	  WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
	  lastname.sendKeys("bhosale");
	  Thread.sleep(2000);
	  WebElement mobileno=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input"));
	  mobileno.sendKeys("9834047757");
	  Thread.sleep(2000);
	  WebElement newpwd=driver.findElement(By.xpath("//div//input[@type=\"password\"]"));
	  newpwd.sendKeys("vicky@123");
	  Thread.sleep(2000);
	  WebElement bdaymonth=driver.findElement(By.xpath("//select[@aria-label=\"Month\"]"));
	  Select monthlist =new Select(bdaymonth);
	  monthlist.selectByValue("8");
	  Thread.sleep(2000);
	  WebElement birthdate=driver.findElement(By.xpath("//select[@aria-label=\"Day\"]"));
	  Select datelist =new Select(birthdate);
	  datelist.selectByIndex(17);
	  Thread.sleep(2000);
	  WebElement birthyear=driver.findElement(By.xpath("//span//select[3]"));
	  Select yearlist =new Select(birthyear);
	  yearlist.selectByVisibleText("1995");
	  Thread.sleep(2000);
	  WebElement maleradio=driver.findElement(By.xpath("//span[2]//label"));
	  if(isEnabled()==false)
	  {
		  System.out.println("result true so we can click on radio button");
		  maleradio.click();
	  }
	  else
	  {
		  System.out.println("button is not enabled");
	  }
	  Thread.sleep(2000);
	  WebElement signup =driver.findElement(By.xpath("//button[@name='websubmit']"));
	  boolean result = signup.isDisplayed();
	  if(result==true)
	  {
		  System.out.println("signup button displayed");
		  WebElement alreadyfbacc=driver.findElement(By.xpath("//a[text()='Already have an account?']"));
		  alreadyfbacc.click();
		  
	  }
	  else
	  {
		  System.out.println("please signup and create new account");
	  }
	  WebElement text = driver.findElement(By.xpath("//div[text()='Log in to Facebook']"));
	  String comment=text.getText();
	  System.out.println(comment);
	 
	  
	  
	  
	  
	  
	  
	       
	       
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	
}

private static boolean isEnabled() {
	// TODO Auto-generated method stub
	return false;
}


}
