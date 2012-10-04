package calculator.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class CalculatorExtentionTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				CalculatorExtentionTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(SendSignalTest.class);
		suite.addTestSuite(ClearInfoTest.class);
		suite.addTestSuite(SubtractTest.class);
		suite.addTestSuite(AddTest.class);
		suite.addTestSuite(DivideTest.class);
		suite.addTestSuite(MultiplyTest.class);
		//$JUnit-END$
		return suite;
	}

}
