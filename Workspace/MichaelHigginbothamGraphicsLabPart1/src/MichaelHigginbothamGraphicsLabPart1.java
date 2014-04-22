import java.awt.*;
import javax.swing.*;

public class MichaelHigginbothamGraphicsLabPart1 
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("About Me");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		ImageIcon icon = new ImageIcon("me.jpg");
		
		JPanel subpanel1 = new JPanel();
		subpanel1.setPreferredSize (new Dimension(350,300));
		subpanel1.setBackground(Color.green);
		JLabel label1 = new JLabel("Michael Higginbotham", icon, SwingConstants.CENTER);
		label1.setHorizontalTextPosition(SwingConstants.CENTER);
		label1.setVerticalTextPosition(SwingConstants.TOP);
		subpanel1.add(label1);
		
		JPanel subpanel2 = new JPanel();
		subpanel2.setPreferredSize (new Dimension(350,300));
		subpanel2.setBackground(Color.green);
		JLabel label2 = new JLabel("27");
		JLabel label3 = new JLabel("Computer Science");
		JLabel label4 = new JLabel("Spartanburg, South Carolina");
		subpanel2.add(label2);
		subpanel2.add(label3);
		subpanel2.add(label4);
		
		JPanel primary = new JPanel();
		primary.setBackground(Color.black);
		primary.add(subpanel1);
		primary.add(subpanel2);
		
		frame.getContentPane().add(primary);
		frame.pack();
		frame.setVisible(true);
		
		
	}
}
