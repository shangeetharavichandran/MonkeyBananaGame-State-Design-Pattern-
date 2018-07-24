//Shangeetha Ravichandran
package wonderland;

public abstract class MonkeyState {

	public MonkeyState left(Monkey monkey){
		return this;
	}	
	public MonkeyState right(Monkey monkey){
		return this;
	}

	public MonkeyState up(Monkey monkey){
		return this;
	}

	public MonkeyState down(Monkey monkey){
		return this;
	}
	
	public MonkeyState stopped(Monkey monkey){
		return this;
	}
}
