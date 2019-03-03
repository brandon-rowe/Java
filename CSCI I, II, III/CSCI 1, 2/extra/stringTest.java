//  stringTest.java       Author: B. Rowe
//  Demonstrates the use of the Scanner to read string data. 
//  Takes user Input and produces Output. 
import java.util.Scanner;

public class stringTest
{
   public static void main(String[] args)
   {  //Intialize Scanner & Take user input
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter your name: ");     // Prompt User Input
      String yourName = scan.next();               // Take User Input
      System.out.println("\n Enter your hobby: "); // Prompt User Input
      String yourHobby = scan.next();              // Take User Input
      System.out.println("\n Enter your love: ");  // Prompt User Input
      String yourLove = scan.next();               // Take User Input
      // Return input
      System.out.println("\n Your name is: " + yourName + "\n Your hobby is: " + yourHobby + "\n You love: " + yourLove);
      System.out.println("\n \t End of program!!!");
   }
}
