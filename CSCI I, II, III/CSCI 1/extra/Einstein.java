//Einstein.java
import java.awt.*;
import javax.swing.*;

public class rectangle extends JApplet
{
   public void rectangle(Graphics page)
   {
      page.drawRect(50, 50, 40, 40);
      page.drawRect(60, 80, 225, 30);
      page.drawOval(75, 65, 20, 20);
      page.drawLine(35, 60, 100, 120);
      
      page.drawString("Out of clutter, find simplicity.", 110, 170);
      page.drawString("-- Albert Einstein", 130, 100);
   }
}