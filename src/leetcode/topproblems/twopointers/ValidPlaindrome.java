package leetcode.topproblems.twopointers;

public class ValidPlaindrome {

    class Solution {
        public boolean isPalindrome(String s) {

            StringBuilder ans = new StringBuilder();
            String str = s.toLowerCase();
            char[] ch = str.toCharArray();
            for (int i = 0; i < ch.length; i++) {

                if (ch[i] >= 'a' && ch[i] <= 'z' || ch[i] >= '0' && ch[i] <= '9') {
                    ans.append(ch[i]);
                }


            }
            if (ans.toString().equals(ans.reverse().toString())) {
                return true;
            }
            return false;
        }
    }
}
