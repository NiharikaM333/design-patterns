package decoratorPattern;

public class RedShapeDecorator extends ShapeDecorator {

	   public RedShapeDecorator(Shape decoratedShape) {
	      super(decoratedShape);		
	   }

	   public String draw(){ 
	      String s=decoratedShape.draw();
	      String v=s+setRedBorder(decoratedShape);
	      return v;
	   }

	   private String setRedBorder(Shape decoratedShape){
	     return "Border Color: Red";
	   }
	}