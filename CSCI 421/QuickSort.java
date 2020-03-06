import java.io.*;
import java.lang.*;
import java.util.*;

public class QuickSort
{
    public static int N = 5;
    public static Comparable[] arr = new Comparable[N];

    void random(int low,int high)
    {
        Random rand= new Random();
        int pivot = rand.nextInt(high-low) + low;
        Comparable temp1=arr[pivot];
        arr[pivot]=arr[high];
        arr[high]=temp1;
    }
    
    int partition(Comparable arr[], int low, int high)
    {
        Comparable pivot = arr[high];
        int i = (low-1); 
        for (int j = low; j < high; j++)
        {
            if (arr[j] == pivot || arr[j].compareTo(pivot)<0)
            {
                i++;
                Comparable temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        Comparable temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }

    void sort(Comparable a[], int lo, int hi)
    {
        if (lo < hi)
        {
            int p = partition(a, lo, hi);
            sort(a, lo, p-1);
            sort(a, p+1, hi);
        }
    }
}
