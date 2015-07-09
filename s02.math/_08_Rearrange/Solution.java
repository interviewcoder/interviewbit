/**
 *************************************************************************
 * Description: 
 * 
 * Rearrange a given array so that Arr[i] becomes Arr[Arr[i]] with O(1) extra space. 
 * 
 * Example: array = {1, 0} after rearrange array = {0, 1} 
 * 
 * Lets say N = size of the array. Then, following holds true : 
 * All elements in the array are in the range [0, N-1] 
 * N * N does not overflow for a signed integer
 *
 *************************************************************************
 * @date : Jul 8, 2015
 */
package _08_Rearrange;

import java.util.ArrayList;

/** see test {@link _08_Rearrange.SolutionTest } */
public class Solution {
    /**
     * Store two numbers in one index using tricks. 
     * A = B + C * N;  <=>  B = A % N, C = A / N;
     */
    public void arrange(ArrayList<Integer> A) {
        int N = A.size();
        for (int i = 0; i < N; i++) {
            int num = A.get(i);
            int B = num;
            int C = A.get(num);
            if (C >= N) {
                C = A.get(num) % N;
            }
            int encode = B + C * N;
            A.set(i, encode);
        }
        for (int i = 0; i < N; i++) {
            A.set(i, A.get(i) / N);
        }
    }
}
