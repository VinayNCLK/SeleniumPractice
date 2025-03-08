package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver obj = new ChromeDriver();
		obj.get("file:///C:/Users/User/eclipse-workspace/SeleniumPractice/src/html/Practice2.html");

		obj.findElement(By.cssSelector("input:nth-child(2)")).sendKeys("India");
		obj.findElement(By.cssSelector("input:nth-child(3)")).sendKeys("America");
		
		
		
	}

}
