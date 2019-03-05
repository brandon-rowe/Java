import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

public class quoteOptionsPanel
{

   private JLabel quote;
   private JRadioButton comedy, philosophy, carpentry;
   private String comedyQuote, philosophyQuote, carpentryQuote;
   
   public quoteOptionsPanel()
   {
      comedyQuote = "Take my wife, please!";
      philosophyQuote = "I think, therefore I am.";
      carpentryQuote = "Measure twice. Cut once.";
      
      quote = new JLabel(comedyQuote);
      quote.setFont("Helvetica", Font.Bold, 24));
      
      comedy = new JRadioButton("Comedy", true);
      comedy.setBackground(Color.green);
      philosophy = new JRadioButton("philosophy");
      philosophy.setBackground(Color.cyan);
      carpentry = new JRadioButton("carpentry");
      carpentry.setBackground(Color.yellow);
      
      ButtonGroup group = new ButtonGroup();
      group.add(comedy);
      group.add(philosophy);
      group.add(carpentry);
      
      QuoteListener listener = new QuoteListener();
      comedy.addActionListener(listener);
      philosophy.addActionListener(listener);
      carpentry.addActionListener(listener);
      
      add(Quote);
      add(comedy);
      add(philosophy);
      add(carpentry);
      
   }
   
}