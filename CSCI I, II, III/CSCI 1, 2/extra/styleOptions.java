//styleOptions.java

import java.awt.*;
import javax.swing.*;

public class styleOptions
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Question 2");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      stylePanel panel = new stylePanel();
      frame.getContentPane().add(panel);
      
      frame.pack();
      frame.setVisible(true);
   }
   
}