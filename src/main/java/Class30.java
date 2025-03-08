package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class Class30 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver obj = new ChromeDriver();
		obj.get("file:///C:/Users/User/eclipse-workspace/SeleniumPractice/src/html/Practice6.html");

		
		WebElement multiSelect= obj.findElement(By.xpath("//select[@id='citiNames']"));
		Select selMul = new Select(multiSelect);
		selMul.selectByIndex(0);
		selMul.selectByIndex(1);
		selMul.selectByIndex(2);
		
		if(selMul.isMultiple() == true) {
			System.out.println("This is a multi select list");
		}
		else {
			System.out.println("This is a single select list");
		}
		
		

	}

}
