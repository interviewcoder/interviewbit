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

