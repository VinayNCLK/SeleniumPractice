package testNgPractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA {

	@Test(priority = 1, invocationCount = 2)
	public void testB() {
		Reporter.log("Executing test B() from DemoA", true);
	}
	
	@Test(priority = 1)
	public void testA() {
		Reporter.log("Executing test A() from DemoA", true);
	}
	

	
}
