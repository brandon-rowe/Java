import java.util.*;
import java.lang.*;
import java.io.*;

public class OZTcount{
   public static void main(String[] args){
      float silverWeight;
      float silverPrice;
      float currentPrice;
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter the weight of the coin in OZT: ");
      silverWeight = scan.nextFloat();
      System.out.println("Please enter the price of the coin per OZT: ");
      silverPrice = scan.nextFloat();
      currentPrice = silverWeight * silverPrice;
      System.out.println("The current value of your silver is: $" + currentPrice);
   }

}