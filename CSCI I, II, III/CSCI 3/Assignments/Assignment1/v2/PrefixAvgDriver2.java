import java.util.*;
import java.util.Scanner;
import java.io.*; 
import java.lang.*;

public class PrefixAvgDriver2{

   public static void main(String[] args){
      int n = 1000;
      int X [] = new int[1000];
      int Y [] = new int[5000];
      int Z [] = new int[10000];
      int Q [] = new int[n];
      
      PrefixAverage2 avg = new PrefixAverage2();
      Q = avg.testArray(X);
      
      System.out.print("Start time in nanoseconds :  ");
      for(int i = 0; i<Q.length; i++){
         System.out.println(Q[i]);
      }   
      System.out.println();
      System.out.print("End time in nanoseconds = ");
      System.out.println(System.nanoTime());
      System.out.println();
      
      n = Y.length;
      Q = avg.testArray(Y);
      
      System.out.print("Start time in nanoseconds :  ");
      for(int i = 0; i<Q.length; i++){
         System.out.println(Q[i]);
      }    
      System.out.println();
      System.out.print("Time in nanoseconds = ");
      System.out.println(System.nanoTime());
      System.out.println();
      
      n= Z.length;
      Q = avg.testArray(Z);
      
      System.out.print("Start time in nanoseconds :  ");
      for(int i = 0; i<Q.length; i++){
         System.out.println(Q[i]);
      }  
      System.out.print("Time in nanoseconds = ");
      System.out.println(System.nanoTime());
      System.out.println();
      
   }
}