// Smiley.java
import javax.swing.*;

public class Smiley
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Smiley");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      SmileyFace smiley = new SmileyFace();
      frame.getContentPane().add(smiley);
      
      frame.pack();
      frame.setVisible(true);
   }
}