/**
 *************************************************************************
 * Description: 
 * 
 * Given 2 non negative integers m and n, find gcd(m, n) 
 * GCD of 2 integers m and n is defined as the greatest 
 * integer g such that g is a divisor of both m and n. 
 * 
 * Example 
 * m : 6 
 * n : 9 
 * GCD(m, n) : 3 
 *
 *************************************************************************
 * @date : Jul 8, 2015
 */
package _07_GCD;

/** see test {@link _07_GCD.SolutionTest } */
public class Solution {
    public int gcd(int A, int B) {
        if (A < B) {
            return gcd(B, A);
        } else if (B == 0) {
            // corner case
            return A; 
        } else {
            return gcd(A % B, B);
        }
    }
}
