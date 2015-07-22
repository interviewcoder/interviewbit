/**
 *************************************************************************
 * Description: 
 * 
 * Given two binary strings, return their sum (also a binary string). 
 * 
 * Example: 
 *  a = "100" 
 *  b = "11" 
 * Return a + b = “111”. 
 *
 *************************************************************************
 * @date : Jul 10, 2015
 */
package _08_AddBinary;

/** see test {@link _08_AddBinary.SolutionTest } */
public class Solution {
    
    public String addBinary(String A, String B) {
        StringBuilder str = new StringBuilder();
        int i = A.length() - 1;
        int j = B.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            // adding number from back
            int n1 = i >= 0 ? (A.charAt(i) - '0') : 0;
            int n2 = j >= 0 ? (B.charAt(j) - '0') : 0;
            int num = n1 + n2 + carry;
            str.insert(0, num % 2);
            carry = num / 2;
            i--;
            j--;
        }
        return str.toString();
    }
    
}

