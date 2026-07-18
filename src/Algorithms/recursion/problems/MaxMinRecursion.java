package Algorithms.recursion.problems;

public class MaxMinRecursion {

    static int[] findMaxMin(int[] arr, int index, int max, int min) {
        if (index == arr.length) {
            return new int[]{max, min};
        }

        if (arr[index] > max) max = arr[index];
        if (arr[index] < min) min = arr[index];

        return findMaxMin(arr, index + 1, max, min);
    }

    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23, 56, 3, 91};

        int[] result = findMaxMin(arr, 1, arr[0], arr[0]);

        System.out.println("Maximum: " + result[0]);
        System.out.println("Minimum: " + result[1]);
    }
}