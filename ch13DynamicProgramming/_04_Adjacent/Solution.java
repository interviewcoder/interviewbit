/**
 *************************************************************************
 * Description: 
 * 
 * Given a 2 * N Grid of numbers, choose numbers such that the sum of the 
 * numbers is maximum and no two chosen numbers are adjacent horizontally, 
 * vertically or diagonally, and return it. 
 * Example: 
 * Grid:
 *  1 2 3 4
 *   2 3 4 5
 * so we will choose 3 and 5 so sum will be 3 + 5 = 8 
 * 
 * Note that you can choose more than 2 numbers
 *
 *************************************************************************
 * @date : Aug 3, 2015
 * {@link http://www.interviewbit.com/courses/programming/topics/dynamic-programming/problems/adjacent/ }
 */
package _04_Adjacent;

import java.util.ArrayList;

/** see test {@link _04_Adjacent.SolutionTest } */
public class Solution {

    public int adjacent(ArrayList<ArrayList<Integer>> a) {
        if (a.size() == 0 || a.get(0).size() == 0) {
            return 0;
        }
        // initialize
        int cols = a.get(0).size();
        int offset = 3;
        int[] dp = new int[cols + offset];
        int result = 0;

        // dp 
        for (int i = 0; i < cols; i++) {
            int max = Math.max(a.get(0).get(i), a.get(1).get(i));
            int count = max + Math.max(dp[i], dp[i + 1]);
            dp[i + offset] = count;
            result = Math.max(count, result);
        }
        return result;
    }

}

