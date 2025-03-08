package main.java;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Class20 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver obj = new ChromeDriver();
		obj.get("https://www.selenium.dev/");

		//get all links
		List<WebElement> all_links= obj.findElements(By.xpath("//a"));
		
		System.out.println("Number of Links presenent in the webpage is "+all_links.size());
		
		for(int i=0;i<all_links.size();i++) {
			System.out.println(all_links.get(i).getText());
		}
		
	
		//obj.close();
	}

}
