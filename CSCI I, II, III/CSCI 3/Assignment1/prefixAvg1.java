import java.utils.*;


public class prefixAvg1
{
   public static void main(String[] args)
   {
      //[2, 4, 6, 8, 10] [1, 3, 5, 7, 9] [3, 9, 6, 4, 1] 
      int[] X = new int[]{2, 4, 6, 8, 10};
      int[] A;
      
      for(int i=0; i<X.length; i++)
      {
         A += X[i];
         A[i] = A/(i+1);
      }
      System.out.println(A);
      
   }
}