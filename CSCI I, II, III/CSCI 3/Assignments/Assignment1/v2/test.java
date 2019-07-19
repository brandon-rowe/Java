import java.util.*;
import java.io.*;
import java.lang.*;

public class test{
   public static void main(String[] args){
         int X [] = new int[100];
         int n = X.length-1;
         int A [] = new int[n];
         Random rand = new Random();
         
         
         for(int i=0; i<=n; i++){
            X[i] = rand.nextInt(100);
         }
         
         for(int i=0; i<=n; i++){
            System.out.println(X[i]);
         }
         
         
      
      
         /*for(int k=0; k<in.length; k++){
            X[k] = in[k];
         }
         
         for(int i=0; i<X.length; i++){
            int a = 0; 
            for(int j=0; j<=i; j++){ 
               a += X[j];
            }
            A[i] += (a/(i+1));
         } */
      
  }

}