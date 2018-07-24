//Shangeetha Ravichandran
package wonderland;

public class MonkeyNotmoving extends MonkeyState{

	@Override
	public MonkeyState left(Monkey monkey) {
		
		if(monkey.getxCoordinate()>0)
		monkey.setxCoordinate(monkey.getxCoordinate()-1);
		return new MonkeyMoving();
	}

	@Override
	public MonkeyState right(Monkey monkey) {
		if(monkey.getxCoordinate()<Game.WIDTH-1)
		monkey.setxCoordinate(monkey.getxCoordinate()+1);
		return new MonkeyMoving();
	}

	@Override
	public MonkeyState up(Monkey monkey) {
		if(monkey.getyCoordinate()>0)
		monkey.setyCoordinate(monkey.getyCoordinate()-1);
		return new MonkeyMoving();
	}

	@Override
	public MonkeyState down(Monkey monkey) {
		if(monkey.getyCoordinate()<Game.HEIGHT-1)
		monkey.setyCoordinate(monkey.getyCoordinate()+1);
		return new MonkeyMoving();
	}
}
