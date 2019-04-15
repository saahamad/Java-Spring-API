package com.awt;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginFrame extends JFrame{
	
		public LoginFrame() {
			
			JTextField t1 = new JTextField(10);
			JTextField t2 = new JTextField(10);
			
			JLabel l1 = new JLabel("User Name");
			JLabel l2 = new JLabel("User Pass");
			
			JButton b = new JButton("Login");
			
			l1.setSize(100,100);
			
			Font f = new Font("MONOSPACE",Font.BOLD,20);
			l1.setFont(f);
			//l1.setText(""+f.getName());
			b.setSize(10, 20);
			
			add(l1,BorderLayout.EAST);
			add(t1,BorderLayout.WEST);
			add(l2,BorderLayout.SOUTH);
			add(t2,BorderLayout.NORTH);
			add(b,BorderLayout.CENTER);
			
			setSize(400,400);
			setVisible(true);
			
			//setLayout(new FlowLayout(FlowLayout.LEFT));
		}

	public static void main(String[] args) {
		
			new LoginFrame();
	}

}