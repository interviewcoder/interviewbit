/**
 *************************************************************************
 * Description: 
 * 
 * Given an array ‘A’ of sorted integers and another non negative integer 
 * k, find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j. 
 * 
 * Example: 
 * Input : A : [1 3 5] k : 4
 * Output : YES 
 * as 5 - 1 = 4 
 * 
 * Return 0 / 1 ( 0 for false, 1 for true ) for this problem
 *
 *************************************************************************
 * @date : Jul 26, 2015
 */
package _04_DiffK;

import java.util.ArrayList;

/** see test {@link _04_DiffK.SolutionTest } */
public class Solution {

    public int diffPossible(ArrayList<Integer> a, int b) {
        if (a.size() < 2) {
            return 0;
        }
        int len = a.size();
        int i = 0;
        int j = 1;
        while (j < len) {
            if (a.get(j) - a.get(i) == b) {
                // found!
                return 1;
            } else if (a.get(j) - a.get(i) > b) {
                // try to move left pointer to shrink difference
                while (i + 1 < j && a.get(j) - a.get(i) > b) {
                    i++;
                    if (a.get(j) - a.get(i) == b) {
                        return 1;
                    }
                }
                j++;
            } else {
                j++;
            }
        }
        return 0;
    }
}
