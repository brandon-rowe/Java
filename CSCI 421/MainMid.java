import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] strArray = {"aba", "bba", "aaa","baa", "aab"};
        String[] sortArray = sortStringArray(strArray);
        System.out.println("Anagram List: "+ Arrays.toString(sortArray));
        countDistinct(sortArray);
    }

    public static void selectionSort(String[] array) {
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < array.length-1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < array.length; j++)
                if (array[j].compareTo(array[min_idx])<0)
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            String temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    public static void selectionSort(char[] array) {
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < array.length-1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < array.length; j++)
                if (array[j]<array[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            char temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }


    public static String[] sortStringArray(String[]array){
        String [] stringArray= new String[array.length];
        for(int i=0; i<array.length; i++) {
            char[] arr = array[i].toCharArray();
            selectionSort(arr);
            stringArray[i] = String.valueOf(arr);
        }
        selectionSort(stringArray);

        return stringArray;
    }

    public static void countDistinct(String[] array){
        int res = 1;

        // Pick all elements one by one
        for (int i = 1; i < array.length; i++)
        {
            int j = 0;
            for (j = 0; j < i; j++)
                if (array[i].equals(array[j]))
                    break;

            // If not printed earlier,
            // then print it
            if (i == j)
                res++;
        }

        System.out.println("Distict Elements: "+ res);
    }
}
