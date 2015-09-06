/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 9, 2015
 */
package _01_CountElements;

import java.util.List;

public class Solution {
    // DO NOT MODIFY THE LIST
    public int findCount(final List<Integer> A, int B) {
        int len = A.size();
        if (len < 1) {
            return 0;
        }
        int left = 0;
        int right = len - 1;
        int result = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            int midNum = A.get(mid);
            if (midNum == B) {
                // found one target number
                result++;
                // go towards to find all target number
                int index = mid - 1;
                while (index >= left && A.get(index) == B) {
                    result++;
                    index--;
                }
                index = mid + 1;
                // go towards right to find target number
                while (index <= right && A.get(index) == B) {
                    result++;
                    index++;
                }
                return result;
            } else if (midNum < B) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

}
