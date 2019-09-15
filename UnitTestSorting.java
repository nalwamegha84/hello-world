package algorithm;

import org.testng.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4, 10};
        int[] sortedArray = {0, 1, 2, 4, 5, 6, 9, 10};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm. Megha
        //sort.printSortedArray(unSortedArray);

        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }
       // sort.bubbleSort(unSortedArray);
       //sort.printSortedArray(unSortedArray);
        sort.insertionSort(unSortedArray);
        sort.printSortedArray(unSortedArray);
        //Now implement Unit test for rest of the soring algorithm...................below

    }
}
