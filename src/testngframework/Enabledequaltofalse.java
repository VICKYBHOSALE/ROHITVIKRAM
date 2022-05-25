package testngframework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Enabledequaltofalse 
// normally enables= false ha keyword ch kam ahe 1 di test case script mnde pahije pan 
// run nai zali pahije kdi nantr run karavi lagl mnun tumhi ti test case thewli 
// tyaweli ha keyword use karaych
{
	 @BeforeClass(enabled=false) // he skip hoil
	  public void beforeClass()
	  {
		  System.out.println("before class is running");
	  }
	  @BeforeMethod 
	  public void beforeMethod()
	  {
		  System.out.println("before Method is running");
	  }// TEST CASES ARE RUN ACCORDING TO ALPHABETICAL ORDER IN THAT ADI TESTCASEA
	  //RUN ZALI MG B AND MG C PN APLYALA ADHI KONTI KITI WELA KARAYCHI YA SATI PRIORITY
	  // KEYWORD USE KARAYCH PRIORITY NO JYACHA KAMI TO ADHI RUN HOIL
	  @Test(priority=1)
	  public void TestcaseC()
	  {
		  System.out.println("testcase 1 is running");
	  }
	  @Test(priority=2, enabled=false)
	  public void TestcaseB()
	  {
		  System.out.println("testcase 2 is running");
	  }
	  @Test(priority=3)
	  public void TestcaseA()
	  {
		  System.out.println("testcase 3 is running");
	  }
	  @AfterClass(enabled=false)// he jya annotation chya tith ha keyword lagl te anotation ch 
	                            // test case run nai honar
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
