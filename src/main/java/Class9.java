package main.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver obj = new ChromeDriver();
		obj.navigate().to("https://www.flipkart.com/");
		obj.manage().window().minimize();
		obj.manage().window().maximize();
		
		obj.close();
	}

}
