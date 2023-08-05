package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("**** Test Started " + result.getName());

	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("****** Test is successed" + result.getName());

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("****** Test failed" + result.getName());

	}
	
	public void onTestSkip(ITestResult result) {
		System.out.println("******* Test skipped" + result.getName());
	}
	
	public void onFinish(ITestContext context) {
		System.out.println("******* Test compeleteddddd" + context.getName());
	}

}
