/**
 *************************************************************************
 * Description: 
 * 
 * Given a string, find the length of the longest substring without repeating 
 * characters. For example, the longest substring without repeating letters 
 * for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest 
 * substring is "b", with the length of 1.
 *
 *************************************************************************
 * [Leetcode][003]
 * @date : Jul 14, 2015
 * {@link http://www.interviewbit.com/courses/programming/topics/hashing/problems/repeatstr/ }
 */
package _03_LongestNonrepeatedString;

import java.util.HashMap;
import java.util.Map;

/** see test {@link _03_LongestNonrepeatedString.SolutionTest } */
public class Solution {
    public int lengthOfLongestSubstring(String a) {
        // character and its latest position appeared in string
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;
        int start = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (map.containsKey(ch) && map.get(ch) >= start) {
                // if this character has appearred in current window
                start = map.get(ch) + 1;
            } else {
                result = Math.max(result, i - start + 1);
            }
            map.put(ch, i);
        }
        return result;
    }
}

