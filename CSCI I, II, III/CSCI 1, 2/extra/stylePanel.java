//stylePanel.java

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class stylePanel extends JPanel
{
   private JLabel saying;
   private JCheckBox bold, italic;
   
   public stylePanel()
   {
      saying = new JLabel("Say it with style!");
      saying.setFont(new Font("Helvetica", Font.PLAIN, 36));
      
      bold = new JCheckBox("Bold");
      bold.setBackground(Color.cyan);
      italic = new JCheckBox("Italic");
      italic.setBackground(Color.cyan);
      
      StyleListener listener = new StyleListener();
      bold.addItemListener(listener);
      italic.addItemListener(listener);
      
      add(saying);
      add(bold);
      add(italic);
      
      setBackground(Color.cyan);
      setPreferredSize(new Dimension(300,100));
        
   }
   
   private class StyleListener implements ItemListener
   {
      public void itemStateChanged(ItemEvent event)
      {
         int style = Font.PLAIN;
         
         if(bold.isSelected())
            style = Font.BOLD;
         
         if(italic.isSelected())
            style = Font.ITALIC;
            
         saying.setFont(new Font("Helvetica", style, 36));
      }
   }
}