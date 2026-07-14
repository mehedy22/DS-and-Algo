package Algorithms.recursion;


//if a recursive function calling itself more than once then it is called Tree Recursion

public class TreeRecursion {

    static void function(int n){
        if(n>0){
            System.out.println(n);
            function(n-1);
            function(n-1);
        }
    }

    public static void main(String[] args) {
        int n=3;
        function(n);
    }

}
