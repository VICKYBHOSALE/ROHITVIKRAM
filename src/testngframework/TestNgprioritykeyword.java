package testngframework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgprioritykeyword 
// priority ha keyword apn
// jar tumhi priority ha keyword use kela asel kai yana priority nai dili tr jyana priority
// nai dili tyana by default 0 priority dili jate tya basis var test cases execute hotil
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
	  }// TEST CASES ARE RUN ACCORDING TO ALPHABETICAL ORDER IN THAT ADI TESTCASEA
	  //RUN ZALI MG B AND MG C PN APLYALA ADHI KONTI KITI WELA KARAYCHI YA SATI PRIORITY
	  // KEYWORD USE KARAYCH PRIORITY NO JYACHA KAMI TO ADHI RUN HOIL
	  @Test(priority=1)
	  public void TestcaseC()
	  {
		  System.out.println("testcase 1 is running");
	  }
	  @Test(priority=2)
	  public void TestcaseB()
	  {
		  System.out.println("testcase 2 is running");
	  }
	  @Test(priority=3)
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
