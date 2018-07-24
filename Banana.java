//Shangeetha Ravichandran
package wonderland;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Timer;

public class Banana {

	private int xCoordinate, yCoordinate, width, height, size;
	private Game game;
	private Timer timer;
	
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
	

	public Banana(int x, int y, int size, Game game) {
		this.width = x;
		this.height = y;
		this.size = size;
		this.game = game;
		ActionListener action= new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				createBanana();
			}

		};
		timer=new Timer(7000, action);
		createBanana();
	}
	
	public void createBanana() {
			setxCoordinate((int)(Math.random()*width));
			setyCoordinate((int)(Math.random()*height));
			timer.restart();
			game.repaint();
			
	}
	public void paint(Graphics g) throws IOException{
		//Image image=ImageIO.read(getClass().getResource("/banana.png"));
		Image image=ImageIO.read(new File("banana.png"));
		g.drawImage(image, xCoordinate*size, yCoordinate*size, null);
	}
}
