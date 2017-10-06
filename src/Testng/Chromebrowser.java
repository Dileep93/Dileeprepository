package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Chromebrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Selenium\\libs\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com");
		driver.getTitle();
		driver.quit();

	
		System.setProperty("webdriver.ie.driver","C:\\Users\\user\\eclipse-workspace\\Selenium\\libs\\IEDriverServer.exe");
		WebDriver driver1=new InternetExplorerDriver();
		driver1.get("https://accounts.google.com");
		driver1.getTitle();
		driver1.quit();
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\eclipse-workspace\\Selenium\\libs\\geckodriver.exe");
		WebDriver driver2=new FirefoxDriver();
		driver2.get("https://accounts.google.com");
		driver2.getTitle();
		driver2.quit();
	}
	

}
