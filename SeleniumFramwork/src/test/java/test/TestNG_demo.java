package test;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_demo {

	static WebDriver driver;

	@BeforeTest
	public void setUpBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Najmeh\\eclipse-workspace\\SeleniumFramwork\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();

	}

	@Test
	public void GoogleSearch() throws InterruptedException {

		// go to google page
		driver.get("https://www.google.com/");

		// enter text to search box
		driver.findElement(By.name("q")).sendKeys("selenium");

		// driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);//did not work

		// click on search button by hitting the enter on keyboard
		// driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).sendKeys(Keys.RETURN);

		Thread.sleep(3000);

	}

	@AfterTest
	public void closeBrowser() {
		// close browser
		driver.close();
		driver.quit();

		System.out.println("test completed");

	}

}
