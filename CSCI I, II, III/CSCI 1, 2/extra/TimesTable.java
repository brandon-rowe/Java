//********************************************************************
//  TimesTable.java       Author: Brandon Rowe
//
//  Demonstrates how to use nested loops.
//********************************************************************

public class TimesTable
{
    //-----------------------------------------------------------------
    //  Add comment of what the program does.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
     //Initialize Variables 
     int num1, num2, output;
     num1 = 1;
     num2 = 1;
    
     // Nested While loop iterating two times with inner while loop iterating through 12 times.
     // Calculates and prints num1 X num2 = output.
     while(num1 <= 2)    //Iterates 2 times
      {
         while(num2 <= 12) //Iterates 12 times within the 2 iterations (24 total)
         {
            output = num1 * num2;                                     // calculate output
            System.out.println(num1 + " X " + num2 + " = " + output); // Print Result of num1*num2
            num2++; //Increment the inner counter
         }
         System.out.println("\n");
         num1++;  //Increment the counter
         num2=1;   
      }
      System.out.println("\n \t End of program!!!!");
    }
}
