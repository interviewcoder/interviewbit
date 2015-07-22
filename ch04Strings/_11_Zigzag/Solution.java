/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 10, 2015
 */
package _11_Zigzag;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private int[] indices;

    public String convert(String A, int B) {
        if (B <= 0) {
            return "";
        } else if (B == 1) {
            return A;
        }
        // construct indices
        constructIndices(B);

        // zigzag converting
        int index = 0;
        List<StringBuilder> strs = new ArrayList<>();
        for (int i = 0; i < B; i++) {
            strs.add(new StringBuilder());
        }
        for (int i = 0; i < A.length(); i++) {
            if (index == indices.length) {
                index = 0;
            }
            int j = indices[index];
            strs.get(j).append(A.charAt(i));
            index++;
        }

        // construct result
        StringBuilder str = new StringBuilder();
        for (StringBuilder s : strs) {
            str.append(s);
        }
        return str.toString();
    }

    private void constructIndices(int B) {
        indices = new int[B + B - 2];
        int index = 0;
        for (int i = 0; i < B; i++) {
            indices[index++] = i;
        }
        for (int i = 0; i < B - 2; i++) {
            indices[index++] = B - 2 - i;
        }
    }
}
