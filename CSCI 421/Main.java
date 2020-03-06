public class Main {

    // Driver code
    public static void main(String args[]) {
        Comparable arr0[]  = randomGenerateArray(2000);
        Comparable arr1[] = randomGenerateArray(4000);
        Comparable arr2[] = randomGenerateArray(8000);
        Comparable arr3[] = randomGenerateArray(16000);
        QuickSort qsort = new QuickSort();

        float start = System.nanoTime();
        qsort.sort(arr0, 0, arr0.length-1);
        float end = System.nanoTime();
        System.out.println("Amount of Elements: "+ arr0.length+ "\nTime: "+ (end-start)+"ns");

        start = System.nanoTime();
        qsort.sort(arr1, 0, arr1.length-1);
        end = System.nanoTime();
        System.out.println("Amount of Elements: "+ arr1.length+ "\nTime: "+ (end-start)+"ns");

        start = System.nanoTime();
        qsort.sort(arr2, 0, arr2.length-1);
        end = System.nanoTime();
        System.out.println("Amount of Elements: "+ arr2.length+ "\nTime: "+ (end-start)+"ns");

        start = System.nanoTime();
        qsort.sort(arr3, 0, arr3.length-1);
        end = System.nanoTime();
        System.out.println("Amount of Elements: "+ arr3.length+ "\nTime: "+ (end-start)+"ns");



    }

    /* A utility function to print array of size n */
    static void printArray(Comparable arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static Comparable [] randomGenerateArray(int number){
        Comparable [] array=new Comparable[number];

        for(int i=0; i<number; i++){
            array[i]= (int) ((Math.random()*number)+1);
        }
        return array;
    }




}
