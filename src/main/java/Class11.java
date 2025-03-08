package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class11 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriver obj = new ChromeDriver();
		obj.get("file:///C:/Users/User/eclipse-workspace/SeleniumPractice/src/html/Practice2.html");
		//Tag name locator
		WebElement tagName = obj.findElement(By.tagName("a"));
		tagName.click();
		obj.navigate().back();
		
		
		
		Thread.sleep(5000);
	
		//id locator
		WebElement id = obj.findElement(By.id("fb-id"));
		id.click();
		obj.navigate().back();
		
		Thread.sleep(5000);
		
		//name locator
		obj.findElement(By.name("fb-name")).click();
		obj.navigate().back();
		
		Thread.sleep(5000);
		//class locator
		obj.findElement(By.className("fb-class")).click();
		obj.navigate().back();
		
		Thread.sleep(5000);
		//link text locator
		obj.findElement(By.linkText("FaceBook")).click();
		obj.navigate().back();
		
		Thread.sleep(5000);
		//Partial link text locator
		obj.findElement(By.partialLinkText("Face")).click();
		obj.navigate().back();
		
		
		
	}

}
