import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

public class testCountDown
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Question 2");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      CountDownPanel panel = new CountDownPanel();
      frame.getContentPane().add(panel);
      
      frame.pack();
      frame.setVisible(true);
   }
}