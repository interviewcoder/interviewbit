/**
 *************************************************************************
 * Description: 
 *  
 * Implement the next permutation, which rearranges numbers into the 
 * numerically next greater permutation of numbers. 
 * 
 * If such arrangement is not possible, it must be rearranged as the 
 * lowest possible order ie, sorted in an ascending order. 
 * 
 * The replacement must be in-place, do not allocate extra memory. 
 * 
 * Examples: 
 *  1,2,3 → 1,3,2 
 *  3,2,1 → 1,2,3 
 *  1,1,5 → 1,5,1 
 *  20, 50, 113 → 20, 113, 50 
 *  
 * Inputs are in the left-hand column and its corresponding 
 * outputs are in the right-hand column.
 *
 *************************************************************************
 * Leetcode[038]
 * @date : Jul 10, 2015
 */
package _07_CountAndSay;

public class Solution {
    public String countAndSay(int A) {
        if (A < 1) {
            return "";
        }
        StringBuilder str = new StringBuilder("1");
        for (int index = 1; index < A; index++) {
            StringBuilder say = new StringBuilder();
            // count and say
            int i = 0;
            int len = str.length();
            while (i < len) {
                int count = 1;
                // count the number of the same number
                while (i < len - 1 && str.charAt(i) == str.charAt(i + 1)) {
                    count++;
                    i++;
                }
                say.append(count + "" + str.charAt(i));
                i++;
            }
            str = say;
        }
        return str.toString();
    }
}

