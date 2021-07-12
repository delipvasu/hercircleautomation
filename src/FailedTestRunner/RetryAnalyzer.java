package FailedTestRunner;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
	
	
	int counter=0;
	int retryLimit=3;
	
	public boolean retry(ITestResult result){
		
	if(counter<retryLimit){
		counter++;
		return true;
	}
	return false;
	
}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void main(String[] args) {
		
		TestNG runner=new TestNG();
		List<String> list=new ArrayList<String>();
		
		list.add("D:\\software\\NewStalkbuylove\\test-output\\Testng Cucumber Suite\\testng-failed.xml");
		runner.setTestSuites(list);
		runner.run();

	}*/

