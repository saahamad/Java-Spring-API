package com.awt;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TestKeyListener extends Frame implements KeyListener  {
	
	public TestKeyListener() {
		this.setSize(300,300);
		this.setVisible(true);
		this.addKeyListener(this);
	}
	

	public static void main(String[] args) {
		new TestKeyListener();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//if(e.getID() == KeyEvent.KEY_TYPED)
		//System.exit(1);
		
		char key = e.getKeyChar();
		if(key=='t' || key=='T')
			System.exit(1);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
