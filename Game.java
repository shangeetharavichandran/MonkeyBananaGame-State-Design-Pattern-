//Shangeetha Ravichandran
package wonderland;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Game extends JPanel {

	private int finalscore;
	private int targetscore=7;
	private Monkey monkey;
	private Banana banana;
	private Key key;
	private Timer timer;
	
	public static final int WIDTH = 10, HEIGHT = 10; 
	
	public Game() {
		setPreferredSize(new Dimension(500, 500));
		key = new Key();
		addKeyListener(key);
		newGame();
		JButton startButton = new JButton("START");
		startButton.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e) {
				newGame();
				requestFocusInWindow();
			}
		});
		add(startButton);
		}
	public void newGame(){
		monkey=new Monkey((int)(Math.random()*WIDTH),(int)(Math.random()*HEIGHT) , 50,this);
		banana=new Banana(WIDTH, HEIGHT , 50,this);

		if(timer!=null){
			timer.cancel();
		}
		timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				isGameOver(true);
			}
		}, 15000);
		
		finalscore=0;
	}
	
	protected boolean isGameOver(boolean flag) {
		if(targetscore==finalscore)
		{
			JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(this), "YOU WON!! Your total score is "+finalscore+"");
			timer.cancel();
			finalscore=0;
			return true;
		}
		else if(flag){
			JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(this), "OOPS!! You lost ! And your total score is "+finalscore+"");
			timer.cancel();
			finalscore=0;
			return true;
		}else{
			return false;
		}
		
	}
	@Override
	public void addNotify() {
		super.addNotify();
		requestFocus();
	}
	
	public class Key implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {
			int code=e.getKeyCode();
			
			if(e.VK_LEFT == code)
			{
				monkey.left();
			}
			if(e.VK_RIGHT == code)
			{
				monkey.right();
			}
			if(e.VK_UP == code)
			{
				monkey.up();
			}
			if(e.VK_DOWN == code)
			{
				monkey.down();
			}
			}
		
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		try {
			this.setBackground(Color.green);
			monkey.paint(g);
			banana.paint(g);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	public void check(){
		if(monkey.getxCoordinate()==banana.getxCoordinate()&&monkey.getyCoordinate()==banana.getyCoordinate()){
			finalscore++;
			if(!isGameOver(false)){
				banana.createBanana();
			}	
		}	
	}
  }
