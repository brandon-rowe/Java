import java.io.*;
import java.util.*;
import java.lang.*;

public class Midterm {


    //Iterate through the array and for each element S of the array, 
    //sort the underlying character array of S using your chosen sotring algorithm.

    public static void main(String[] args) {
        String[] strArray = {"bba", "baa", "aba",  "aaa", "aab", "cab", "bbb"};
        String[] sortedArray = sortArray(strArray);
        System.out.println("Sorted Anagram "+ Arrays.toString(sortedArray));
        distinctElements(sortedArray);
    }

   //Selection sort for string array. This is ran twice before and after strings are 
   //sorted to ensure compareTo is evaluated after char array are sorted by element
   public static void selectionSort(String[] a) {
        for (int i = 0; i < a.length-1; i++) {
            int min = i;
            for (int j = i+1; j < a.length; j++) 
               if (a[j].compareTo(a[min])<0)
                  min = j;
            String tmp = a[min];
            a[min] = a[i];
            a[i] = tmp;
        }
    }
   //Selection sort for char array
   public static void selectionSort(char[] c) {
        for (int i = 0; i < c.length-1; i++) {
            int min = i;
            for (int j = i+1; j < c.length; j++)
                if (c[j]<c[min])
                    min = j;
            char tmp = c[min];
            c[min] = c[i];
            c[i] = tmp;
        }
    }

   //Convert string array to char array and sort char array. 
   //Return and sort new string array. Return sorted by char and string.
   public static String[] sortArray(String[] s){
        String[] ret= new String[s.length];
        for(int i=0; i<s.length; i++) {
            char[] c = s[i].toCharArray();
            selectionSort(c);
            ret[i] = String.valueOf(c);
        }
        selectionSort(ret);
        return ret;
    }

   //Count number of distinct elements 
    public static void distinctElements(String[] s){
        int count = 1;
        for (int i = 1; i < s.length; i++){
            int j = 0;
            for (j = 0; j < i; j++)
                if (s[i].equals(s[j]))
                    break;
            if (i == j)
                count++;
        }
        System.out.println("Distict Elements: "+ count);
    }
}
