package calculator.tests;

import org.junit.Test;

import calculator.CalculatorLogic;
import junit.framework.TestCase;

public class AddTest extends TestCase {
	
	@Test
	public void testAddSingleDigitNumbers()
	{
		CalculatorLogic logic = new CalculatorLogic();
		
		
		assertEquals("5.0", logic.add(2, 3));
		assertEquals("10.0", logic.add(1, 9));
		assertEquals("3.0", logic.add(0, 3));
	}
	
	@Test
	public void testAddTwoDigitNumbers()
	{
		CalculatorLogic logic = new CalculatorLogic();
		
		
		assertEquals("55.0", logic.add(21, 34));
		assertEquals("23.0", logic.add(10, 13));
		assertEquals("36.0", logic.add(19, 17));
	}
	
	@Test
	public void testAddSingleAndTwoDigitNumbers()
	{
		CalculatorLogic logic = new CalculatorLogic();
		
		
		assertEquals("35.0", logic.add(1, 34));
		assertEquals("19.0", logic.add(10, 9));
		assertEquals("17.0", logic.add(0, 17));
	}
}
