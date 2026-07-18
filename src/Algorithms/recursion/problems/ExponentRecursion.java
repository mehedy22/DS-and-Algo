package Algorithms.recursion.problems;


/*
* 2^5 = 2 × 2 × 2 × 2 × 2
* m^n = m × m × m × ... × m    (n times)
* pow(m, n) = (m × m × m × ... × m) × m  (n − 1 times)
* pow(m, n) = pow(m, n - 1) × m
*
*
            {
pow(m, n) = { 1                     , n = 0
            {
            { pow(m, n - 1) × m     , n > 0
*
* */
public class ExponentRecursion {

    static int power(int m, int n) {
        if (n == 0) {
            return 1;
        }
        return power(m, n - 1) * m;
    }

    public static void main(String[] args) {
        int result = power(2, 5);
        System.out.println("The result is : " + result);
    }
}
