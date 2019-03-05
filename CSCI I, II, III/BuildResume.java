import java.util.*;
import java.lang.*;

public class BuildResume
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter your name");
      String owner = scan.nextLine();
      Resume me = new Resume(owner);
      System.out.println(me);
   }
}