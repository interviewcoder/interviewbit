/**
 *************************************************************************
 * Description: 
 * 
 * Given a matrix of m x n elements (m rows, n columns), return all 
 * elements of the matrix in spiral order. 
 * 
 * For example, 
 * Given the following matrix: 
 * [ 
 *  [ 1, 2, 3 ], 
 *  [ 4, 5, 6 ], 
 *  [ 7, 8, 9 ] 
 * ] 
 * 
 * You should return [1,2,3,6,9,8,7,4,5].
 *
 *************************************************************************
 * @date : July 4, 2014
 * see also Leetcode[054] {@link https://leetcode.com/problems/spiral-matrix/ }
 */
package _02_SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    // DO NOT MODIFY THE LIST
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
         ArrayList<Integer> result = new ArrayList<Integer>();
         // Populate result;
         if (A.size() == 0 || A.get(0).size() == 0) {
             return result;
         }
         int rows = A.size();
         int cols = A.get(0).size();
         
         int mid = (rows - 1) / 2;
         for (int i = 0; i <= mid; i++) {
             int endCol = cols - i - 1;
             int endRow = rows - i - 1;
             // print the first row
             for (int col = i; col <= endCol ; col++) {
                 result.add(A.get(i).get(col));
             }
             // print the right most column if exists
             if (endCol >= i) {
                 for (int row = i + 1; row <= endRow; row++) {
                     result.add(A.get(row).get(endCol));
                 }
             }
             // print the bottom row
             if (endRow > i) {
                 for (int col = endCol - 1; col >= i; col--) {
                     result.add(A.get(endRow).get(col));
                 }
             }
             // print the leftmost column
             if(endCol > i && endRow > i + 1) {
                 for (int row = endRow - 1; row > i; row--) {
                     result.add(A.get(row).get(i));
                 }
             }
         }
         return result;
    }
}

