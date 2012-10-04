package calculator.tests;

import org.junit.Test;

import calculator.CalculatorLogic;
import junit.framework.TestCase;

public class SendSignalTest extends TestCase {

	
	
	@Test
	public void testSendSignalSingleNumberAndOperator()
	{
		CalculatorLogic logic = new CalculatorLogic();
		logic.sendSignal('n', 2);
		logic.sendSignal('+', 0);
		logic.sendSignal('n', 3);
		
		assertEquals(logic.getFirst(), 2.0);
		assertEquals(logic.getSecond(), 3.0);
		assertEquals(logic.getOperator(), '+');
	}
	
	@Test
	public void testSendSignalMultipleNumbers()
	{
		CalculatorLogic logic = new CalculatorLogic();
		logic.sendSignal('n', 2);
		logic.sendSignal('n', 4);
		logic.sendSignal('+', 0);
		logic.sendSignal('n', 3);
		logic.sendSignal('n', 1);
		
		assertEquals(logic.getFirst(), 24.0);
		assertEquals(logic.getSecond(), 31.0);
		assertEquals(logic.getOperator(), '+');
	}
	
	@Test
	public void testSendSignalMultipleOperators()
	{
		CalculatorLogic logic = new CalculatorLogic();
		logic.sendSignal('+', 0);
		logic.sendSignal('-', 0);
		
		assertEquals(logic.getOperator(), '-');
	}
}
