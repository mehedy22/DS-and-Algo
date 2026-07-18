package Algorithms.recursion.problems;


/*

1 + 2 + 3 + 4 + 5 + 6 + 7
1 + 2 + 3 + 4 + ... + n
Sum(n) = 1 + 2 + 3 + 4 + ... + (n - 1) + n
Sum(n) = Sum(n - 1) + n

           {
Sum(n) =   { 0                  , n = 0
           {
           { Sum(n - 1) + n     , n > 0
*
* */
public class SumOfNaturalNumber {
    static int sumOfNaturalNumber(int n) {
        if (n == 0) {
            return 0;
        }
        return sumOfNaturalNumber(n - 1) + n;
    }


    public static void main(String[] args) {
        int n = 10;
        int ans = sumOfNaturalNumber(n);
        System.out.println("The sum of natural number for n is: " + ans);

    }
}
