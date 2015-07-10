/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 8, 2015
 */
package _07_Rotate2DMatrix;

import java.util.ArrayList;

public class Solution {
    public void rotate(ArrayList<ArrayList<Integer>> A) {

        // To get this we need to find Transpose of matrix then reverse each
        // list

        int n = A.size();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = A.get(i).get(j);
                A.get(i).set(j, A.get(j).get(i));
                // A[i][j]=A[j][i];
                A.get(j).set(i, temp);
                // A[j][i]=temp;
            }
        }
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = A.get(j).get(i);
                A.get(j).set(i, A.get(j).get(n - i - 1));
                // A[j][i] = A[j][n - i - 1];
                A.get(j).set(n - i - 1, tmp);
                // A[j][n - i - 1] = tmp;
            }
        }
    }
}
