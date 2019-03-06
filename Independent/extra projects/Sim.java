//simulation
//testing hypothesis for results of game. 
//given 3 boxes with 2 balls each inside
//box 1 contains 2 gold balls
//box 2 contains 2 silver balls
//box 3 contains 1 gold ball & 1 silver ball
import java.util.*;
import java.lang.*;
import java.util.Random;


public class Sim
{
   public static int[] removeOneGold(int[] input)
   {  
       int[] copy = new int[input.length-1];
       int c = 0;
       for (int i = 0; i < input.length; i++)
       {
           if (input[i] == 1 && c<1)
           {
               System.arraycopy(input, 0, copy, 0, i);
               System.arraycopy(input, i+1, copy, i, input.length-i-1);
           }
       }
       return copy; 
   }

   public static void main(String[] args)
   {
      int tally = 0;
      int[] input = new int[] {0,0,0,1,1,1};
      int[] minusGold = new int[5];
      
      System.out.println("0's represent silver, 1's represent gold.");
      System.out.println("Current array: ");
      for(int i: input)
      {
         System.out.print(i + " ");
      }
      System.out.println();
      System.out.println("User picks a box with 1 gold value.");
      
      minusGold = Sim.removeOneGold(input);
      
      for(int i: minusGold)
      {
         System.out.print(i + " ");
      }
   }
}

//array = ArrayUtils.removeElement(array, element);

/*
      for (int i : input)
      {
         System.out.println(i + " ");
      }
      
      System.out.println("User grabs gold, what are the chances they grab gold again from the same box?");
      System.out.println("We can eliminate the silver box option since we already grabbed a gold ball.");
      
      int count = 0;
      loop2:
      for (int i : input)
      {
         if (i == 0)
            if (count <= 2)
            {
               input[i] -= i;
               count++;
            }
            else
            {
               break loop2;
            }
      }
      
      for (int i : input)
      {
         System.out.println(i + " ");
      }
      
      //Run a similation of checking 100 games.
      for (int i=0; i<100; i++)
      {
         Random rand = new Random();
         int randomNum = rand.nextInt(3);
         if (randomNum == 0)
            tally += 0;
         else 
            tally += 1;
      }
      System.out.println("Tally after 100 games: "+tally);*/
