package TestCases;

import java.util.List;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.annotations.Test;
import org.testng.collections.Lists;

import Baseclass.baseclass;

//import com.beust.testng.TestNG;

public class TestRuner {
@Test
	public void main() throws Exception {
		
			TestListenerAdapter tla = new TestListenerAdapter();
			TestNG testng = new TestNG();
			List<String> suites = Lists.newArrayList();
			suites.add("D:\\vasu\\RPTAutomation\\testng.xml");//path to xml..
			//suites.add("c:/tests/testng2.xml");
			testng.setTestSuites(suites);
			testng.run();

	}

}
