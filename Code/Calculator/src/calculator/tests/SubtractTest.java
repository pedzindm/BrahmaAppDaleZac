package calculator.tests;

import org.junit.Test;

import calculator.CalculatorLogic;
import junit.framework.TestCase;

public class SubtractTest extends TestCase {
	@Test
	public void testSubSingleDigitNumbers()
	{
		CalculatorLogic logic = new CalculatorLogic();		
		
		assertEquals("1.0", logic.subtract(3, 2));
		assertEquals("8.0", logic.subtract(9, 1));
		assertEquals("3.0", logic.subtract(3, 0));
	}
	
	@Test
	public void testSubTwoDigitNumbers()
	{
		CalculatorLogic logic = new CalculatorLogic();		
		
		assertEquals("13.0", logic.subtract(34, 21));
		assertEquals("3.0", logic.subtract(13, 10));
		assertEquals("2.0", logic.subtract(19, 17));
	}
	
	@Test
	public void testSubSingleAndTwoDigitNumbers()
	{
		CalculatorLogic logic = new CalculatorLogic();		
		
		assertEquals("42.0", logic.subtract(43, 1));
		assertEquals("1.0", logic.subtract(10, 9));
		assertEquals("17.0", logic.subtract(17, 0));
	}
	
	@Test
	public void testSubNegativeOutcome()
	{
		CalculatorLogic logic = new CalculatorLogic();		
		
		assertEquals("-42.0", logic.subtract(1, 43));
		assertEquals("-9.0", logic.subtract(10, 19));
		assertEquals("-3.0", logic.subtract(17, 20));
	}
}
