package Tutorial;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TestN Test Method"+ result.getName() );
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TestN Test passed"+ result.getName() );

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TestN Test passed"+ result.getName() );

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("TestN Test Suite"+ context.getName() );

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("TestN Test Suite Completed"+ context.getName() );

	}
	

}
