package testngframework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimeOutkeyword
// tiemout ha keyword asha test case sati use karaych jewa aplyla mhiti he jast time lavnare
// tyaweli 1 timeout lavaych mg asha veli ti test case run honyasati timeout prynt thambl
// load zal tya aat thik naitr to tya test case la failed krel timeoutexception deil
{
	 @BeforeClass(timeOut=5000)// 5 sec thambl pn apn 10 sec thambayla lavl 
	  // so 5 sec thambl test case failed deil error
	  public void beforeClass() throws InterruptedException
	  {
		  System.out.println("before class is running");
		  Thread.sleep(10000);
	  }
	  @BeforeMethod()
	  public void beforeMethod()  
	  {
		  System.out.println("before Method is running");
		 
	  }
	  @Test(priority=1)
	  public void Testcase1()
	  {
		  System.out.println("testcase 1 is running");
	  }
	  @Test
	  public void Testcase2()
	  {
		  System.out.println("testcase 2 is running");
	  }
	  @Test
	  public void Testcase3()
	  {
		  System.out.println("testcase 3 is running");
	  }
	  @AfterClass 
	  public void afterClass()
	  {
		  System.out.println("after class is running");
	  }
	  @AfterMethod 
	  public void afterMethod()
	  {
		  System.out.println("after Method is running");
	  }
	  // apn time out keyword before class la lavl mnje statring la lavl mnun te fail
	  // zal tya nantr ch sgl sequence mde fail zal before method after method 
	  //testcase1,2,3,skip kel
}
