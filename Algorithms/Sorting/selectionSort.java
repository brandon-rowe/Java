import java.util.*;
import java.io.*;
import java.lang.*;

class selectionSort
{
	void sort(int A[])
	{
		int n = A.length;
		for (int i=0; i < n-1; i++)
		{
			int min_idx = i;
			for(int j=i+1; j<n; j++)
			{
				if (A[j] < A[min_idx])
					min_idx = j;
			}
			int tmp = A[min_idx];
			A[min_idx] = A[i];
			A[i] = tmp;
		}
	}

	void printArray(int A[])
	{
		int n = A.length;
		for (int i = 0; i<n; ++i)
			System.out.print(A[i] + " ");
		System.out.println();
	}

	public static void main(String args[])
	{
		selectionSort ob = new selectionSort();
		int A[] = {64, 25, 12, 22, 11};
		ob.sort(A);
		System.out.println("Sorted array");
		ob.printArray(A);

	}

}