/**
 *******************************************************************************
 * Description: 
 * 
 * Given an integer n, return the number of trailing zeroes in n!. 
 * Note: Your solution should be in logarithmic time complexity.
 * 
 *******************************************************************************
 * @date : Jul 9, 2015
 * @see  : Leetcode[172]
 */
package _09_FactorialTrailingZeros;

/** see test {@link _09_FactorialTrailingZeros.SolutionTest } */
public class Solution {
    public int trailingZeroes(int A) {
        int result = 0;
        while (A != 0) {
            int count = A / 5;
            result += count;
            A = count;
        }
        return result;
    }
}

