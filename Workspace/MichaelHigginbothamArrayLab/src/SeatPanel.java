import java.util.ArrayList;

import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.*;

public class SeatPanel extends JPanel
{
	private int colCount = 6, rowCount = 13;
	private boolean[][] seats = new boolean[colCount][rowCount];
	private ArrayList<Point> pointlist;
	
	public SeatPanel()
	{
		for(int col = 0; col < colCount; col++)
	       {
	    	   for(int row = 0; row < rowCount; row++)
	    	   {
	    		   seats[col][row] = false;
	    	   }
	       }
	        setBackground(Color.BLACK);
	        setPreferredSize(new Dimension(600, 800));

	 }
}
	

