/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 6, 2015
 */
package _11_MaxDist;

import java.util.List;

public class SolutionN2 {

    // DO NOT MODIFY THE LIST
    public int maximumGap(final List<Integer> A) {
        int len = A.size();
        if (len == 0) {
            return -1;
        }
        int result = -1;
        for (int i = 0; i < len; i++) {
            for (int j = len - 1; j >= i; j--) {
                if (A.get(i) <= A.get(j)) {
                    result = Math.max(result, j - i);
                }
             }
        }
        return result;
    }

}
