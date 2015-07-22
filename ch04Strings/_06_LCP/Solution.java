/**
 *******************************************************************************
 * Description: 
 * 
 * Write a function to find the longest common prefix string amongst an array of strings.
 * 
 *******************************************************************************
 * Leetcode [014]
 * @date : Jul 10, 2015
 */
package _06_LCP;

import java.util.ArrayList;

public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) {
        if (A.size() == 0) {
            return "";
        }
        StringBuilder str = new StringBuilder();
        int shortest = Integer.MAX_VALUE;
        // find the shortest string in list
        for (String s : A) {
            shortest = Math.min(shortest, s.length());
        }
        // check character from each string
        for (int i = 0; i < shortest; i++) {
            char ch = A.get(0).charAt(i);
            for (String s : A) {
                if (s.charAt(i) != ch) {
                    return str.toString();
                }
            }
            str.append(ch);
        }
        return str.toString();
    }
}

