package Algorithms.recursion;

/*
The recursive function will execute first then it is called Head Recursion.
No other statement will execute before the recursion call
*/
public class HeadRecursion {

    static void function(int n) {
        if (n > 0) {
            function(n - 1);
            System.out.println(n);

        }
    }

    public static void main(String[] args) {
        int n = 5;
        function(n);

    }
}
