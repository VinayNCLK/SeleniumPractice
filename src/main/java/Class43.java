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

public class Class43 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver obj = new ChromeDriver();
		obj.get("https://demo.automationtesting.in/Register.html");
		obj.manage().window().maximize();
		
		obj.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		Actions action = new Actions(obj); 
		action.moveToElement(obj.findElement(By.xpath("//a[.='SwitchTo']"))).perform();
		action.moveToElement(obj.findElement(By.xpath("//a[.=\"Alerts\"]"))).click().perform();
		JavascriptExecutor jse = (JavascriptExecutor) obj;
		jse.executeScript("window.scrollBy(0,250)");
		
		obj.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box')]")).click();
		String textMsgFromAlert = obj.switchTo().alert().getText();
		System.out.println(textMsgFromAlert);
		obj.switchTo().alert().accept();
		//Thread.sleep(5000);
		/*obj.findElement(By.xpath("//a[.='Alert with OK & Cancel ']")).click();
		Thread.sleep(5000);
		obj.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box')]")).click();
		obj.switchTo().alert().accept();
		Thread.sleep(5000);
		obj.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box')]")).click();
		obj.switchTo().alert().dismiss();
		Thread.sleep(5000);*/
	}

}
