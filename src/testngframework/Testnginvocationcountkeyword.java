package testngframework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testnginvocationcountkeyword 

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
	  }// KONTI TEST CASE KITIVELA REPEAT CHALVAYCHI YA SATI KEYWORD AHE
	  //invocationCount=1,2,3...as jitk no asel titk vela ti test repeat hoil
	  @Test(invocationCount=1)
	  public void TestcaseC()
	  {
		  System.out.println("testcase 1 is running");
	  }
	  @Test(invocationCount=2)
	  public void TestcaseB()
	  {
		  System.out.println("testcase 2 is running");
	  }
	  @Test(invocationCount=3)
	  public void TestcaseA()
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
}
