package _05_SpiralMatrixII;

import java.util.ArrayList;

/** see test {@link _05_SpiralMatrixII.SolutionDirTest } */
public class Solution {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (A <= 0) {
            return res;
        }
        
        int[][] result = new int[A][A];
        int number = 1;
        for (int i = 0; i < (A + 1) / 2; i++) {
            int rowStart = i;
            int rowEnd = A - i - 1;
            int colStart = i;
            int colEnd = A - i - 1;
            // top row
            for (int col = colStart; col <= colEnd; col++) {              
                result[rowStart][col] = number++;
            }

            // right column
            for (int row = rowStart + 1; row <= rowEnd; row++) {
                result[row][colEnd] = number++;
            }

            // bottom row
            if (rowEnd > rowStart) {
                for (int col = colEnd - 1; col >= colStart; col--) {
                    result[rowEnd][col] = number++;
                }
            }

            // left column
            if (colStart < colEnd) {
                for (int row = rowEnd - 1; row >= rowStart + 1; row--) {
                    result[row][colStart] = number++;
                }
            }
        }
        // fill in the result
        for (int i = 0; i < A; i++) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < A; j++) {
                list.add(result[i][j]);
            }
            res.add(list);
        }
        return res;
    }
}

