/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 12, 2015
 */
package _01_SimplyPath;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Solution {
    
    @SuppressWarnings("serial")
    private Set<String> skipSet = new HashSet<String>(){{
        add("/");
        add(".");
        add("");
    }};

    public String simplifyPath(String A) {
        String[] strs = A.split("/");
        Stack<String> path = new Stack<>();
        // simply path
        for (String string : strs) {
            if (!skipSet.contains(string)) {
                if (!string.equals("..")) {
                    path.push(string);
                } else if (string.equals("..") && !path.isEmpty()) {
                    // go back to parent directory
                    path.pop();
                }
            }
        }
        // construct path
        return "/" + String.join("/", path);
    }
}

