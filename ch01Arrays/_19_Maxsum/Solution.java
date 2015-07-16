/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 7, 2015
 */
package _19_Maxsum;

import java.util.List;

public class Solution {
    public int maxSubArray(final List<Integer> A) {
        int len = A.size();
        if (len == 0) {
            return 0;
        }
        int result = A.get(0);
        int contiguous = result;
        for (int i = 1; i < len; i++) {
            int number = A.get(i);
            if (contiguous < 0) {
                contiguous = number;
            } else {
                contiguous += number;
            }
            result = Math.max(result, contiguous);
        }
        return result;
    }
}
