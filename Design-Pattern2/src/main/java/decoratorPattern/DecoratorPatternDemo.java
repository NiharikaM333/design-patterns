package decoratorPattern;

public class DecoratorPatternDemo {
		public String testCircle() {
	      Shape circle = new Circle();
	      return circle.draw();
		}
		public String testRed() {
	      Shape redCircle = new RedShapeDecorator(new Circle());
	      return redCircle.draw();
		}
		public String testRectangle() {
	      Shape redRectangle = new RedShapeDecorator(new Rectangle());
	      return redRectangle.draw();
	   }
	}