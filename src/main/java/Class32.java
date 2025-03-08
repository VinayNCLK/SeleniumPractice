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
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class Class32 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver obj = new ChromeDriver();
		obj.get("https://demo.automationtesting.in/Register.html");

		
		WebElement we1= obj.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		WebElement we2= obj.findElement(By.xpath("//input[@ng-model='Phone']"));
		
		
		int x1 = we1.getLocation().getX();
		int x2 = we2.getLocation().getX();
		
		int w1 = we1.getSize().getWidth();
		int w2 = we2.getSize().getWidth();
		
		
		int h1 = we1.getSize().getHeight();
		int h2 = we2.getSize().getHeight();
		
		if(x1==x2 && w1==w2 && h1==h2) {
			System.out.println("Email and phone are alligned properly");
		}

	}

}
