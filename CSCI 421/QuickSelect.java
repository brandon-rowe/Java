import java.io.*;
import java.lang.*;
import java.util.*;

public class QuickSelect{

    public static int partition (int[] a, int lo, int hi)
    {
        int pvt = a[hi], pvtloc = lo;
        for (int i = lo; i <= hi; i++)
        {
            if(a[i] > pvt)
            {
                int tmp = a[i];
                a[i] = a[pvtloc];
                a[pvtloc] = tmp;
                pvtloc++;
            }
        }
        int tmp = a[hi];
        a[hi] = a[pvtloc];
        a[pvtloc] = tmp;

        return pvtloc;
    }
    
    public static int kthSmallest(int[] a, int lo, int hi, int k)
    {
        int partition = partition(a,lo,hi);
        if(partition == k)
            return a[partition];
        else if(partition < k )
            return kthSmallest(a, partition + 1, hi, k );
        else
            return kthSmallest(a, lo, partition-1, k );
    }

}