package main.java;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver obj = new ChromeDriver();
		obj.navigate().to("https://www.flipkart.com/");
		obj.manage().window().maximize();
		
		Dimension d = new Dimension(500, 700);
		obj.manage().window().setSize(d);
		
		Point p = new Point(600, 100);
		obj.manage().window().setPosition(p);
		
		//obj.close();
		
		
	}

}
