package testngframework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testngdependsonmethodkeyword1 
{

	//@BeforeClass 
	 // public void beforeClass()
	  //{
		//  System.out.println("before class is running");
	 // }
	 // @BeforeMethod 
	 // public void beforeMethod()
	  //{
		//  System.out.println("before Method is running");
	  //}
	  //[dependsOnMethods ha keyword use jya testcase la dila tyachi priority sglyat kami hote
	  //ha keyword as thikani use karaych ji test case 1 dya testcase vr depend ahe ti fail
	  //zali tr depend testcase run nai vhavi skip vhavi apla vel vachav mnun use hote
	  // test case chi priority sglyat kami hote pn apn (,)deun priority keyword ni
	  //sequence manage kru shkto.keywords(,)deun diff ase use kru shkto]
	 // @Test()
	 // public void TestcaseC()
	  //{
	//	  System.out.println("testcase C");
	 // }
	 // @Test(dependsOnMethods= {"TestcaseA"})//[testcase b hi a var depend ahe
	//  public void TestcaseB()     // [ya keyword mul tyachi priority sglyat kami zali
	 // {
	//	  System.out.println("testcase B");
	 // }
	 // @Test()
	 // public void TestcaseA()
	 // {
	//	  System.out.println("testcase A");
	 // }
	 // @AfterClass 
	 // public void afterClass()
	 // {
	//	  System.out.println("after class is running");
	 // }
	//  @AfterMethod 
	//  public void afterMethod()
	//  {
	//	  System.out.println("after Method is running");
	//  }
	
	 //----HA PROGRAM PAN RUN KARA SO PRIORITY DEUN MANAGE KARTAYET HE SMJL---------
	  
	  @BeforeClass()
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
	  @Test(dependsOnMethods= {"TestcaseA"},priority=2)//testcase b hi a var depend ahe
	  public void TestcaseB()     // ya keyword mul tyachi priority sglyat kami zali
	  {
		  System.out.println("testcase B");
	  }
	  @Test(priority=1)
	  public void TestcaseA()
	  {
		  System.out.println("testcase A");
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
