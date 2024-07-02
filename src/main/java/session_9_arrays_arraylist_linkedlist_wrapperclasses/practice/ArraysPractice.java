package session_9_arrays_arraylist_linkedlist_wrapperclasses.practice;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] numbers = {14, 24, 12, -4, 13};
        //index       0   1   2   3   4
        //printArraysAverage(numbers);

        //String[][] names = {{"Ms.", "Mr."}, {"Alice", "John"}};
        //index                names[0][0]
        //printMultiDimensionalArray(names);

        printSortedArray(numbers);
        printSearchIndexValue(numbers, 12);

    }

    public static void printSearchIndexValue(int[] array, int searchKey){
        Arrays.sort(array);
        System.out.println("SearchKey index: " + Arrays.binarySearch(array, searchKey));
    }


    public static void printMultiDimensionalArray(String[][] inputArray) {
        for (int index = 0; index < inputArray.length; index++) {
            for (int index2 = 0; index2 < inputArray[index].length; index2++) {
                System.out.print(inputArray[index2][index] + " ");
            }
            System.out.println();
        }
    }

    public static void printSortedArray(int[] array){
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }


    public static void printArraysAverage(int[] inputArray) {
        double sum = 0;
        for (int value : inputArray) {
            sum += value;
        }
        System.out.println("Arrays average: " + (sum / inputArray.length));
    }

}
