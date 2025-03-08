package main.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver obj = new ChromeDriver();
		obj.get("https://www.flipkart.com/");
		
		
		//Get the url from the browser window
		String enteredUrl = obj.getCurrentUrl();
		System.out.println("Entered url is - "+enteredUrl);
		
		//Get the title from the browser window
		String currentTitle = obj.getTitle();
		System.out.println("Obtained title is - "+currentTitle);
		
		//Get the page source from the browser window
		String currentPageSource = obj.getPageSource();
		//System.out.println("Obtained page source is - "+currentPageSource);
		
		obj.quit();
	}

}