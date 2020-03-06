import java.util.*;
import java.io.*;

public class Solution{
   public static void main(String[] args)
   {
      System.out.println("Please enter a string: ");
      Scanner scan = new Scanner(System.in);
      String s = scan.next();
      scan.close();
      String tmp = "";
      
      for (int i=s.length()-1; i>=0; i--)
      {
         tmp += s.charAt(i);
      }
      
      System.out.println(s);
      System.out.println(tmp);
      
      if (tmp.equals(s))
      {
         System.out.println("Yes");
      }
      else
      {
         System.out.println("No");
      }
      
   }
}