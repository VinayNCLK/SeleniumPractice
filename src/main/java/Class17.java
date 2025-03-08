package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver obj = new ChromeDriver();
		obj.get("file:///C:/Users/User/eclipse-workspace/SeleniumPractice/src/html/Practice4.html");

		
		String java_si_no = obj.findElement(By.xpath("//td[contains(text(),'JAVA')]/../td[1]")).getText();
		System.out.println(java_si_no);
		
		String java_cost = obj.findElement(By.xpath("//td[contains(text(),'JAVA')]/following-sibling::td")).getText();
		System.out.println(java_cost);
		
		String php_si_no = obj.findElement(By.xpath("//td[contains(text(),'PHP')]/preceding-sibling::td")).getText();
		System.out.println(php_si_no);
		
		
		String PHP_cost = obj.findElement(By.xpath("//td[contains(text(),'PHP')]/../td[3]")).getText();
		System.out.println(PHP_cost);
		
		obj.close();
	}

}
