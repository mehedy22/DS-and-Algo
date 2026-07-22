package leetcode.topproblems.twopointers;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        int result = 0;
        int i = 0;
        int j = height.length - 1;

        while (i < j) {
            int length = Math.min(height[i], height[j]);
            int width = j - i;
            result = Math.max(result, length * width);

            if (height[i] <= height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return result;
    }
}
