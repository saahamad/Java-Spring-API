package com.applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class GraphicsTest extends Applet{
	
	@Override
	public void paint(Graphics g) {
		
		//g.drawString("Welcome to Applet home...", 10, 50);
		g.drawLine(0, 10, 0, 20);
	   //g.drawLine(90, 135, 90, 180); 
        g.setColor(Color.BLACK);  // Now we tell g to change the color 
        //g.drawLine(10, 10, 10, 50); 
        
       // g.drawRect(0, 0, 100, 100);
        
        g.drawArc(0, 0, 150, 150, 0, 360);
        g.drawArc(20, 20, 50, 50, 0, 360);
        g.drawArc(80, 20, 50, 50, 0, 360);
        g.drawRect(50,80, 50, 20);
        //g.drawArc(60, 110, 50, 50, 180, 360);
        g.drawArc(50, 110, 50, 10,180,360);
	}
}

/*

<html>
  <applet code="GraphicsTest.class" height="300" width="300" />
</html>

*/