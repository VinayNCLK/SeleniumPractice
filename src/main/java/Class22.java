package main.java;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Class22 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver obj = new ChromeDriver();
		obj.get("file:///C:/Users/User/eclipse-workspace/SeleniumPractice/src/html/Practice2.html");

		obj.findElement(By.xpath("(//input[@id='b1'])[1]")).sendKeys("India");
		obj.findElement(By.xpath("(//input[@id='b1'])[1]")).sendKeys(Keys.CONTROL + "A");
		obj.findElement(By.xpath("(//input[@id='b1'])[1]")).sendKeys(Keys.CONTROL + "C");
		obj.findElement(By.xpath("(//input[@id='b1'])[1]")).sendKeys(Keys.TAB);
		obj.findElement(By.xpath("(//input[@id='b1'])[2]")).sendKeys(Keys.CONTROL + "V");
	
		//obj.close();
	}

}
