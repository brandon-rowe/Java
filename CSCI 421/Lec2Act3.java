import java.io.*;
import java.lang.*;
import java.util.*;

public class Lec2Act3 {

    public static void main(String args[]) {
    
        Comparable arr0[]  = CreateArray(2000);
        Comparable arr1[] = CreateArray(4000);
        Comparable arr2[] = CreateArray(8000);
        Comparable arr3[] = CreateArray(16000);

        QuickSort qsort = new QuickSort();
        
        //Run each array through quicksort and log time in nanoseconds
        long start = System.nanoTime();
        qsort.sort(arr0, 0, arr0.length-1);
        long end = System.nanoTime();
        System.out.println("Size: "+ arr0.length + "\nTime: " + (end - start) + " Nanoseconds");

        start = System.nanoTime();
        qsort.sort(arr1, 0, arr1.length-1);
        end = System.nanoTime();
        System.out.println("Size: "+ arr1.length + "\nTime: " + (end - start) + " Nanoseconds");

        start = System.nanoTime();
        qsort.sort(arr2, 0, arr2.length-1);
        end = System.nanoTime();
        System.out.println("Size: "+ arr2.length + "\nTime: " + (end - start) + " Nanoseconds");

        start = System.nanoTime();
        qsort.sort(arr3, 0, arr3.length-1);
        end = System.nanoTime();
        System.out.println("Size: "+ arr3.length + "\nTime: " + (end - start) + " Nanoseconds");
    }

    public static Comparable [] CreateArray(int size){
        Comparable[] array = new Comparable[size];
        for(int i=0; i<size; i++){
            array[i]= (int) ((Math.random()*size)+1);
        }
        return array;
    }
}
