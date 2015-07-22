/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 10, 2015
 */
package _10_Power;

public class Solution {
    public int power(String A) {
        String multi = "1";
        while (multi.length() < A.length()
                || (multi.length() == A.length() && multi.charAt(0) <= A.charAt(0))) {
            // multiply by 2
            String m = multiplyBy2(multi);
            if (m.equals(A)) {
                return 1;
            }
            multi = m;
        }
        return 0;
    }

    private String multiplyBy2(String multi) {
        StringBuilder result = new StringBuilder();
        int i = multi.length() - 1;
        int carry = 0;
        while (i >= 0 || carry > 0) {
            int lastDigit = i >= 0 ? Integer.parseInt("" + multi.charAt(i)) : 0;
            int num = lastDigit * 2 + carry;
            result.insert(0, num % 10);
            carry = num / 10;
            i--;
        }
        return result.toString();
    }

}
