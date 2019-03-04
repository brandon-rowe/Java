//simulation
//testing hypothesis for results of game. 
//given 3 boxes with 2 balls each inside
//box 1 contains 2 gold balls
//box 2 contains 2 silver balls
//box 3 contains 1 gold ball & 1 silver ball
import java.util.*;
import java.util.Random;

public class Sim
{
   public static void main(String[] args)
   {
      int tally = 0;
      int[] input = new int[] {0,0,0,1,1,1,};
      System.out.println("Original options: "+input);
      System.out.println("0's represent silver, 1's represent gold.");
      System.out.println("User picks a box with 1 gold value.");
      loop1:
      for (int i : input)
      {
         if (i == 1)
            input[i] -= i;
         break loop1;
      }
      System.out.println(input);
      System.out.println("User grabs gold, what are the chances they grab gold again from the same box?");
      System.out.println("We can eliminate the silver box option since we already grabbed a gold ball.");
      System.out.println("This leaves us with "+input+" as options");
      
      for (int i=0; i<100; i++)
      {
         Random rand = new Random();
         int randomNum = rand.nextInt(3);
         if (randomNum == 0)
            tally += 0;
         else 
            tally += 1;
      }
      System.out.println("Tally after 100 games: "+tally);
   }
   
}