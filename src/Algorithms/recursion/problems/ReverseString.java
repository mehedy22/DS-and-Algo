package Algorithms.recursion.problems;

public class ReverseString {
    static void reverseString(char[] str, int s, int e) {
        if (s >= e) {
            return;
        }

        char temp = str[s];
        str[s] = str[e];
        str[e] = temp;

        reverseString(str, s + 1, e - 1);
    }

    public static void main(String[] args) {

        String str = "Bangladesh";
        char[] strArr = str.toCharArray();

        reverseString(strArr, 0, strArr.length - 1);

        System.out.println(strArr);
    }
}
