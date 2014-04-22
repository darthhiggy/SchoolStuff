import java.util.ArrayList;

import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.*;

public class SeatPanel extends JPanel 
{
	int x, y;
    private int columnCount = 6;
    private int rowCount = 13;
    private boolean [] [] seats = new boolean [columnCount] [rowCount];
    

    public SeatPanel() 
    {
    	addMouseListener(new seatListener());
       for(int col = 0; col < columnCount; col++)
       {
    	   for(int row = 0; row < rowCount; row++)
    	   {
    		   seats[col][row] = false;
    	   }
       }
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(600, 1000));

    }

    public void paintComponent (Graphics page)
	{
    	
    	super.paintComponent(page);
		page.setColor(Color.green);;
		page.drawString("point: " + x + " " + y, 5,  15);
		
		for(int row = 0; row < rowCount; row++)
		{
			int yh = row + 1;
			page.drawString(Integer.toString(yh), 25, 25 + ((row + 1) * 50) );
		}
		for(int col = 0; col < columnCount; col++)
		{
			int xh = col + 1;
			page.drawString(Integer.toString(xh), 25 + ((col + 1) * 50) ,25 );
			
			
			
			for(int row = 0; row < rowCount; row++)
			{
				if(seats[col][row] == false)
				{
					
				page.drawRect((col * 50) + 50, (row * 50) + 50 , 50, 50);
				}
				else
				{
					page.setColor(Color.green);
					page.fillRect((col * 50) + 50, (row * 50) + 50, 50, 50);
				}
				
				
			}
		}
	}
    
    private class seatListener implements MouseListener
	{
		public void mousePressed(MouseEvent event)
		{
			x = event.getX();
			y = event.getY();
			
			repaint();
				for(int x1 = 0; x1 < columnCount; x1++)
				{
					if(x < ((x1 + 2) * 50))
					{
						for(int y1 = 0; y1 < rowCount; y1++)
						{
							if(y < ((y1 + 2) * 50))
							{
								if(seats[x1][y1] == false)
								{
								seats[x1][y1] = true;
								}
								else
								{
									seats[x1][y1] = false;
								}
								x1 = columnCount;
								y1 = rowCount;
							}
						}
					
						
				
				}
				
			}
			
		}
		
		public void mouseClicked(MouseEvent event) {}
		public void mouseReleased (MouseEvent event) {}
		public void mouseEntered (MouseEvent event) {}
		public void mouseExited (MouseEvent event) {}
  }
}
       
    

 