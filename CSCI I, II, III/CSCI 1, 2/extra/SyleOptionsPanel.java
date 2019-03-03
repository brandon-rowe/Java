import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SyleOptionsPanel extends JPanel
{
   private JRadioButton red, yellow, green;
   public void StyleOptionsPanel()
   {  
      red = new JRadioButton("red");
      red.setBackground(Color.red);
      yellow = new JRadioButton("yellow");
      yellow.setBackground(Color.yellow);
      green = new JRadioButton("green");
      green.setBackground(Color.green);
      
      StyleListener listener = new StyleListener();
      red.addItemListener(listener);
      yellow.addItemListener(listener);
      green.addItemListener(listener);
      
      add(red);
      add(yellow);
      add(green);
      
      setBackground(Color.blue);
      setPreferredSize(new Dimension (300,100));
   }
}

private class StyleListener implements ItemListener
{
   public void itemStateChanged(ItemEvent event)
   {
      if (red.isSelected())
         setBackground(Color.red);
      if (yellow.isSelected())
         setBackground(Color.yellow);
      if (green.isSelected())
         setBackground(Color.green);
   }
}