package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class login implements ActionListener{
	
	JFrame frame;
	JPanel panel;
	JLabel user;
	JLabel password,success;
	JTextField userText,passText;
	
	public login(){
		
		frame = new JFrame();
		frame.setSize(100,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel =  new JPanel();
		panel.setLayout(null);
		frame.add(panel);
		
		user=new JLabel("ENTER USERNAME");
		user.setBounds(10,20,120,25);
		panel.add(user);
		
		userText = new JTextField();
		userText.setBounds(140,20,120,25);
		panel.add(userText);
		
		password=new JLabel("ENTER PASSWORD");
		password.setBounds(10,50,120,25);
		panel.add(password);
		
		passText = new JPasswordField();
		passText.setBounds(140,50,120,25);
		panel.add(passText);
		
		JButton button = new JButton("LOGIN");
		button.setBounds(10,80,80,25);
		button.addActionListener(this);
		panel.add(button);
	
		success= new JLabel();
		success.setBounds(20,100,1000,25);
		panel.add(success); 
		
		frame.setVisible(true);
		
		
		
		
	}
	
public static void main(String[] args) {
	new login();
}

@Override
public void actionPerformed(ActionEvent e) {
	
	String un,ps;
	un=userText.getText();
	ps=passText.getText();

	if(un.equals("meet") && ps.equals("123")) {
		success.setText("LOGIN SUCCESSSFULLY!!!");
	}
	else {
		success.setText("username or password incorrect!");
	}
	
}
}
