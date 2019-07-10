// Dictionary
public class Words
{
   public static void main(String[] args)
   {
      Dictionary investo = new Dictionary(1500, 50000);
      System.out.println("Investopedia has " + investo.getPages() + " pages of content.");
      System.out.println("Investopedia has " + investo.getDefinitions() + " Definitions.");
      System.out.println("Investopedia has " + investo.ComputeRatio() + " Definitions per page average.");
      
   }
}


