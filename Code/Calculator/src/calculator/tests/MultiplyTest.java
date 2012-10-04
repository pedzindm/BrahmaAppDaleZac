package calculator.tests;

import org.junit.Test;

import calculator.CalculatorLogic;
import junit.framework.TestCase;

public class MultiplyTest extends TestCase {
	@Test
	public void testMultSingleDigitNumbers()
	{
		CalculatorLogic logic = new CalculatorLogic();
		
		
		assertEquals("6.0", logic.multiply(2, 3));
		assertEquals("9.0", logic.multiply(1, 9));
		assertEquals("0.0", logic.multiply(0, 3));
	}
	
	@Test
	public void testMultTwoDigitNumbers()
	{
		CalculatorLogic logic = new CalculatorLogic();
		
		
		assertEquals("714.0", logic.multiply(21, 34));
		assertEquals("130.0", logic.multiply(10, 13));
		assertEquals("323.0", logic.multiply(19, 17));
	}
	
	@Test
	public void testMultSingleAndTwoDigitNumbers()
	{
		CalculatorLogic logic = new CalculatorLogic();
		
		
		assertEquals("34.0", logic.multiply(1, 34));
		assertEquals("90.0", logic.multiply(10, 9));
		assertEquals("0.0", logic.multiply(0, 17));
	}
}
