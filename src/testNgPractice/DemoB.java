package testNgPractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB {

	@Test
	public void testB() {
		Reporter.log("Executing test B from DemoB", true);
	}
	
}
