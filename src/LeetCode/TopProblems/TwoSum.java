package LeetCode.TopProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> ans = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            ans.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(ans.containsKey(complement) && ans.get(complement)!=i){
                return new int[]{i,ans.get(complement)};
            }
        }
        return new int[]{-1,-1};
    }

//    public int[] twoSum(int[] nums, int target) {
//        int[] nums = {3, 3};
//        int target = 6;
//
//        int[] res = {-1, -1};
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    res[0] = i;
//                    res[1] = j;
//                    break;
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(res));
//    }
}
