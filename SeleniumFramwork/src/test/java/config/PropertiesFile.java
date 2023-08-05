package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	static Properties prop = new Properties();

	public static void main(String[] args) throws IOException {
		getProperties();
		setProperties();
	}
	
	public static void getProperties() throws IOException {
		
		
		InputStream input = new FileInputStream("C:\\Users\\Najmeh\\eclipse-workspace\\SeleniumFramwork\\src\\test\\java\\config\\config.properties");
		prop.load(input);
		String browser = prop.getProperty("browser");
		System.out.println(browser);
	}
	
	public static void setProperties() {
		try{
			OutputStream output = new FileOutputStream("C:\\Users\\Najmeh\\eclipse-workspace\\SeleniumFramwork\\src\\test\\java\\config\\config.properties");
			prop.setProperty("browser", "edge");
			prop.store(output, null);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
