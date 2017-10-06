package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Beforeandaftertest {
 

	@BeforeTest
	public void beforeTest() {
		System.out.println("open browser");
	}
	
    @Test
	public void Test1() {
		System.out.println("Login");
	}
    
    @Test
	public void Test2() {
		System.out.println("Enter Password");
	}
    
    @AfterTest
    public void afterTest() {
		System.out.println("close browser");
	}
}
