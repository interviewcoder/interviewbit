/**
 *************************************************************************
 * Description: 
 * 
 * Given an unsorted integer array, find the first missing positive integer. 
 * 
 * Example: 
 * Given [1,2,0] return 3, 
 * [3,4,-1,1] return 2, 
 * [-8, -7, -6] returns 1 
 * 
 * Your algorithm should run in O(n) time and use constant space.
 *
 *************************************************************************
 * Time: O(N) ; Space: O(1)
 * @date : Jul 6, 2015
 */
package _13_Positive;

import java.util.ArrayList;

public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {
        int len = A.size();
        for (int i = 0; i < len; i++) {
            // swap until A[i] == i + 1 or we met non-positive number
            while (A.get(i) != (i + 1) || A.get(i) <= 0) {
                // swap A[i] with A[A[i] - 1]
                int num = A.get(i);
                int targetIndex = num - 1;
                // watch here ! test index within boundary first
                if ((targetIndex < 0 || targetIndex >= len) || num == A.get(num - 1)) {
                    // duplicated number
                    break;
                }
                // swap
                A.set(i, A.get(num - 1));
                A.set(num - 1, num);
            }
        }
        // find the missing integer
        for (int i = 0; i < len ; i++) {
            if (A.get(i) != i + 1) {
                // found missing
                return i + 1;
            }
        }
        // no missing number
        return len + 1;
    }
}

