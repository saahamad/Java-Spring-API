package com.awt;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayoutDemo extends JFrame {

	public BoxLayoutDemo() {
			
		JButton login = new JButton("Login");
		JButton logout = new JButton("Logout");			
		
		add(login);
		add(logout);				
		
	    setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
		setSize(400,400);
		setVisible(true);	
		
	}

	public static void main(String[] args) {
			new BoxLayoutDemo();
	}
}
