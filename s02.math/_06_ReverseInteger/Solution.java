/**
 *************************************************************************
 * Description: 
 * 
 * Reverse digits of an integer. 
 * 
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321 
 * 
 * Return 0 if the result overflows and does not fit in a 32 bit signed integer
 *
 *************************************************************************
 * @date : Jul 8, 2015
 * @see  : Leetcode[007]
 * 1. how to deal with Stack Overflow
 */
package _06_ReverseInteger;

/** see test {@link _06_ReverseInteger.SolutionTest } */
public class Solution {
    public int reverse(int A) {
        // use long to monitor Stack Overflow
        long result = 0;
        while (A != 0) {
            result = result * 10 + (A % 10);
            A = A / 10;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) result;
        }
    }
}
