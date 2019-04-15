package com.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionWindowTest extends Frame implements ActionListener {

		Button b;
		
		public ActionWindowTest() {
			b = new Button("Hide me!!");
			b.addActionListener(this);
			add(b);
			setSize(400, 400);
			setVisible(true);
			setLayout(new FlowLayout());
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		this.setVisible(false);
	}

public static void main(String[] args) {
		
		new ActionWindowTest();
	}

}
