/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 12, 2015
 */
package _04_TrapRainWater;

import java.util.List;
import java.util.Stack;

public class Solution {
    // DO NOT MODIFY THE LIST
    public int trap(final List<Integer> A) {
        if (A.size() == 0) {
            return 0;
        }
        int low = -1;
        int len = A.size();
        int left = 0;
        int right = len - 1;
        while (left < len - 1 && A.get(left) < A.get(left + 1)) {
            left++;
        }
        while (right > left && A.get(right) < A.get(right - 1)) {
            right--;
        }
        Stack<Integer> hurdles = new Stack<>();
        int i = left;
        int result = 0;
        while (i <= right) {
            int num = A.get(i);
            if (low == -1) {
                low = num;
            } else {
                // push into stack until we find a higher wall
                while (i < right && A.get(i) < low) {
                    hurdles.push(A.get(i));
                    i++;
                }
                // calculate the water we trapped
                // choose the lowest wall
                low = Math.min(low, A.get(i));
                int expected = hurdles.size() * low;
                while (!hurdles.isEmpty()) {
                    int hurdle = hurdles.pop();
                    if (hurdle <= low) {
                        expected -= hurdle;
                    } else {
                        // a new peak appears
                        expected -= low * (hurdles.size() + 1);
                        result += expected;
                        low = hurdle;
                        expected = low * hurdles.size();
                    }
                }
                result += expected;
                i--;
                low = -1;
            }
            i++;
        }
        return result;
    }
}

