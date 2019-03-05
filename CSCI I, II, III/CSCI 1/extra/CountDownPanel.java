// CountDownPanel
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CountDownPanel extends JPanel
{  
   private final int MAX = 10;
   private JLabel numberLabel;
   private JButton countDownButton, resetButton;
   
   public CountDownPanel()
   {
      setLayout(new GridLayout(2, 2));
      countDownButton = new JButton("Count Down");
      resetButton = new JButton("Reset");
      numberLabel = new JLabel("10");
      add(countDownButton);
      add(resetButton);
      add(numberLabel);
      
      CountDownListener listener = new CountDownListener();
      countDownButton.addActionListener(listener);
      resetButton.addActionListener(listener);
      
      setPreferredSize(new Dimension(500, 400));
      setBackground(Color.yellow);
      setVisible(true);
   }
   
   private class CountDownListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         Object source = event.getSource();
         if (source == countDownButton)
         {
            int current = Integer.parseInt(numberLabel.getText());
            if (current > 0)
            {
               current--;
               numberLabel.setText(Integer.toString(current));
            }
            else
               numberLabel.setText(Integer.toString(current));
         }
         else
            numberLabel.setText(Integer.toString(MAX));
      }
   }
}