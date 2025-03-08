package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver obj = new ChromeDriver();
		obj.get("file:///C:/Users/User/eclipse-workspace/SeleniumPractice/src/html/Practice2.html");
		
		String tagName = obj.findElement(By.name("fb-name")).getTagName();
		System.out.println(tagName);
		
		//href/id/name/class
		String id = obj.findElement(By.name("fb-name")).getAttribute("href");
		System.out.println(id);
		
		

		String text = obj.findElement(By.name("fb-name")).getText();
		System.out.println(text);
		
		obj.close();
		
	}

}
