package Algorithms.recursion.problems;

public class Factorial {

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return factorial(n - 1) * n;
    }


    public static void main(String[] args) {
        int n = 5;
        int ans = factorial(n);
        System.out.println("The factorial of the given number is: " + ans);
    }
}
