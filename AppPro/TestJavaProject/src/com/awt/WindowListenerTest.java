package com.awt;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowListenerTest extends Frame implements WindowListener{

	public WindowListenerTest() {
		this.setSize(300,300);
		this.setVisible(true);
		this.addWindowListener(this);
	}
	
	public static void main(String[] args) {
		new WindowListenerTest();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		//System.exit(1);
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
			System.exit(1);		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.exit(1);
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.exit(1);
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.exit(1);
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		//System.exit(1);
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.exit(1);
		
	}

}
