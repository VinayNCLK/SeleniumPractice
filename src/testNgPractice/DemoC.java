package testNgPractice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoC {

	
	@BeforeSuite
	public void getConfig() {
		Reporter.log("Get config for suite", true);
	}
	
	@AfterSuite
	public void closeConfig() {
		Reporter.log("Close config for suite", true);
	}
	
	@BeforeTest
	public void launchBrowser() {
		Reporter.log("Launch Browser", true);
	}
	
	@AfterTest
	public void closeBrowser() {
		Reporter.log("Close browser", true);
	}
	

	@BeforeClass
	public void openApplication() {
		Reporter.log("Open application", true);
	}
	
	@AfterClass
	public void closeApplication() {
		Reporter.log("Close application", true);
	}
	
	@BeforeMethod
	public void login() {
		Reporter.log("Login", true);
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("Logout", true);
	}
	
	
	
	@Test(priority = 1)
	public void shopping() {
		Reporter.log("Shopping", true);
	}
	
	@Test(priority = 1)
	public void visitingDemoSite() {
		Reporter.log("visitingDemoSite", true);
	}
	

	
}
