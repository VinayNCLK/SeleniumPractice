package main.java;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Class23 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver obj = new ChromeDriver();
		obj.get("file:///C:/Users/User/eclipse-workspace/SeleniumPractice/src/html/Practice4.html");

		
		WebElement javaText = obj.findElement(By.xpath("//td[contains(text(),'JAVA')]"));
		//Above example
		System.out.println(obj.findElement(RelativeLocator.with(By.tagName("td")).above(javaText)).getText());
		//To left of example
		System.out.println(obj.findElement(RelativeLocator.with(By.tagName("td")).toLeftOf(javaText)).getText());
		//To right of example
		System.out.println(obj.findElement(RelativeLocator.with(By.tagName("td")).toRightOf(javaText)).getText());
		
		
		WebElement phpText = obj.findElement(By.xpath("//td[contains(text(),'PHP')]"));
		//Above example
		System.out.println(obj.findElement(RelativeLocator.with(By.tagName("td")).below(phpText)).getText());
		//To left of example
		System.out.println(obj.findElement(RelativeLocator.with(By.tagName("td")).toLeftOf(phpText)).getText());
		//To right of example
		System.out.println(obj.findElement(RelativeLocator.with(By.tagName("td")).toRightOf(phpText)).getText());
		//obj.close();
	
		
		System.out.println(obj.findElement(RelativeLocator.with(By.tagName("th")).above(phpText)).getText());
		
	}

}
