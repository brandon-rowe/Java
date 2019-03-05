import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

public class QuoteOptions
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Question 2");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      QuoteOptionsPanel panel = new QuoteOptionsPanel();
      frame.getContentPane().add(panel);
      
      frame.pack();
      frame.setVisible(true);
   }
   
}