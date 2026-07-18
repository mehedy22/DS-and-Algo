package Algorithms.recursion.problems;

public class FirstUppercaseOfString {

    static char firstUppercase(String str, int index) {
        if (index == str.length()) {
            return '\0';
        }
        if (str.charAt(index) >= 'A' && str.charAt(index) <= 'Z') {
            return str.charAt(index);
        }
        return firstUppercase(str, index + 1);
    }

    public static void main(String[] args) {

        String str = "geeKs";
        char firstUppercase = firstUppercase(str, 0);
        if (firstUppercase == '\0') {
            System.out.println("No uppercase letter found.");
        } else {
            System.out.printf("First uppercase of %s is: %c%n", str, firstUppercase);
        }

    }
}
