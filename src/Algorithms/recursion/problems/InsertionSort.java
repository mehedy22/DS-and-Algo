package Algorithms.recursion.problems;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 3, 1, 9, 0, 5, 6, 10, 7};

        insertionSort(arr, 0);

        System.out.println(Arrays.toString(arr));
    }

    // Replaces the outer loop
    public static void insertionSort(int[] arr, int i) {

        // Base case (same as i <= arr.length - 2)
        if (i == arr.length - 1) {
            return;
        }

        // Replaces the inner loop
        insert(arr, i + 1);

        // Next pass
        insertionSort(arr, i + 1);
    }

    // Replaces:
    // for (int j = i + 1; j > 0; j--)
    public static void insert(int[] arr, int j) {

        // Same as j > 0
        if (j == 0) {
            return;
        }

        if (arr[j] < arr[j - 1]) {

            int temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;

            // Continue moving left
            insert(arr, j - 1);
        }
    }

}
