/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 13, 2015
 */
package _06_Histogram;

import java.util.List;

/** see test {@link _06_Histogram.SolutionTwoPointerTest } */
public class SolutionTwoPointer {
    public int largestRectangleArea(List<Integer> A) {
        int len = A.size();
        int result = 0;
        for (int i = 0; i < A.size(); i++) {
            int left = i - 1;
            int right = i + 1;
            int height = A.get(i);
            while (left >= 0 && A.get(left) >= height) {
                left--;
            }
            while (right < len && A.get(right) >= height) {
                right++;
            }
            int w = right - left - 1;
            result = Math.max(result, w * height);
        }
        return result;
    }
}
