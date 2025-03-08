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

public class Class34 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver obj = new ChromeDriver();
		obj.get("https://demo.automationtesting.in/Register.html");

		
		WebElement we1= obj.findElement(By.xpath("//h1[contains(.,'Automation Demo Site ')]"));
		String value = we1.getCssValue("color");
		String hexaValue = Color.fromString(value).asHex();
		System.out.println(hexaValue);
		if(hexaValue.contains("#02569c")) {
			System.out.println("This is light blue and matched");
		}
		else {
			System.out.println("Not matched");
		}
	
	}

}
