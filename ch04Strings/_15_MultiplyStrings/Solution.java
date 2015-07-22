/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 11, 2015
 */
package _15_MultiplyStrings;

public class Solution {
    public String multiply(String A, String B) {
        int len1 = A.length();
        int len2 = B.length();
        int[] p = new int[len1 + len2];
        for (int i = len1 - 1; i >= 0; i--) {
            int n1 = A.charAt(i) - '0';
            for (int j = len2 - 1; j >= 0; j--) {
                int index = len1 + len2 - i - j - 2;
                int n2 = B.charAt(j) - '0';
                int num = n1 * n2 + p[index];
                p[index + 1] += num / 10;
                p[index] = num % 10;
            }
        }
        
        // collect result
        StringBuilder str = new StringBuilder();
        int i = len1 + len2 - 1;
        // skipping leading zeros
        while (i >= 0 && p[i] == 0) {
            i--;
        }
        while (i >= 0) {
            str.append(p[i--]);
        }
        return str.length() == 0 ? "0" : str.toString();
    }
}

