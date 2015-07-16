/**
 *************************************************************************
 * Description: 
 * 
 * Print concentric rectangular pattern in a 2d matrix. 
 * Let us show you some examples to clarify what we mean. 
 * 
 * Example 1: 
 * Input: A = 4. 
 * Output: 
 *  4 4 4 4 4 4 4 
 *  4 3 3 3 3 3 4 
 *  4 3 2 2 2 3 4 
 *  4 3 2 1 2 3 4 
 *  4 3 2 2 2 3 4 
 *  4 3 3 3 3 3 4 
 *  4 4 4 4 4 4 4 
 *  
 * Example 2: 
 * Input: A = 3. 
 * Output: 
 *  3 3 3 3 3 
 *  3 2 2 2 3 
 *  3 2 1 2 3 
 *  3 2 2 2 3 
 *  3 3 3 3 3 
 *  
 *  The outermost rectangle is formed by A, then the next outermost is 
 *  formed by A-1 and so on. 
 *  
 *  You will be given A as an argument to the function you need to 
 *  implement, and you need to return a 2D array.
 *
 *************************************************************************
 * @date : Jul 5, 2015
 */
package _00_PrettyPrint;

import java.util.ArrayList;

public class Solution {

    public ArrayList<ArrayList<Integer>> prettyPrint(int A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (A <= 0) {
            return result;
        }
        // initialize matrix
        int n = 2 * A - 1;
        int[][] matrix = new int[n][n];

        // update matrix
        int i = 0;
        int j = 0;
        int dir = 0;
        for (int num = A; num > 0; num--) {
            // watch the corner case when num = 1
            int size = num == 1 ? 1 
                    : (2 * num - 1) * (2 * num - 1) - (2 * num - 3) * (2 * num - 3);
            int count = 0;
            while (count < size) {
                // print number in a circle
                count++;
                matrix[i][j] = num;
                if (dir == 0) {
                    j++; // move to right
                    if (j == n || matrix[i][j] != 0) {
                        dir = 1;
                        j--;
                        i++;
                    }
                } else if (dir == 1) {
                    i++; // move downwards
                    if (i == n || matrix[i][j] != 0) {
                        dir = 2;
                        i--;
                        j--;
                    }
                } else if (dir == 2) {
                    j--; // move to left
                    if (j < 0 || matrix[i][j] != 0) {
                        dir = 3;
                        j++;
                        i--;
                    }
                } else {
                    i--; // move upwards
                    if (i < 0 || matrix[i][j] != 0) {
                        dir = 0;
                        i++;
                        j++;
                    }
                }
            }
        }

        // fill the result
        for (int p = 0; p < n; p++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int q = 0; q < n; q++) {
                list.add(matrix[p][q]);
            }
            result.add(list);
        }

        return result;
    }

}
