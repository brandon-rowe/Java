package com.williams.kailyn;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) 
    {
	  JFrame frame= new JFrame("GUI Practice");

	  //Panel panel= new Panel();
	  // Panel2 panel2= new Panel2();
	  // Panel3 panel3= new Panel3();
	  //Panel4 panel4= new Panel4();
	  //Add to frame
     frame.getContentPane().add(new Panel7());

	  frame.setSize(new Dimension(300,300));
	  frame.setVisible(true);
	  frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

	 }
}
