package Algorithms.recursion.problems;

public class PrimeNumber {

    static boolean isPrime(int n) {
        return check(n, 2);
    }

    static boolean check(int n, int divisor) {
        if (n <= 1) return false;
        if (divisor * divisor > n) return true;
        if (n % divisor == 0) return false;

        return check(n, divisor + 1);
    }

    public static void main(String[] args) {
        System.out.println(isPrime(17));
        System.out.println(isPrime(18));
    }
}
