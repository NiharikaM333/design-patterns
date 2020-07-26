package decoratorPattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class DecoratorPatternDemoTest {

	@Test
	public void test() {
		DecoratorPatternDemo D=new DecoratorPatternDemo();
		assertEquals("Shape: Circle",D.testCircle());
	}
	@Test
	public void test2() {
		DecoratorPatternDemo D=new DecoratorPatternDemo();
		assertEquals("Shape: CircleBorder Color: Red",D.testRed());
	}
	@Test
	public void test3() {
		DecoratorPatternDemo D=new DecoratorPatternDemo();
		assertEquals("Shape: RectangleBorder Color: Red",D.testRectangle());
	}

}