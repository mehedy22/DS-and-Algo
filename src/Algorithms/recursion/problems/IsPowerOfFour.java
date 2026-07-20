package Algorithms.recursion.problems;

public class IsPowerOfFour {

    public boolean isPowerOfFour(int n) {

        if (n == 1) {
            return true;
        } else if (n <= 0 || n % 4 != 0) {
            return false;
        }
        return isPowerOfFour(n / 4);
    }
}
