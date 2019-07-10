import java.awt.*;
import javax.swing.*;

public class IntroPanel extends JPanel
{
   public IntroPanel()
   {
      setBackground(Color.green);
      
      JLabel one = new JLabel("Layout Manager Demonstration");
      JLabel two = new JLabel("Choose a tab to see an example of " + "a layout manager.");
      
      add(one);
      add(two);;
   }
}