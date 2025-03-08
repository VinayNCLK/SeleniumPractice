package main.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver obj = new ChromeDriver();
		obj.navigate().to("https://www.flipkart.com/");
		obj.navigate().back();
		obj.navigate().forward();
		obj.navigate().refresh();
		
	}

}
