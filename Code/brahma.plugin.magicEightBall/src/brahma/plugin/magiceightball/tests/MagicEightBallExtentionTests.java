package brahma.plugin.magiceightball.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class MagicEightBallExtentionTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				MagicEightBallExtentionTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(MagicEightBallConstructorTest.class);
		suite.addTestSuite(getAnswerTest.class);
		//$JUnit-END$
		return suite;
	}

}
