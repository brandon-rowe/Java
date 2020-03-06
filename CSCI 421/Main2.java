import java.io.*;
import java.lang.*;
import java.util.*;

public class Main2 {
    QuickSelect qs= new QuickSelect();

    public static void main(String[] args)
    {
        int[] array = new int[]{13, 4, 9, 35, 67, 88, 24, 78};
        topValues(3,array);
        topValues(5,array);
        topValues(7,array);

    }
    
    public void int[] process(int []a)

    public static void topValues(int amount, int []a){
        System.out.println("Top "+amount+ " Elements: ");
        for(int i=0 ;i<amount; i++){
            System.out.print(qs.kthSmallest(a,0,a.length-1,i)+ " ");
        }
        System.out.println("\n");
    }
}
