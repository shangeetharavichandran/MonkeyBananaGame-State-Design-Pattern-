//Shangeetha Ravichandran
package wonderland;

import javax.swing.JOptionPane;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sang");
		int xcoordinate=5;
		int y=7;
		if(xcoordinate<y)
		{
			System.out.println(" y is greater");
		}
		else
		{
			System.out.println("hhh");
		}
		while(true)
		{
		if(JOptionPane.showInputDialog("wonderland").equals("yes"))
				
				{
			xcoordinate=xcoordinate+y;
			break;
		}
		
		
	}
		System.out.println("The game is over");
	}
}
	


