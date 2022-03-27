package com.applets;

import java.awt.Button;
import java.awt.Frame;

public class ButtonExample {
	public static void main (String[] args) {   
		  
	    // create instance of frame with the label   
	    Frame f = new Frame("Button Example");    
	  
	    // create instance of button with label  
	    Button b = new Button("Click Here");   
	  
	    // set the position for the button in frame   
	    b.setBounds(90,100,80,30);    
	  
	    // add button to the frame  
	    f.add(b);    
	    // set size, layout and visibility of frame  
	    f.setSize(100,200);    
	    f.setLayout(null);    
	    f.setVisible(true);     
	}    
}
