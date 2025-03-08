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

public class Class25 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver obj = new ChromeDriver();
		obj.get("file:///C:/Users/User/eclipse-workspace/SeleniumPractice/src/html/Practice6.html");

		
		WebElement multiSelect= obj.findElement(By.xpath("//select[@id='citiNames']"));
		Select selMul = new Select(multiSelect);
	
		List<WebElement> allOptions = selMul.getOptions();
		System.out.println("Number of options present in the list is "+allOptions.size());
		
		for(int i=0;i<allOptions.size();i++) {
			WebElement option = allOptions.get(i);
			System.out.println(option.getText());
		}

	}

}
