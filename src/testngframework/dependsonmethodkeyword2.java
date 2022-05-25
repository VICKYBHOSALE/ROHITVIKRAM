package testngframework;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dependsonmethodkeyword2

{
	 @BeforeClass 
	  public void beforeClass()
	  {
		  System.out.println("before class is running");
	  }
	  @BeforeMethod 
	  public void beforeMethod()
	  {
		  System.out.println("before Method is running");
	  }
	  @Test(priority=3)
	  public void TestcaseC()
	  {
		  System.out.println("testcase C");
	  }
	  @Test(dependsOnMethods= {"TestcaseA"},priority=2)
	  public void TestcaseB()//jewa tesctcaseA fail hoil tewa hi tes run nai honar
	                         // skip hoil vel vachl mnun dependsonmethod cha use hoto
	  {
		  System.out.println("testcase B");
	  }
	  @Test(priority=1)
	  public void TestcaseA()
	  {
		  System.out.println("testcase A");
		 Assert.fail();// janiv purvak testcase fail karaych asel tewa use krtat assert
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
}
