package Algorithms.recursion.problems;

public class BubleSort {
    public class BubbleSortRecursive {

        static void bubbleSort(int[] arr, int n, int i) {

            // Entire array sorted
            if (n == 1)
                return;

            // One pass completed
            if (i == n - 1) {
                bubbleSort(arr, n - 1, 0);
                return;
            }

            // Compare adjacent elements
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }

            // Continue current pass
            bubbleSort(arr, n, i + 1);
        }

        public static void main(String[] args) {

            int[] arr = {5, 1, 4, 2, 8};

            bubbleSort(arr, arr.length, 0);

            for (int x : arr)
                System.out.print(x + " ");
        }
    }
}
