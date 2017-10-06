package Testng;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Beforeandaftermethod {

	@BeforeMethod
	public void beforetest() {
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
    
    @AfterMethod
    public void aftertest() {
		System.out.println("close browser");
	}
	


}

