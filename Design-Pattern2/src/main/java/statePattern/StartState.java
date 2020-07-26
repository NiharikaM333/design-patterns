package statePattern;

public class StartState implements State {

	public String doAction(Context context) {
	      String s="Player is in start state";
	      context.setState(this);	
	      return s;
	   }

	   public String toString(){
	      return "Start State";
	   }
	}