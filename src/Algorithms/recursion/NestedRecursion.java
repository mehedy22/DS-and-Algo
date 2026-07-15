package Algorithms.recursion;
/*
* in a nested recursion a recursive function will pass parameter as a recursive call.
*/
public class NestedRecursion {

    static int fun(int n) {
        if (n > 100) {
            return n - 10;
        }
        return fun(fun(n + 11));
    }

    public static void main(String[] args) {
        int r = fun(95);
        System.out.println(r);
    }

}
