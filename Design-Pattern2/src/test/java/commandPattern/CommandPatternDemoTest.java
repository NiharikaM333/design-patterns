package commandPattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class CommandPatternDemoTest {

	@Test
	public void test() {
		CommandPatternDemo C=new CommandPatternDemo();
		assertEquals("Stock [ Name: Coca Cola, Quantity: 10 ] bought",C.Buy());
	}
	@Test
	public void test1() {
		CommandPatternDemo C=new CommandPatternDemo();
		assertEquals("Stock [ Name: Coca Cola, Quantity: 10 ] sold",C.Sell());
	}

}