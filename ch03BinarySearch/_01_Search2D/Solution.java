/**
 *************************************************************************
 * Description: 
 * 
 * Write an efficient algorithm that searches for a value in an m x n matrix. 
 * This matrix has the following properties: 
 * 
 * Integers in each row are sorted from left to right. 
 * The first integer of each row is greater than the last integer of the 
 * previous row.
 * 
 * For example, 
 * Consider the following matrix: 
 * [ 
 *  [1,   3,  5,  7], 
 *  [10, 11, 16, 20], 
 *  [23, 30, 34, 50] 
 * ]
 * Given target = 3, return true.
 *
 *************************************************************************
 * [Leetcode][074]
 * @date : Jul 22, 2015
 * {@link http://www.interviewbit.com/courses/programming/topics/binary-search/problems/search2d/ }
 */
package _01_Search2D;

import java.util.ArrayList;

public class Solution {

    public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
        if (a.size() == 0 || a.get(0).size() == 0) {
            return 0;
        }
        int rows = a.size();
        int cols = a.get(0).size();
        int left = 0;
        int right = rows * cols - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            int i = mid / cols;
            int j = mid % cols;
            int midVal = a.get(i).get(j);
            if (midVal == b) {
                // found!
                return 1;
            } else if (midVal < b) {
                // go to right part to search
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return 0;
        
    }

}

