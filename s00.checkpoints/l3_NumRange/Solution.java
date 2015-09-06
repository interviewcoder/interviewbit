/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 11, 2015
 */
package l3_NumRange;

import java.util.ArrayList;

/** see test {@link l3_NumRange.SolutionTest } */
public class Solution {
    public int numRange(ArrayList<Integer> A, int B, int C) {
        int start = -1;
        int end = -1;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) > C) {
                // no way to include this number in any sub array
                continue;
            }
            if (end != -1 && end > start) {
                if (sum >= B && sum <= C) {
                    System.out.println("sum: " + sum);
                    System.out.println("there");
                    count++;
                    start = end + 1;
                }
            } else {
                start = i;
            }
            int j = start;
            for (j = start; j < A.size(); j++) {
                if (sum + A.get(j) > C) {
                    end = j - 1;
                    break;
                }
                sum += A.get(j);
                if (sum >= B) {
                    System.out.println("i: " + j);
                    count++;
                }
            }
            end = j - 1;
            if (sum < C) {
                break;
            }
            sum -= A.get(i);
        }
        return count;
    }
}
