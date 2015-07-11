/**
 *************************************************************************
 * Description: 
 * 
 * Given an input string, reverse the string word by word. 
 * For example, 
 *  Given s = "the sky is blue", 
 *  return "blue is sky the".
 * 
 *************************************************************************
 * @date : Jul 9, 2015
 */
package _03_ReverseSentence;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public String reverseWords(String A) {
        List<String> words = new ArrayList<>();
        String[] strs = A.split(" ");
        for (String str : strs) {
            if (!str.isEmpty()) {
                // insert new word at the beginning of list
                words.add(0, str);
            }
        }
        return String.join(" ", words);
    }
    
}

