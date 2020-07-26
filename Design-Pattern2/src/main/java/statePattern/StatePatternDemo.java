package statePattern;

public class StatePatternDemo {
	   public String get(){
	      Context context = new Context();

	      StartState startState = new StartState();
	      String res=startState.doAction(context);
	      String result= res+context.getState().toString();
	      return result;
	   }
	   public String Stop() {
		   Context context = new Context();
	      StopState stopState = new StopState();
	      String Res=stopState.doAction(context);
	      String result=Res+context.getState().toString();
	      return result;
	   }
	}