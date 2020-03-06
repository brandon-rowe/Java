

import edu.princeton.cs.algs4.StdRandom;
import java.util.Random;

public class Test {

    public static int N = 10000;
    public static Comparable[] sequence = new Comparable[N];

    public static void main(String[] args) {
        {

            long start, end, total;
            Random random = new Random();

            for (int i = 0; i < N; i++)
                sequence[i] = Math.abs(random.nextInt(N*5));

            System.out.println("Original Quicksort length "+ N);


            start = System.currentTimeMillis();
            sort(sequence);
            end = System.currentTimeMillis();

            total = end - start;

            System.out.println("\nRuntime: "+total);

            for (int i = 0; i < N; i++)
                sequence[i] = Math.abs(random.nextInt(N*5));

            System.out.println("\nRandomized Quicksort length "+ N);


            start = System.currentTimeMillis();
            sortRandom(sequence, 0, N - 1);
            end = System.currentTimeMillis();

            total = end - start;

            System.out.println("\nRuntime: "+total);

        }
    }

    public static void sort(Comparable[] a)
    {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi)
    {
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi)
    {
        int i = lo, j = hi+1;
        while (true)
        {
            while (less(a[++i], a[lo]))
                if (i == hi) break;
            while (less(a[lo], a[--j]))
                if (j == lo) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    private static void sortRandom(Comparable[] a, int lo, int hi)
    {
        {
            if (hi - lo <= 0)
                return;
            else
            {
                Random rand = new Random();
                int pivotIndex = lo + rand.nextInt(hi - lo + 1);
                exch(a, pivotIndex, hi);

                int pivot = (int)a[hi];
                int partition = partition(a, lo, hi);
                sortRandom(a,lo, partition - 1);
                sortRandom(a,partition + 1, hi);
            }
            sequence = a;
        }
    }


    private static boolean less(Comparable v, Comparable w)
    {  return v.compareTo(w) < 0;  }

    private static void exch(Comparable[] a, int i, int j)
    {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
