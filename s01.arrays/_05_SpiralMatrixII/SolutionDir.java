package _05_SpiralMatrixII;

import java.util.ArrayList;

/** see test {@link _05_SpiralMatrixII.SolutionDirTest } */
public class SolutionDir {

    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (A <= 0) {
            return result;
        }
        // initialize matrix;
        int[][] matrix = new int[A][A];

        // update matrix
        int i = 0;
        int j = 0;
        int k = 1;
        int end = A * A;
        int dir = 0;
        while (k <= end) {
            matrix[i][j] = k++;
            if (dir == 0) {
                j++; // move towards right
                if (j == A || matrix[i][j] != 0) {
                    dir = 1;
                    j--;
                    i++;
                }
            } else if (dir == 1) {
                i++; // move towards bottom
                if (i == A || matrix[i][j] != 0) {
                    dir = 2;
                    i--;
                    j--;
                }
            } else if (dir == 2) {
                j--; // move towards left
                if (j == -1 || matrix[i][j] != 0) {
                    dir = 3;
                    j++;
                    i--;
                }
            } else {
                i--; // move upwards
                if (i == -1 || matrix[i][j] != 0) {
                    dir = 0;
                    i++;
                    j++;
                }
            }
        }

        // fill in the result
        for (int p = 0; p < A; p++) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int q = 0; q < A; q++) {
                list.add(matrix[p][q]);
            }
            result.add(list);
        }

        return result;
    }
}
