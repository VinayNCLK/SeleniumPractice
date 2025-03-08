package main.java;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Class4 {

	
	public ChromeDriver openBrowser(ChromeDriver driver)
	{
		return driver;
	}
	
	public FirefoxDriver openBrowser(FirefoxDriver driver)
	{
		return driver;
	}

	public InternetExplorerDriver openBrowser(InternetExplorerDriver driver)
	{
		return driver;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class4 obj = new Class4();
		obj.openBrowser(new ChromeDriver()).get("https://www.flipkart.com/");
		obj.openBrowser(new FirefoxDriver()).get("https://www.amazon.in/");
		obj.openBrowser(new InternetExplorerDriver()).get("https://www.shopify.com");

	}

}
