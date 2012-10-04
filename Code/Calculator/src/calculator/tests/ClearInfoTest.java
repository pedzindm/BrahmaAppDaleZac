package calculator.tests;

import org.junit.Test;

import calculator.CalculatorLogic;
import junit.framework.TestCase;

public class ClearInfoTest extends TestCase {
	CalculatorLogic logic = new CalculatorLogic();
	
	@Test
	public void testClear()
	{
		logic.sendSignal('n', 2);
		logic.sendSignal('+', 0);
		logic.sendSignal('n', 3);
		
		logic.clearAll();
		assertEquals(logic.getFirst(), 0.0);
		assertEquals(logic.getSecond(), 0.0);
		assertEquals(logic.getOperator(), 'o');
	}
}
