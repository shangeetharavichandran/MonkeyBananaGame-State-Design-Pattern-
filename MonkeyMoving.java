//Shangeetha Ravichandran
package wonderland;

public class MonkeyMoving extends MonkeyState {

	@Override
	public MonkeyState stopped(Monkey monkey) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new MonkeyNotmoving();
	}

}
