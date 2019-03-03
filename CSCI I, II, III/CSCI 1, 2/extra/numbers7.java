// Counting number of occurrences.
public class numbers7
{
   public static void main(String[] args)
   {
      int[] multiples = new int[];
      int[] numbers = new int[]
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter integers between 1 & 50. ");
    
      for(int i = 0; i < numbers.length; i++)
      {   
         numbers[i] = scan.nextInt();
         //System.out.println(grades[i]); //Prints every grade in the array.
         System.out.println("The number at index " + i + " is " + numbers[i] );
         if (numbers[i] > highest)
         {highest = numbers[i];}    
      }
   }
}
