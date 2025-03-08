package main.java;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class18 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver obj = new ChromeDriver();
		obj.get("file:///C:/Users/User/eclipse-workspace/SeleniumPractice/src/html/Practice5.html");

		//Clicking on 3rd check box
		obj.findElement(By.xpath("(//input[@type='checkbox' and @id='reports'])[3]")).click();

		//Clicking on last check box
		obj.findElement(By.xpath("(//input[@type='checkbox' and @id='reports'])[last()]")).click();

		//Clicking on last but 1 check box
		obj.findElement(By.xpath("(//input[@type='checkbox' and @id='reports'])[last()-1]")).click();
		
		//Clicking on first 2 check boxes
		List<WebElement> firstTwo_checkboxes = obj.findElements(By.xpath("(//input[@type='checkbox' and @id='reports'])[position()<=2]"));
		
		for(int i=0;i<firstTwo_checkboxes.size();i++) {
			firstTwo_checkboxes.get(i).click();
		}
		Thread.sleep(5000);
		//Clicking on even check boxes
		List<WebElement> even_checkboxes = obj.findElements(By.xpath("(//input[@type='checkbox' and @id='reports'])[position() mod 2=0]"));
		
		for(int i=0;i<even_checkboxes.size();i++) {
			even_checkboxes.get(i).click();
		}
		
		Thread.sleep(5000);
		//Clicking on odd check boxes
		List<WebElement> odd_checkboxes = obj.findElements(By.xpath("(//input[@type='checkbox' and @id='reports'])[position() mod 2=1]"));
		
		for(int i=0;i<odd_checkboxes.size();i++) {
			odd_checkboxes.get(i).click();
		}
		
		//obj.close();
	}

}
