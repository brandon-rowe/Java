import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaList

    public static void main(String[] args) {
           List <Integer> L = new ArrayList<Integer> ();
           Scanner scan = new Scanner(System.in);
           int n = scan.nextInt();
           for (int i=0; i<n; i++)
           {
               int tmp = scan.nextInt();
               L.add(tmp);
           }
           int q = scan.nextInt();
           for (int i=0; i<q; i++)
           {
               String stri = "Insert";
               String strd = "Delete";
               String cmd = scan.next();
               if(cmd.equals(stri))
               {
                     int idx = scan.nextInt();
                     int val = scan.nextInt();
                     L.add(idx, val);
               }
               else if(cmd.equals(strd))
               {
                     int idx = scan.nextInt();
                     L.remove(idx);
               }
           }
           for(int l : L){
               System.out.print(l + " ");
           }
      }
}

/*
Input Format

The first line contains an integer, N (the initial number of elements in L).
The second line contains N space-separated integers describing L.
The third line contains an integer, Q(the number of queries).
The 2Q subsequent lines describe the queries, and each query is described over two lines:

If the first line of a query contains the String Insert, then the second line contains two space separated integers x y , and the value y must be inserted into L at index x.
If the first line of a query contains the String Delete, then the second line contains index x, whose element must be deleted from L.