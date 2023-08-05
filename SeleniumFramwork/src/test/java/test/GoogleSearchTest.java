package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import pages.GoogleSearchPage;


public class GoogleSearchTest {
	static WebDriver driver=null;

	public static void main(String[] args) {
		 googlepage();
	

	}
	
	public static void googlepage() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Najmeh\\eclipse-workspace\\SeleniumFramwork\\Drivers\\chromedriver\\chromedriver.exe");
//		 driver = new ChromeDriver();
		System.setProperty("webdriver.ie.driver","C:\\Users\\Najmeh\\eclipse-workspace\\SeleniumFramwork\\Drivers\\IEDriver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//getting elements

		
		GoogleSearchPage.textBox_search(driver).sendKeys("selenium");
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		driver.close();
		
		System.out.println("test done");
		
		
		
	}

}
