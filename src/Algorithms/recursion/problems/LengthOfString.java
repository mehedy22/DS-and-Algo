package Algorithms.recursion.problems;

public class LengthOfString {
    static int stringLength(String s, int index) {
        if (index == s.length()) {
            return 0;
        }
        return 1 + stringLength(s, index + 1);
    }

    public static void main(String[] args) {
        String str = "bangladesh";
        System.out.println(stringLength(str, 0));
    }
}
