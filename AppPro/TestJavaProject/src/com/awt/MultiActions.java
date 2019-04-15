package com.awt;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class MultiActions extends Frame implements ActionListener {
	
	JButton b1,b2; 
	JLabel result;
	public MultiActions() {
		
		 b1 = new JButton("Hide window");
		 b2 = new JButton("Display Action");
		 result = new JLabel("Result:");
		
		 add(b1);
		 add(b2);
		 add(result);
		 b1.addActionListener(this);
		 b2.addActionListener(this);
		setSize(400,400);
		setVisible(true);
		
		setLayout(new GridLayout(3, 2));

	}

	public static void main(String[] args) {
		new MultiActions();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == b1)
			this.setVisible(false);
		
		if(e.getSource() == b2)
			result.setText("Action done!!");
		
	}

}
