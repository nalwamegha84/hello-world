package algorithm;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here Megha
        int n = list.length;
        for (int i = 1; i < n; ++i) {
            int key = list[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        int[] list = array;
        int n = list.length;
        //implement here Megha
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (list[j] > list[j+1])
                {
                    // swap list[j+1] and list[i]
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
        return list;
    }

    public int[] mergeSort(int[] array) {
        int[] list = array;
        //implement here

        return list;
    }

    public int[] quickSort(int[] array) {
        int[] list = array;
        //implement here

        return list;
    }

    public int[] heapSort(int[] array) {
        int[] list = array;
        //implement here

        return list;
    }

    public int[] bucketSort(int[] array) {
        int[] list = array;
        //implement here

        return list;
    }

    public int[] shellSort(int[] array) {
        int[] list = array;
        //implement here

        return list;
    }
}
