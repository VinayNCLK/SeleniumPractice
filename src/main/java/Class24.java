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
import org.openqa.selenium.support.ui.Select;

public class Class24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver obj = new ChromeDriver();
		obj.get("file:///C:/Users/User/eclipse-workspace/SeleniumPractice/src/html/Practice6.html");

		
		Thread.sleep(5000);
		
		WebElement singleSelect= obj.findElement(By.xpath("//select[@id='citiName']"));
		Select sel = new Select(singleSelect);
		sel.selectByVisibleText("Pune");
		sel.selectByContainsVisibleText("Hyder");
		sel.selectByIndex(3);
		sel.selectByValue("3");
		
		String firstOption = sel.getFirstSelectedOption().getText();
		System.out.println(firstOption);
		
		WebElement multiSelect= obj.findElement(By.xpath("//select[@id='citiNames']"));
		Select selMul = new Select(multiSelect);
		selMul.selectByVisibleText("Pune");
		selMul.selectByContainsVisibleText("Hyder");
		selMul.selectByIndex(3);
		selMul.selectByValue("3");
		
		Thread.sleep(5000);
		/*selMul.deselectByVisibleText("Pune");
		selMul.deSelectByContainsVisibleText("Hyder");
		selMul.deselectByIndex(3);
		selMul.deselectByValue("3");*/
		
		selMul.deselectAll();
		
		
		
	}

}
