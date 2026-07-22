package leetcode;

/*
 * Here we have to do concatenation of array. So we take a result array with the double length of the current one.
 * in one loop we set the value of current and current + length of the array to the result array.
 *
 */


public class ConcatenationOfArray {

    public static int[] getConcatenation(int[] nums) {
        int d = nums.length;
        int[] result = new int[d * 2];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[i + d] = nums[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        int[] result = getConcatenation(nums);
        for (int j : result) {
            System.out.print(j + " ");
        }
    }
}
