/** Testing.java **/
/** 09-11-18 **/
import java.util.*;

public class Testing
{
   public static void main(String[] args)
   {
      double _hours;
      double _wage;
      double pay;  
      double regPay;  
      double ovTimeHours;
      double ovTimeWage;
      double ovTimePay;
      double regHours = 40;
      
      System.out.println("Please enter your hourly pay: ");
      Scanner scan = new Scanner(System.in);
      _wage = scan.nextDouble();
      
      System.out.println("Please enter your weekly hours: ");
      _hours = scan.nextDouble();
      
      if (_hours > 0 && _hours <= regHours)
      {
         regPay = _hours * _wage;  
         pay = regPay;
         System.out.println("Your weekly pay before taxes is: " + pay);
      }
      else if (_hours > regHours)
      {
         regPay = regHours * _wage;
         ovTimeWage = _wage * 1.5;
         ovTimeHours = _hours - regHours;
         ovTimePay = ovTimeHours * ovTimeWage;
         pay = ovTimePay + regPay;
         System.out.println("Your weekly pay before taxes is: " + pay);
      }
      else
      {
         System.out.println("Please enter valid values.");
      }
      
      
      
      
   }
}