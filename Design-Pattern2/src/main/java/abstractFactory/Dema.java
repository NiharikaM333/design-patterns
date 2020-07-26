package abstractFactory;

public class Dema {
	public String main(boolean b,String s) {
	      AbstractFactory shapeFactory = FactoryProducer.getFactory(b);
	      if(s=="Rectangle") {
	    	  Shape shape1 = shapeFactory.getShape(s);
		      return shape1.draw();
	      }
	      else {
	      Shape shape2 = shapeFactory.getShape(s);
	      return shape2.draw();
	      }
	   }
}