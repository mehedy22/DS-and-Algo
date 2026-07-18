package Algorithms.recursion.problems;


/*
* e(x, 4) = 1 + x/1! + x²/2! + x³/3! + x⁴/4!

e(x, 3) = 1 + x/1! + x²/2! + x³/3!

e(x, 2) = 1 + x/1! + x²/2!

e(x, 1) = 1 + x/1!

e(x, 0) = 1
*
* P = P × x
  F = F × n
  P = x^n(power)
    F = n! (factorial)
Initially,

P = 1
F = 1

*
*
* */
public class TaylorSeries {


    static int P = 1;
    static int F = 1;

    static int e(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int r = e(x, n - 1);

        P = P * x;
        F = F * n;

        return r + P / F;
    }

    public static void main(String[] args) {
        System.out.println(e(2, 10));
    }
}

