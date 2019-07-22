import java.util.*;
import java.lang.*;
import java.io.*;

public class genericProgression<k>{
   protected k first;
   protected k cur;
   genericProgression(){
      first = cur;
   }
   protected k firstValue(){
      cur = first;
      return cur;
   }
   protected k nextValue(){
      return ++cur;
   }
   protected k printProgression(int n){
      System.out.println(firstValue());
      for(int i = 2; i<=n; i++)
         System.out.println(nextValue());
      System.out.println();
   }
}