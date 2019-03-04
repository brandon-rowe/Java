//********************************************************************
//  TimesTable.java       Author: Put Your Name
//
//  Demonstrates how to use nested loops.
//********************************************************************

public class TimesTable2
{
   //-----------------------------------------------------------------
   //  Add comment of what the program does.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      int num1, num2, output;
      num1 = 1;
      // Add code after this line.
      for(num2 = 0; num2 <= 12; num2++)
      {
         num1 = 1;
         output = num1 * num2;
         System.out.println(num1 + " X " + num2 + " = " + output);
      }
      for(num2 = 0; num2 <= 12; num2++)
      {
         num1 = 2;
         output = num1 * num2;
         System.out.println(num1 + " X " + num2 + " = " + output);
      }
      System.out.println("\n \t End of program!!!!");
   }
}
