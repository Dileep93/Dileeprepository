package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Seleniumhomepage  {
	
	public WebDriver driver;
	
	String pagetitle="Selenium-Web Browser Automation";
	
	By searchselenium=By.xpath("//*[@id='q']");
	By Go=By.xpath("//*[@id='submit']");
	By Projects=By.xpath("//a[@id='menu_projects']/a");
	By Downloads=By.xpath("//a[@id='menu_download']/a");
	By Support=By.xpath("//a[@id='menu_support']/a");
	By About=By.xpath("//a[@id='menu_about']/a");

	
	public Seleniumhomepage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void searchselenium(String entertext) {
		driver.findElement(searchselenium).sendKeys(entertext);
		driver.findElement(Go).click();
	}
	
	public void clickProjects() {
		driver.findElement(Projects).click();
	}
	
	public void  clickDownloads() {
		driver.findElement(Downloads).click();
	}
	
	public void  clickSupport() {
		driver.findElement(Support).click();
		
	}
	
	public void  clickAbout() {
		driver.findElement(About).click();
		
	}

	public void getpagetitle() {
		String actualtitle=driver.getTitle();
		if(pagetitle.equals(actualtitle)) {
			System.out.println("Titlematches"+actualtitle);
		}
	}
	
	
	
}
