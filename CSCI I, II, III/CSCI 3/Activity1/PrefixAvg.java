import java.util.*;
import java.util.Scanner;
import java.io.*; 

public class PrefixAvg{

	public static void main(String[] args){
		int X [] = {2, 4, 6, 8, 10};
		int A [] = new int[4];

		for(int i=0; i<X.length-1; i++){
			int a = 0;
			for(Int j=0; j<i; j++){
				a+=X[j];
			}
			A[i] = a / (i+1);
		} 
      for(int k = 0; i<A.length-1; i++){
	      System.out.printLn(A[k]);}	
	      //return A;}
   
}
