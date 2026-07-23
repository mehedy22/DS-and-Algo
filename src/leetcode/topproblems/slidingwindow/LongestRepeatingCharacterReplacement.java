package leetcode.topproblems.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {

    public int characterReplacement(String s, int k) {

        // Left pointer
        int l = 0;

        // Right pointer
        int r = 0;

        // Longest valid window
        int maxLen = 0;

        // Highest frequency of any character in the current window
        int maxFreq = 0;

        // Stores frequency of characters inside the current window
        Map<Character, Integer> freq = new HashMap<>();

        while (r < s.length()) {

            // Include current character
            char c = s.charAt(r);

            freq.put(c, freq.getOrDefault(c, 0) + 1);

            // Update highest frequency seen in the current window
            maxFreq = Math.max(maxFreq, freq.get(c));

            // If more than k replacements are required,
            // shrink the window.
            while ((r - l + 1) - maxFreq > k) {

                char left = s.charAt(l);

                // Remove left character from window
                freq.put(left, freq.get(left) - 1);

                // Move left pointer
                l++;
            }

            // Update answer
            maxLen = Math.max(maxLen, r - l + 1);

            // Expand window
            r++;
        }

        return maxLen;
    }
}

