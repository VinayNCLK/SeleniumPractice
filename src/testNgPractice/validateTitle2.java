package testNgPractice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class validateTitle2 {

	@Test(priority = 1)
	public void testValidateTitle() {
		
		String expectedTitle = "Prod";
		String actualTitle = "Prod";
	
		try {
			SoftAssert sf = new SoftAssert();
			sf.assertEquals(actualTitle, expectedTitle, "testValidateTitle failed ");
			
			sf.assertTrue(false);
			sf.assertFalse(false);
			System.out.println("Test reaching lines");
			sf.assertAll();
		}
		catch (Throwable e) {
			// TODO: handle exception
			Assert.fail(e.getMessage());
			
		}
		
	
	}
	
	
	
}
