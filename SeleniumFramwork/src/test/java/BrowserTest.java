import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {
		// using drivers
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\Najmeh\\eclipse-workspace\\SeleniumFramwork\\Drivers\\chromedriver\\chromedriver.exe");

		// using webDriver Manager for finding drivers
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
		driver.close();

	}

}
