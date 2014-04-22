import javax.swing.JFrame;
public class MichaelHigginbothamGraphicsLabPart2 {

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Math Practice");
		frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
		
		GLabPanels panel =  new GLabPanels();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}

}
