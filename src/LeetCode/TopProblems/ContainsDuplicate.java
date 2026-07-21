package LeetCode.TopProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class ContainsDuplicate {
    // Option 1.
/*

Count the frequency of each number in the array using a HashMap.
If any number has a frequency greater than 1, return true. Otherwise, return false.

*/
    public boolean containsDuplicate(int[] nums) {

        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > 1) {
                return true;
            }
        }
        return false;
    }

    /*
     * Implement Using HashSet if the element is already present is in array then it returns true immediately
     * Either it put element in the set which keep element unique by default
     *
     */

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }

}

