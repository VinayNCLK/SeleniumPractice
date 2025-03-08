package testNgPractice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class validateTitle {

	@Test(priority = 1)
	public void testValidateTitle() {
		
		String expectedTitle = "Prod";
		String actualTitle = "Prod1";
	
	/*	if(expectedTitle.contains(actualTitle)) {
			System.out.println("Match success");
		}
		else {
			System.out.println("Match unsuccess");
		}*/
		
		
		
		
		try {
			//Assert.assertEquals(actualTitle, expectedTitle, "testValidateTitle failed ");
			
			Assert.assertTrue(false);
			Assert.assertFalse(false);
		}
		catch (Throwable e) {
			// TODO: handle exception
			Assert.fail(e.getMessage());
			
		}
		
	
	}
	
	
	
}
