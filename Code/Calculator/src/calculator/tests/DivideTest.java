package calculator.tests;
import org.junit.Test;
import calculator.CalculatorLogic;
import junit.framework.TestCase;

public class DivideTest extends TestCase {
	@Test
	public void testDivSingleDigitNumbers()
	{
		CalculatorLogic logic = new CalculatorLogic();		
		
		assertEquals("2.0", logic.divide(2, 1));
		assertEquals("3.0", logic.divide(9, 3));
		assertEquals("0.0", logic.divide(0, 3));
	}
	
	@Test
	public void testDivTwoDigitNumbers()
	{
		CalculatorLogic logic = new CalculatorLogic();		
		
		assertEquals("2.0", logic.divide(68, 34));
		assertEquals("2.0", logic.divide(26, 13));
		assertEquals("3.0", logic.divide(51, 17));
	}
	
	@Test
	public void testDivSingleAndTwoDigitNumbers()
	{
		CalculatorLogic logic = new CalculatorLogic();		
		
		assertEquals("17.0", logic.divide(34, 2));
		assertEquals("2.0", logic.divide(10, 5));
		assertEquals("15.0", logic.divide(75, 5));
	}
	
	@Test
	public void testDivByZero()
	{
		CalculatorLogic logic = new CalculatorLogic();		
		
		assertEquals("Cannot Divide by 0", logic.divide(34, 0));
		assertEquals("Cannot Divide by 0", logic.divide(10, 0));
		assertEquals("Cannot Divide by 0", logic.divide(0, 0));
	}

}
