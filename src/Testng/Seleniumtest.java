package Testng;



import java.io.FileNotFoundException;

import java.io.IOException;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;


public class Seleniumtest extends Browserhooks {
 
 
  @Test(dataProvider="hardCodedBrowsers")
 
 public void openSeleniumDilip(String browser,String version,String os, Method method) throws FileNotFoundException, IOException {

	  this.createDriver(browser, version, os, method.getName());

	  WebDriver driver = this.getWebDriver();

	  driver.get("http://www.seleniumhq.org");
	  
	  
	  //getting seleniumhomepage class
	  Seleniumhomepage obj= new Seleniumhomepage(driver);
	  
	  
	  
	  //getting propfilehandler class and fetching autoconstants
	  driver.get(Propfilehandler.fetchKey(Autoconstants.URL.URL));
	  
	  
	 //type any key to search 
	  obj.searchselenium("saucelab");
	  

	 
  }
}


