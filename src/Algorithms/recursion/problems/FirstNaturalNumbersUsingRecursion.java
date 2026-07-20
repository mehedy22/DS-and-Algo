package Algorithms.recursion.problems;

public class FirstNaturalNumbersUsingRecursion {

    static int sumOfNaturalNumber(int n) {
        if (n == 1) {
            return 1;
        } else return n + sumOfNaturalNumber(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfNaturalNumber(n));
    }
}
