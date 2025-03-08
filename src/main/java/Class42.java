package main.java;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class42 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver obj = new ChromeDriver();
		obj.get("https://practice.automationtesting.in/");
		obj.manage().window().maximize();
		
		obj.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		obj.findElement(By.xpath("//a[.='My Account']")).click();
		
		WebDriverWait wait = new WebDriverWait(obj, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("My Account – Automation Practice Site"));
		wait.until(ExpectedConditions.urlContains("my-account"));
		
		wait.until(ExpectedConditions.visibilityOf(obj.findElement(By.id("username"))));
		
		obj.findElement(By.id("username")).sendKeys("abc@gmail.com");
		
	}

}
