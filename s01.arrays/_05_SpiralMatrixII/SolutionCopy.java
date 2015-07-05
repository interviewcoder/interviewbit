package _05_SpiralMatrixII;

import java.util.ArrayList;

public class SolutionCopy {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (A <= 0) {
            return result;
        }
        // initialize matrix;
        int[][] matrix = new int[A][A];
        int num = 1;
        // update matrix
        int mid = (A - 1) / 2;
        for (int i = 0; i <= mid;  i++) {
            int n = A - i - 1;
            System.out.println(n);
            int row = i;
            int col = i;
            // first row
            for (int j = 0; j < n; j++) {
                matrix[row][col++] = num++;
            }
            if (col > i && col < A && num < A*A) {
                for (int j = 0; j < n; j++) {
                    matrix[row++][col] = num++;
                }
            }
            if (row > i && row < A && num < A*A) {
                for (int j = 0; j < n; j++) {
                    matrix[row][col--] = num++;
                }
            }
            if (row > i && col < A && num <= A*A) {
                for (int j = 0; j < n; j++) {
                    matrix[row--][col] = num++;
                }
            }
        }
        // fill in the result
        for (int i = 0; i < A; i++) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < A; j++) {
                list.add(matrix[i][j]);
            }
            result.add(list);
        }
        return result;
    }
}

