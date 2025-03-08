package main.java;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class Class36 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver obj = new ChromeDriver();
		obj.get("https://demo.automationtesting.in/Register.html");
		obj.manage().window().maximize();
		
		//Mouse over actions
		WebElement interactions = obj.findElement(By.xpath("//a[.=\"Interactions \"]"));
		Actions action = new Actions(obj);
		action.moveToElement(interactions).perform();
		action.moveToElement(obj.findElement(By.xpath("//a[text()=\"Drag and Drop \"]"))).perform();
		action.moveToElement(obj.findElement(By.xpath("//a[.=\"Static \"]"))).click().perform();
		
		//To scroll a bit of the page we will use java script executor 
		
		JavascriptExecutor jse = (JavascriptExecutor) obj;
		jse.executeScript("window.scrollBy(0,250)");
		
		//Drag and drop
		WebElement src = obj.findElement(By.id("angular"));
		WebElement des = obj.findElement(By.id("droparea"));
		action.dragAndDrop(src, des).release().perform();
		
		
		//Context click
		action.contextClick(obj.findElement(By.xpath("//a[.='Register']"))).perform();
		
	}

}
