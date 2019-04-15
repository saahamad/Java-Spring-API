package com.applet;

import java.applet.Applet;
import java.awt.Graphics;

/*
 
 <html>
   <applet code="AppletTest.class" height="300" width="300" />
 </html>
 
 */

public class AppletTest extends Applet {
	
	@Override
	public void init() {
		System.out.println("init called..");
	}
	
	@Override
	public void start() {
		System.out.println("starts called..");
	}
	
	@Override
	public void paint(Graphics g) {
		System.out.println("Execution started..");
	}
	
	@Override
	public void stop() {
		System.out.println("stop called..");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy called..");
	}

}
