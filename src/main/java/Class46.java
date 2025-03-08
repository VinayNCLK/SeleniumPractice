package main.java;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
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

public class Class46 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver obj = new ChromeDriver();
		obj.get("https://demo.automationtesting.in/Register.html");
		obj.manage().window().maximize();
		
		obj.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//JavascriptExecutor jse = (JavascriptExecutor) obj;
		//jse.executeScript("window.scrollBy(0,250)");

		obj.findElement(By.xpath("//input[@id='imagesrc']")).sendKeys("C:\\Users\\User\\Desktop\\vinay\\cssselector.png");
	}

}
