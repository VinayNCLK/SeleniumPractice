package testNgPractice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class customListeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		Reporter.log("Test case START ---------------------", true);
	}

	public void onTestSuccess(ITestResult result) {
		// not implemented
		Reporter.log("Test case SUCCESSS ---------------------", true);
	}

	public void onTestFailure(ITestResult result) {
		Reporter.log("<a href='file:///C:/Users/User/Desktop/vinay/Selenium4Arch.png'>"
				+ "<img src='file:///C:/Users/User/Desktop/vinay/Selenium4Arch.png' height=100 widht=100></a>", true);
		Reporter.log("Test case FAILED ---------------------", true);
		// not implemented
	}

	public void onTestSkipped(ITestResult result) {
		// not implemented
		Reporter.log("Test case SKIPPED ---------------------", true);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// not implemented
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		onTestFailure(result);
	}

	public void onStart(ITestContext context) {
		// not implemented
	}

	public void onFinish(ITestContext context) {
		// not implemented
	}
}
