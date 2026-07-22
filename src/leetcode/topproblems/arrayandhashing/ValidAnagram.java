package leetcode.topproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    // Option 1:
    // Sort two arrays and check whether they are equals or not
    public boolean isAnagram(String s, String t) {

        char[] f=s.toCharArray();
        char[] se=t.toCharArray();
        Arrays.sort(f);
        Arrays.sort(se);

        return Arrays.equals(f,se);
    }

    /* OPTION - II
    *
    * Approach: Use a HashMap to count the frequency of each character in the first string,
    *  and then decrement the count for each character in the second string. If all counts are zero,
    *  the strings are anagrams.
    */

    public boolean isAnagram(String s, String t) {

        Map<Character,Integer> count=new HashMap<>();
        for(char st:s.toCharArray()){
            count.put(st,count.getOrDefault(st,0)+1);
        }
        for(char tt:t.toCharArray()){
            count.put(tt,count.getOrDefault(tt,0)-1);
        }

        for(int value:count.values()){
            if(value!=0){
                return false;
            }
        }

        return true;

    }

}
