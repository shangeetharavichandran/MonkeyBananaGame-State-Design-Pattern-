//Shangeetha Ravichandran
package wonderland;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Monkey {

	private int xCoordinate, yCoordinate, width, height;
	private MonkeyState monkeyState;
	private Game game;

	public int getxCoordinate() {
		return xCoordinate;
	}
	public void setxCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	public int getyCoordinate() {
		return yCoordinate;
	}
	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	public Monkey(int x,int y,int size,Game game) {
		this.xCoordinate=x;
		this.yCoordinate=y;
		this.width=size;
		this.height=size;
		this.game=game;
		monkeyState=new MonkeyNotmoving();
	}
	public void left()
	{
		monkeyState.left(this);
		stopped();
	}
	
	public void right()
	{
		monkeyState.right(this);
		stopped();
	}
	
	public void up()
	{
		monkeyState.up(this);
		stopped();
	}
	
	public void down()
	{
		monkeyState.down(this);
		stopped();
	}
	public void stopped()
	{
		monkeyState.stopped(this);
		game.repaint();
		game.check();
	}
	public void paint(Graphics g) throws IOException{
		Image image=ImageIO.read(new File("monkey.png"));
		g.drawImage(image, xCoordinate*width, yCoordinate*height, null);
	}
}
