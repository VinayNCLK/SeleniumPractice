package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver obj = new ChromeDriver();
		obj.get("file:///C:/Users/User/eclipse-workspace/SeleniumPractice/src/html/Practice2.html");
		//Tag name locator
		WebElement tagName = obj.findElement(By.tagName("ab"));
		tagName.click();
		obj.navigate().back();


	}

}
