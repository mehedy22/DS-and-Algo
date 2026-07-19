package Algorithms.recursion.problems;

public class ProductOfTwoNumbers {

    static int product(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a + product(a, b - 1);
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 7;
        int prod = product(6, 7);
        System.out.printf("Product of %d and %d is: %d", a, b, prod);
    }
}
