package abstractFactory;

import static org.junit.Assert.*;

import org.junit.Test;

public class DemaTest {

	@Test
	public void test() {
		Dema dOb=new Dema();
		assertEquals("Inside Rectangle::draw() method.",dOb.main(false, "Rectangle"));
	}
	@Test
	public void test1() {
		Dema dOb=new Dema();
		assertEquals("Inside Square::draw() method.",dOb.main(false, "SQUARE"));
	}
	@Test
	public void test2() {
		Dema dOb=new Dema();
		assertEquals("Inside RoundedRectangle::draw() method.",dOb.main(true, "Rectangle"));
	}
	@Test
	public void test3() {
		Dema dOb=new Dema();
		assertEquals("Inside RoundedSquare::draw() method.",dOb.main(true, "SQUARE"));
	}

}