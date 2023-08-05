package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class GoogleSearchPageObject {
	
	WebDriver driver;
	
	By textBox_search = By.id("APjFqb");
	
	By Button_search = By.xpath("(//input[@name='btnK'])[2]");
	
	public GoogleSearchPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setText(String text) {
		driver.findElement(textBox_search).sendKeys(text);
		
	}
	
	public void clickSearchButton() {
		driver.findElement(Button_search).sendKeys(Keys.RETURN);
	}

}
