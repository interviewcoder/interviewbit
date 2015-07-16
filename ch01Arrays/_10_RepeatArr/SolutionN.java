/**
 *************************************************************************
 * Description: 
 * 
 * Given a read only set of n + 1 integers between 1 and n, find one number 
 * that repeats in linear time using less than O(n) space and traversing 
 * the stream sequentially O(1) times. 
 * 
 * Sample Input :  [3 4 1 4 1] 
 * Sample Output: 1 
 * 
 * If there are multiple possible answers ( like in the sample case above ), 
 * output any one.
 *
 *************************************************************************
 * Time: O(N) ; Space: O(N)
 * @date : Jul 6, 2015
 */
package _10_RepeatArr;

import java.util.ArrayList;
import java.util.List;

/** see test {@link _10_RepeatArr.SolutionTest } */
public class SolutionN {
    // DO NOT MODIFY THE LIST
    public int repeatedNumber(final List<Integer> A) {
        List<Integer> B = new ArrayList<>(A);
        int len = B.size();
        for (int i = 0; i < len; i++) {
            // swap until (i + 1) is at position i
            while (B.get(i) != (i + 1)) {
                int num = B.get(i);
                int target = B.get(num - 1);
                if (num == target) {
                    // duplicated found!
                    return num;
                }
                // swap A[i] with A[A[i] - 1]
                B.set(i, target);
                B.set(num - 1, num);
            }
        }
        return 0;
    }
}

