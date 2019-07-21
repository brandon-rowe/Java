import java.util.*;
import java.io.*;
import java.lang.*;

public class test{
   public static void main(String[] args){
         int X [] = new int[100];
         int n = X.length;
         int A [] = new int[n];
         Random rand = new Random();
         
         
         System.out.println("Creating random array for int X [].");
         System.out.print("Start time in nanoseconds = ");
         System.out.println(System.nanoTime());
         for(int i=0; i<n; i++){
            X[i] = rand.nextInt(100);
         }
         System.out.print("End time in nanoseconds = ");
         System.out.println(System.nanoTime());
         System.out.println();
         
         System.out.println("Creating average array for int A [].");
         System.out.print("Start time in nanoseconds = ");
         System.out.println(System.nanoTime());
         for(int i=0; i<n; i++){
            int a = 0; 
            for(int j=0; j<=i; j++){ 
               a += X[j];
            }
            A[i] += (a/(i+1));
         }
         System.out.print("End time in nanoseconds = ");
         System.out.println(System.nanoTime());
         System.out.println();
         
         
         System.out.println("Print random array.");
         for(int i=0; i<n; i++){
            System.out.print(X[i] + ", ");
         }
         System.out.println("End of printing random array.");
         System.out.println();
        
         System.out.println("Print Avg array.");
         for(int i=0; i<n; i++){
            System.out.print(A[i] + ", ");
         }
         System.out.println("End of printing Avg array.");
      
  }

}