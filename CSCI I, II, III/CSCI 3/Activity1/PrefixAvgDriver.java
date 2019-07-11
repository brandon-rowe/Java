import java.util.*;
import java.util.Scanner;
import java.io.*; 
import java.lang.*;

public class PrefixAvgDriver{

   public static void main(String[] args){
      int X [] = {2, 4, 6, 8, 10};
      int Y [] = {1, 3, 5, 7, 9};
      int Z [] = {3, 9, 6, 4, 1};
      int Q [] = new int[5];
      
      PrefixAvgerage1 avg = new PrefixAvgerage1();
      Q = avg.testArray(Y);
      
      for(int i = 0; i<Q.length; i++){
         System.out.println(Q[i]);
      }       
   }
}