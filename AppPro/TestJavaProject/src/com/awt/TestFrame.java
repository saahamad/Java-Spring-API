package com.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class TestFrame extends Frame{
	
		public TestFrame() {


			System.out.println("start..");
			
			Button b = new Button("Click me!");
			Button b1 = new Button("Submit");
			
			add(b);
			add(b1);
			
			//For layout
			setLayout(new FlowLayout());
			
			// For Window
			setSize(500, 500);
			setVisible(true);
		}

		public static void main(String[] args) {
			new TestFrame();
		}
}


