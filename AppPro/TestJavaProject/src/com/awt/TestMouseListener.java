package com.awt;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TestMouseListener extends Frame implements MouseListener{
	
	public TestMouseListener() {
		
		this.setSize(300,300);
		this.setVisible(true);
		this.addMouseListener(this);
		
	}

	public static void main(String[] args) {
		new TestMouseListener();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//System.exit(1);
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//System.exit(1);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//System.exit(1);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//System.exit(1);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.exit(1);
		
	}

}