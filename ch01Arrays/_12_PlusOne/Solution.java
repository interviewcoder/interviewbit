/**
 *************************************************************************
 * Description: 
 * 
 * Given a non-negative number represented as an array of digits, 
 * add 1 to the number ( increment the number represented by the digits ). 
 * 
 * The digits are stored such that the most significant digit is at the head of the list. 
 * 
 * Example: 
 * If the vector has [1, 2, 3] 
 * the returned vector should be [1, 2, 4] 
 * as 123 + 1 = 124.
 *
 *************************************************************************
 * @date : Jul 6, 2015
 */
package _12_PlusOne;

import java.util.ArrayList;

/** see test {@link _12_PlusOne.SolutionTest } */
public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        // the one to be plus
        int carry = 1;
        ArrayList<Integer> result = new ArrayList<>(A);
        int len = A.size();
        for (int i = len - 1; i >= 0; i--) {
            if (carry == 0) {
                // no need to check remaining digits
                break;
            }
            int digit = A.get(i);
            // plus 
            int num = digit + carry;
            if (num >= 10) {
                carry = num / 10;
                digit = num % 10;
            } else {
                carry = 0;
                digit = num;
            }
            result.set(i, digit);
        }
        // if 9 9 9
        if (carry != 0) {
            result.add(0, 1);
        }
        // removing leading zeros
        int index = 0;
        while (index < result.size() && result.get(index) == 0) {
            result.remove(index);
        }
        
        return result;
    }
}
