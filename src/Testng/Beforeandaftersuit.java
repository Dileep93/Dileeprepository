package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Beforeandaftersuit {
  
  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("In before suit");
  }
  
  @Test
	public void Test1() {
		System.out.println("Login");
	}
  
  @Test
	public void Test2() {
		System.out.println("Enter Password");
	}

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("In after suit");
  }

}
