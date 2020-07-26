package bridgePattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class BridgePatternDemoTest {

	@Test
	public void test() {
		BridgePatternDemo B=new BridgePatternDemo();
		assertEquals("Drawing Circle[ color: red, radius: 10, x: 100, 100]",B.test1());
	}
	@Test
	public void test1() {
		BridgePatternDemo B1=new BridgePatternDemo();
		assertEquals("Drawing Circle[ color: green, radius: 10, x: 100, 100]",B1.test2());
	}

}