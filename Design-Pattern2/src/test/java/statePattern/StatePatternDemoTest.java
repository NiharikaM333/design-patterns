package statePattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class StatePatternDemoTest {

	@Test
	public void test() {
		StatePatternDemo S=new StatePatternDemo();
		assertEquals("Player is in start stateStart State",S.get());
	}
	@Test
	public void test1() {
		StatePatternDemo S=new StatePatternDemo();
		assertEquals("Player is in stop stateStop State",S.Stop());
	}

}