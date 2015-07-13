/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 12, 2015
 * Leetcode 020
 */
package _00_ValidParenthesis;

import java.util.Map;
import java.util.HashMap;
import java.util.Stack;

public class Solution {
    
    @SuppressWarnings("serial")
    private Map<Character, Character> map = new HashMap<Character, Character>(){{
       put(')', '(');
       put(']', '[');
       put('}', '{');
    }};
    
    public int isValid(String A) {
        Stack<Character> stack = new Stack<>();
        for (char ch : A.toCharArray()) {
            if (map.containsKey(ch)) {
                // we met with ], }, )
                if (stack.isEmpty() || stack.pop() != map.get(ch)) {
                    // no right counterpart to cancel
                    return 0;
                }
            } else {
                // {, [, (
                stack.push(ch);
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
    
}


