package Algorithms.recursion;

/*

if a recursive function calling itself and that recursive call is the last statement in a function then it is
called as tail recursion. After that call there is nothing happend the function statement is closed, no operation can be happend
or the function not perform any operation on that return situation also

*/

public class TailRecursion {
    static void function(int n){
        if(n>0){
            System.out.println(n);
            function(n-1);
        }
    }


    public static void main(String[] args) {
        int n = 5;
        function(n);

    }
}
