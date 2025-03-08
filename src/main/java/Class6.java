package main.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Class6 {

	
	public WebDriver openBrowser(WebDriver driver)
	{
		return driver;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class6 obj = new Class6();
		WebDriver driver;
		driver = obj.openBrowser(new ChromeDriver());
		driver.get("https://www.flipkart.com/");
		driver = obj.openBrowser(new FirefoxDriver());
		driver.get("https://www.amazon.in/");
		driver = obj.openBrowser(new InternetExplorerDriver());
		driver.get("https://www.shopify.com");
		
		driver.quit();
		
	}

}
