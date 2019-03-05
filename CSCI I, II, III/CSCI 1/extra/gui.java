//gui.java 

import java.awt.*;
import javax.swing.*;

public class gui
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("GUI");
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      JPanel primary = new JPanel();
      primary.setBackground(Color.yellow);
      primary.setPreferredSize(new Dimension(250, 75));
      
      JLabel label1 = new JLabel("Java GUI Sucks!!");
      JLabel label2 = new JLabel(".NET is Better!!");
      
      primary.add(label1);
      primary.add(label2);
      
      frame.getContentPane().add(primary);
      frame.pack();
      frame.setVisible(true);
      
   }

}