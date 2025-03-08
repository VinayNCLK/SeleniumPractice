package testNgPractice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoD {

	
	
	
	@Test(priority = 1)
	public void shopping() {
		Assert.fail();
		Reporter.log("Shopping", true);
	}
	
	@Test(priority = 1, dependsOnMethods = "shopping")
	public void checkout() {
		Reporter.log("checkout", true);
	}
	

	@Test(invocationCount = 1)
	public void paymentGateWay() {
		
		Reporter.log("paymentGateWay", true);
		throw new SkipException("This test case will be skipped");
	}
	
	
}
