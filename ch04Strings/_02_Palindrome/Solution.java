/**
 *************************************************************************
 *  Given a string, determine if it is a palindrome, considering only 
 *  alphanumeric characters and ignoring cases. 
 *  
 *  For example, 
 *  "A man, a plan, a canal: Panama" is a palindrome. 
 *  "race a car" is not a palindrome.
 *************************************************************************
 * [Leetcode] 125
 * @date : Jul 9, 2015
 */
package _02_Palindrome;

/** see test {@link _02_Palindrome.SolutionTest } */
public class Solution {
    /**
     * judge while cleaning string 
     */
    public int isPalindrome(String A) {
        int len = A.length();
        int i = 0;
        int j = len - 1;
        while (i < j) {
            // find the right character to compare
            while (i < j && !Character.isLetterOrDigit(A.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(A.charAt(j))) {
                j--;
            }
            if (Character.toLowerCase(A.charAt(i)) != Character.toLowerCase(A.charAt(j))) {
                return 0;
            }
            i++;
            j--;
        }
        return 1;
    }
}
