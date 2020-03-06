import java.io.*;
import java.lang.*;
import java.util.*;

public class Lec2Act32 {

    QuickSelect qsort = new QuickSelect();

    public static void main(String[] args)
    {
        int[] a = new int[]{13, 4, 9, 35, 67, 88, 24, 78};
        Lec2Act32 LA = new Lec2Act32();
        LA.process(a);
    }
    
    public int[] process(int[] a)
    {
      top(3,a);
      top(5,a);
      top(7,a);
      return a;
    }

    public void top(int val, int[] a){
        System.out.println("Top " + val);
        for(int i=0 ;i<val; i++){
            System.out.print(qsort.kthSmallest(a,0,a.length-1,i)+ ", ");
        }
        System.out.println("\n");
    }
}
