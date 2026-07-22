package leetcode.topproblems.arrayandhashing;

import java.util.*;

public class GroupAngrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ans=new HashMap<>();

        for(String word:strs)
        {
            char[] words=word.toCharArray();
            Arrays.sort(words);
            String sorted=new String(words);

            if(!ans.containsKey(sorted))
            {
                ans.put(sorted,new ArrayList<>());

            }
            ans.get(sorted).add(word);


        }
        return new ArrayList<>(ans.values());
    }
}
