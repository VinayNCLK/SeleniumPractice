package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver obj = new ChromeDriver();
		obj.get("file:///C:/Users/User/eclipse-workspace/SeleniumPractice/src/html/Practice2.html");

		//obj.findElement(By.xpath("//a[text()='FaceBook']")).click();
		
		obj.findElement(By.xpath("//a[contains(text(),'Book')]")).click();
		
	}

}
