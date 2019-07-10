// Program to calculate grade.
import java.util.Scanner;
public class grades

{
   public static void main(String[] args)
   {
      int studentNum;
      int highest = 0;
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Please enter the number of students. ");
      studentNum = scan.nextInt();
      System.out.println("Please enter the grades separated by spaces. ");
      int grades[] = new int[studentNum];
      for(int i = 0; i < studentNum; i++)
      {   
         grades[i] = scan.nextInt();
         //System.out.println(grades[i]); //Prints every grade in the array.
         System.out.println("The number at index " + (i+1) + " is " + grades[i] );
         if (grades[i] > highest)
         {highest = grades[i];}    
      }
      
      for (int i = 0; i < studentNum; i++)
      {
         if (grades[i] >= (highest - 5))
            System.out.println("Student " + i + " made a grade of A");
         else if (grades[i] >= (highest - 10))
            System.out.println("Student " + i + " made a grade of B");
         else if (grades[i] >= (highest - 15))
            System.out.println("Student " + i + " made a grade of C");
         else if (grades[i] >= (highest - 20))
            System.out.println("Student " + i + " made a grade of D");
         else
            System.out.println("Student " + i + " made a grade of F");
      }
      
      System.out.println("The highest is " + highest);
      System.out.println(studentNum);
      
   }
   
};