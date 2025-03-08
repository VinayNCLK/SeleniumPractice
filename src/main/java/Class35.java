package main.java;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class Class35 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver obj = new ChromeDriver();
		obj.get("file:///C:/Users/User/eclipse-workspace/SeleniumPractice/src/html/Practice7.html");
		obj.findElement(By.id("a1")).sendKeys("A");
		obj.findElement(By.id("b1")).sendKeys("B");
		obj.switchTo().frame(0);
		obj.findElement(By.id("c1")).sendKeys("C");
		obj.findElement(By.id("d1")).sendKeys("D");
		
		obj.switchTo().parentFrame();
		obj.findElement(By.id("a1")).sendKeys("A");
		obj.findElement(By.id("b1")).sendKeys("B");
		obj.switchTo().frame("if1");
		obj.findElement(By.id("c1")).sendKeys("C");
		obj.findElement(By.id("d1")).sendKeys("D");
		
		
		obj.switchTo().defaultContent();
		obj.findElement(By.id("a1")).sendKeys("A");
		obj.findElement(By.id("b1")).sendKeys("B");
		obj.switchTo().frame(obj.findElement(By.name("nf1")));
		obj.findElement(By.id("c1")).sendKeys("C");
		obj.findElement(By.id("d1")).sendKeys("D");
		
	}

}
