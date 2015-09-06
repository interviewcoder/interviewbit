/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 8, 2015
 */
package _05_PalindromeNumber;

public class Solution {
    public int isPalindrome(int A) {
        if (A < 0) {
            // negative number is not palindromic
            return 0;
        }
        int number = 0;
        int B = A;
        while (B != 0) {
            //TODO: check Stack Overflow
            number = number * 10 + B % 10;
            B = B / 10;
        }
        return number == A ? 1 : 0;
    }
}
