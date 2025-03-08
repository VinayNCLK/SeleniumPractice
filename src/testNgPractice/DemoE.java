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
import org.testng.asserts.SoftAssert;

public class DemoE {

	@Test(priority = 1)
	public void shopping() {
		String expectedTitle = "Prod";
		String actualTitle = "Prod1";
		SoftAssert sf = new SoftAssert();
		sf.assertEquals(actualTitle, expectedTitle, "testValidateTitle failed ");
		Reporter.log("Tile validation completed", true);
		sf.assertAll();
	}
}
