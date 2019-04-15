package com.awt;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutTest extends JFrame implements ActionListener{
		
			JTextField t1,t2;
			JLabel l1,l2,result;
			JButton b;
			
			public GridLayoutTest() {
				
				 t1 = new JTextField(10);
				 t2 = new JTextField(10);
				
				 l1 = new JLabel("User Name");
				 l2 = new JLabel("User Pass");
				 result =  new JLabel("Result is:");
				 b = new JButton("Login");
				
				add(l1);
				add(t1);
				add(l2);
				add(t2);
				add(b);
				add(result);
				b.addActionListener(this);
				setSize(400,400);
				setVisible(true);
				
				setLayout(new GridLayout(3, 2));
			}

		public static void main(String[] args) {
			
				new GridLayoutTest();
		}

		@Override
		public void actionPerformed(ActionEvent ae) {
			
			String uname = t1.getText();
			String password = t2.getText();
			String msg = checkUser(uname, password);
				
			result.setText(msg);
		}
		
		public String checkUser(String uname,String password) {
			if(uname.equalsIgnoreCase("Saif") && password.equals("saif@123"))
			return "Valid User!!Welcome";
			
			return "Invalid user!!!Sorry try again!";
		}

	}

