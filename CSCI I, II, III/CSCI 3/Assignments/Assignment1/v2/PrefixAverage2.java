import java.util.*;
import java.util.Scanner;
import java.io.*; 
import java.lang.*;

public class PrefixAverage2{

   public int[] testArray(int [] in){
      int n = in.length;
      int X [] = new int[n];
      int A [] = new int[n];
      
      for(int k=0; k<in.length; k++){
         X[k] = in[k];
      }
      
      
      for(int i=0; i<X.length; i++){
         int a = 0; 
         for(int j=0; j<=i; j++){ 
            a += X[j];
         }
         A[i] += (a/(i+1));
      } 
      
      return A;
   }
}