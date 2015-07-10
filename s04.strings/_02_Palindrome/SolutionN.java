/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 9, 2015
 */
package _02_Palindrome;

public class SolutionN {
    public int isPalindrome(String A) {
        // clean up string
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : A.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                stringBuilder.append(Character.toLowerCase(ch));
            }
        }
        int len = stringBuilder.length();

        // corner case for empty string
        if (len == 0) {
            return 1;
        }
        int upper = (stringBuilder.length() - 1) / 2;
        for (int i = 0; i <= upper; i++) {
            if (stringBuilder.charAt(i) != stringBuilder.charAt(len - 1 - i)) {
                // compare head with tail
                return 0;
            }
        }
        return 1;
    }
}
