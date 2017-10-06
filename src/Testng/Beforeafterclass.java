package Testng;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Beforeafterclass {
  
	
	public static String browser="firefox";
  
	@BeforeClass
     public void beforeClass() {
	
		if (browser.equals("firefox")) {
		  System.out.println("firefox is open");
	  }
	  
	  else if(browser.equals("chrome")) {
		  System.out.println("chrome is open");
	  }
	 
	  else if(browser.equals("opera")) {
		  System.out.println("opera is open");
	  }
	  
	  else if(browser.equals("safari")) {
		  System.out.println("safari is open");
	  }
	  else
	  {System.out.println("browser not open");}
	
	  
  }
    
  @AfterClass
  public void afterClass() {
	  
	  System.out.println("browser closed");
  }

}
