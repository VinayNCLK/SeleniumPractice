package main.java;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
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

public class Class39 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver obj = new ChromeDriver();
		obj.get("https://demo.automationtesting.in/Static.html");
		obj.manage().window().maximize();
		
		//Collecting parent window id
		String parentWindowId = obj.getWindowHandle();
		System.out.println("Parent window id "+parentWindowId);
		
		
		//Opening the link in a new tab (ctrl + left mouse click)
		Actions act = new Actions(obj);
		WebElement ele = obj.findElement(By.xpath("//a[.='Register']"));
		
		act.keyDown(Keys.CONTROL).click(ele).build().perform();
		
		System.out.println(obj.getTitle());
		
		Set<String> windowHandles = obj.getWindowHandles();
		for(String handle:windowHandles) {
			if(handle.equals(parentWindowId)) {
				//Closing the parent window
				obj.switchTo().window(parentWindowId);
				obj.close();
			}
			if(!handle.equals(parentWindowId)) {
				//Closing the child window
				obj.switchTo().window(handle);
				obj.close();
			}
		}
		
	}

}
