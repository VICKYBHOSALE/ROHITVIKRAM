package testngframework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestclassTNG 
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
  @Test
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
  
}
