package gui;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class GUI implements ActionListener  {

	
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private int count=0;
	private JButton button,button2;
	public GUI() {
		
		frame = new JFrame();
		label = new JLabel("Number of clicks :0");
		panel = new JPanel();
		button = new JButton("Click Me");
		button2 = new JButton("Reset");
		button.addActionListener(this);
		button2.addActionListener(this);
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
		panel.setLayout(new GridLayout(0,1));
		panel.add(button,BorderLayout.LINE_START);
		panel.add(button2,BorderLayout.LINE_END);
		panel.add(label);
		 frame.add(panel,BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Button Click ");
		frame.pack(); 
		frame.setVisible(true);
 		
	}
	
	
	public static void main(String[] args) {
		new GUI();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj== button) {
		count++;
		label.setText("Number of clicks :"+count);
		}
		else {
		count=0;
		label.setText("Number of clicks :"+count);
		}
	}
}
