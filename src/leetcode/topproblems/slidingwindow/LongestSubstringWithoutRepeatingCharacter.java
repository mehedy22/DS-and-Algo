package leetcode.topproblems.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {
    public int lengthOfLongestSubstring(String s) {

        int maxLen = 0;

        // Try every possible starting index
        for (int i = 0; i < s.length(); i++) {

            Set<Character> seen = new HashSet<>();

            // Extend the substring one character at a time
            for (int j = i; j < s.length(); j++) {

                char c = s.charAt(j);

                // Duplicate found
                if (seen.contains(c)) {
                    break; // Stop checking this substring
                }

                // Store current character
                seen.add(c);

                // Update answer
                maxLen = Math.max(maxLen, j - i + 1);
            }
        }

        return maxLen;
    }

    public int lengthOfLongestSubstringOpt(String s) {

        // Stores the unique characters currently inside the sliding window.
        Set<Character> window = new HashSet<>();

        // Left pointer of the window.
        int l = 0;

        // Stores the maximum length of a valid substring found so far.
        int maxLen = 0;

        // Right pointer expands the window one character at a time.
        for (int r = 0; r < s.length(); r++) {

            // Current character that we're trying to include.
            char c = s.charAt(r);

            // If the current character already exists in the window,
            // the window is no longer valid (duplicate found).
            // So shrink the window from the left until the duplicate is removed.
            while (window.contains(c)) {

                // Remove the leftmost character from the window.
                window.remove(s.charAt(l));

                // Move the left pointer forward.
                l++;
            }

            // At this point, the duplicate has been removed (if there was one),
            // so it's safe to add the current character.
            window.add(c);

            // Window size = right pointer - left pointer + 1
            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }


}
