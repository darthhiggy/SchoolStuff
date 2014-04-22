import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.util.*;

public class GLabPanels extends JPanel
{
	
	private JLabel label1, lblAnswer;
	private JTextField input;
	int num1, num2, sign, answer;
	String equation; 
	Random r1 = new Random();
	public GLabPanels()
	{
		genEqu();
		label1 = new JLabel(equation);
		lblAnswer = new JLabel("Type answer and press Enter");
		input = new JTextField(1);
		input.addActionListener(new InputListener());
		JButton problem = new JButton("New Problem");
		problem.addActionListener (new ButtonListener());
		
		add (label1);
		add (input);
		add (problem);
		add (lblAnswer);
		
		setPreferredSize (new Dimension(400, 100));
		setBackground (Color.gray);
	}
	public void genEqu()
	{
	num1 = r1.nextInt(10)+1;
	num2 = r1.nextInt(10)+1;
	sign = r1.nextInt(2);
	if (sign == 0)
	{
		answer = num1 + num2;
		equation = num1 + " + " + num2 + " = ";
	}
	else
	{
		answer = num1 - num2;
		equation = num1 + " - " + num2 + " = ";
	}
	}
	
	private class InputListener implements ActionListener
	{
		public void actionPerformed (ActionEvent event)
		{
			if(input.getText().equals(String.valueOf(answer)))
			{
				lblAnswer.setText("Way to go! You are Correct");
			}
			else 
			{
				lblAnswer.setText("Incorrect, try again");
			}
		}
	
	}
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed (ActionEvent event)
		{
			genEqu();
			label1.setText(equation);
		}
	}
	
	
}
