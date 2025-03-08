package main.java;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class19 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver obj = new ChromeDriver();
		obj.get("file:///C:/Users/User/eclipse-workspace/SeleniumPractice/src/html/Practice5.html");

		//select all checkboxes
		List<WebElement> all_checkboxes = obj.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(int i=0;i<all_checkboxes.size();i++) {
			all_checkboxes.get(i).click();
		}
		
		
		Thread.sleep(5000);

		//deselect all checkboxes
		for(int i=0;i<all_checkboxes.size();i++) {
			all_checkboxes.get(i).click();
		}
		//obj.close();
	}

}
