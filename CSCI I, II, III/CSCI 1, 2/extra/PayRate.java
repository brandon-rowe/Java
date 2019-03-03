//  payrate.java       Author: B. Rowe
//  Demonstrates the use of the Scanner class to read numeric data.
//  Uses expressions to evaluate mathematic equations. Takes user 
//  Input and produces Output. 
import java.util.Scanner;

public class PayRate
{
//-----------------------------------------------------------------
//  Calculates hourly wage and overtime before taxes. 
//-----------------------------------------------------------------
   public static void main(String[] args)
   {  //Create Variables
      double hours, payRate, regularPay,  payOut;
      double overTimeHours, overTimePayRate, overTimePay;
      final int REGULARHOURS = 40;
      //Intialize Scanner and read input
      Scanner scan = new Scanner(System.in); 
      System.out.print("Enter the number of HOURS worked: ");
      hours = scan.nextDouble();
      System.out.print("Enter the hourly PAY rate: ");
      payRate = scan.nextDouble();
      //Calculate OverTime Pay
      if (hours > REGULARHOURS)
      {
         overTimePayRate = payRate * 1.5;
         overTimeHours = hours - REGULARHOURS;
         overTimePay = overTimePayRate * overTimeHours;
         regularPay = REGULARHOURS * payRate;
         payOut = regularPay + overTimePay;
      }
      else  //Calculate Regular Pay
      {
         payOut = hours * payRate;
      }
      // Print results
      System.out.println("You should have: " + payOut + " in the bank!");
   }
}
