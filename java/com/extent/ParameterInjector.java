package com.extent;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.xml.XmlSuite;

import org.testng.IAlterSuiteListener;

public class ParameterInjector implements IAlterSuiteListener  {
	
	@SuppressWarnings("unused")
	@Override
	public void alter(List<XmlSuite> suites) {
		XmlSuite suite = suites.get(0);
		Map<String, String> params = new HashMap<>();	
		
		//Pass environment data
		
	}
}
