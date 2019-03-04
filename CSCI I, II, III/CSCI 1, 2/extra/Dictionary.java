public class Dictionary extends Book
{
   private int definitions;
   
   public Dictionary(int numPages, int numDefinitions)
   {
      super(numPages);
      definitions = numDefinitions;
   }
   
   public void setDefinitions(int numDefinitions)
   {
      definitions = numDefinitions;
   }
   
   public int getDefinitions()
   {
      return definitions;
   }
   
   public double ComputeRatio()
   {
      return (double) definitions/pages;
   }
}