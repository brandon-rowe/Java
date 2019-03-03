// *******************************************************************
//   Palindrome.java
// 
//   Reads in a string and prints a message saying whether it
//   is a palindrome.
// *******************************************************************
import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
   	String string;
   	Scanner scan = new Scanner (System.in);
   
   	System.out.print("Enter a string: ");
   	string = scan.nextLine();
   	if (palindrome(string))
   	    System.out.println("It's a palindrome!");
   	else
   	    System.out.println("It's not a palindrome.");
    }


    //----------------------------------------------------------
    // Recursively determines whether s is a palindrome.  
    // It is if
    //  -- it's 0 or 1 char in length, or
    //  -- the first and last letters are the same and the 
    //     string without those letters is also a palindrome
    //----------------------------------------------------------
    private static boolean palindrome(String s)
    {
   	int length = s.length();
   	return 
   	    (s.length() <= 1) ||
   	    (s.charAt(0) == s.charAt(length-1) &&
   	     palindrome(s.substring(1,length-1)));
    }
}

















