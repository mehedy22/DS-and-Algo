package Algorithms.recursion.problems;

public class SumOfDigits {

    static int sumOfDigit(int n) {

        if (n == 0) {
            return 0;
        }

        int d = n % 10;

        return d + sumOfDigit(n / 10);
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(sumOfDigit(n));
    }
}