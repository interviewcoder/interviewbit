/**
 *************************************************************************
 * Description: 
 * 
 * You are given 3 arrays A, B and C. All 3 of the arrays are sorted. 
 * Find i, j, k such that : 
 * max(abs(A[i] - B[j]), abs(B[j] - C[k]), abs(C[k] - A[i])) is minimized. 
 * Return the minimum max(abs(A[i] - B[j]), abs(B[j] - C[k]), abs(C[k] - A[i])) 
 *
 *************************************************************************
 * @date : Jul 27, 2015
 * {@link http://www.interviewbit.com/courses/programming/topics/two-pointers/problems/array3ptr/ }
 */
package _05_Array3Ptr;

import java.util.List;

/** see test {@link _05_Array3Ptr.SolutionTest } */
public class Solution {
    // DO NOT MODIFY THE LISTS
    public int minimize(final List<Integer> a, final List<Integer> b, final List<Integer> c) {
        int i = 0;
        int j = 0;
        int k = 0;
        int lenA = a.size();
        int lenB = b.size();
        int lenC = c.size();
        int result = Integer.MAX_VALUE;
        while (i < lenA && j < lenB && k < lenC) {
            int max = Math.max(Math.max(a.get(i), b.get(j)), c.get(k));
            int min = Math.min(Math.min(a.get(i), b.get(j)), c.get(k));
            result = Math.min(result, max - min);
            if (result == 0) {
                // since 0 is minimal number in theory
                break;
            }
            //     1:  4(i) - 5   // only move i to i++ we can shrink the gap
            //     2:  6(j) - 8
            //     3:  8(k) - 10
            // now only if we move the pointer at the list that has min value
            // we might shrink the gap.
            // jump all duplicated
            while(i < lenA && a.get(i) == min) {
                i++;
            }
            while (j < lenB && b.get(j) == min) {
                j++;
            }
            while (k < lenC && c.get(k) == min) {
                k++;
            }
        }
        return result;
    }
}

