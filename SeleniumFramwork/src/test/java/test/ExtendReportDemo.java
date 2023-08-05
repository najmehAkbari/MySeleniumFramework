package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportDemo {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		ExtentSparkReporter spark = new ExtentSparkReporter("Spark.html");
		
		//create extentReport and attach reporter
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(spark);
		
		//create test 
		ExtentTest test1 = extent.createTest("google search test1", "it will test text box and click search button");
		
		//test set up
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Najmeh\\eclipse-workspace\\SeleniumFramwork\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//test
		test1.log(Status.INFO, "starting Test case");
		driver.get("https://www.google.com/");
		test1.pass("Navigate to google.com");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		test1.pass("entered text in text box");
		
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).sendKeys(Keys.RETURN);
		test1.pass("search button clicked");
		
		driver.close();
		driver.quit();
		test1.pass("browser closed");
		
		test1.info("search compeleted");
		
		//calling flush to write everything to the log file
		extent.flush();
		
		
		
		
		
		
		
		
		
		


	}

}
