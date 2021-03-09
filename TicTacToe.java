
//A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -  
//Lab  -

import javax.swing.JFrame;

public class TicTacToe extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public TicTacToe()
	{
		super("TIC TAC TOE");
		setSize(WIDTH,HEIGHT);
						
		getContentPane().add(new GameBoard());
				
		setVisible(true);
	}
	
	
}
