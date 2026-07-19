package Algorithms.recursion.problems;

public class GeekOonacciNumber {
    static int geekonacchi(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 3;
        } else if (n == 3) {
            return 2;
        }
        return geekonacchi(n - 1) + geekonacchi(n - 2) + geekonacchi(n - 3);
    }

    public static void main(String[] args) {
        System.out.println(geekonacchi(6));
    }
}
