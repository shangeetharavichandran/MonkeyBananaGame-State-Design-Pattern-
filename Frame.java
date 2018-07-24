//Shangeetha Ravichandran
package wonderland;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class Frame extends JFrame{
	
	public static void main(String[] args){
		new Frame();
	}
	public Frame(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Monkey Banana");
		init();
	}
	
	public void init(){
		setLayout(new GridLayout(1,1,0,0));
		Game game = new Game();
		setLocationRelativeTo(null);
		add(game);
		pack();
		setVisible(true);
	}

}
