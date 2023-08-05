package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObject;

public class GoogleSearchObjectPageTest {
	
	static WebDriver driver;

	public static void main(String[] args) {
	
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Najmeh\\eclipse-workspace\\SeleniumFramwork\\Drivers\\chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    GoogleSearchPageObject searchpageObj = new GoogleSearchPageObject(driver);
	    
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	     
	    // do the function on elements
	     searchpageObj.setText("selenium");
	     searchpageObj.clickSearchButton();
	     
	     driver.close();
	     System.out.println("done");
	}

}
