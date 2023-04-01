package Tutorial;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
	int curTry = 0;
	int maxRetry = 3;
	@Override
	public boolean retry(ITestResult result) {
		if(curTry < maxRetry)
		{
			curTry++;
			return true;
			
		}
		
		
		return false;
	}
	
}
