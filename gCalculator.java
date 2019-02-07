import java.awt.Point;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class gCalculator {

	public static void main(String [] args)
	{
		
		JFrame calc = new JFrame();
		calc.setBounds(600, 300, 300, 200);
		calc.setVisible(true);
		calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calc.setLayout(null);
		
		JLabel hRate = new JLabel("Hourly Rate:");
		hRate.setBounds(40, 35, 150, 30);
		calc.add(hRate);
		
		JLabel hoursWeek = new JLabel("Hours/Week:");
		hoursWeek.setBounds(40, 60, 150, 30);
		calc.add(hoursWeek);
		
		JLabel fullTime = new JLabel("Full Time");
		fullTime.setBounds(60, 85, 150, 30);
		calc.add(fullTime);
		
	}
	
}
