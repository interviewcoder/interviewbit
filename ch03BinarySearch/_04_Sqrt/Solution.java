/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 23, 2015
 */
package _04_Sqrt;

public class Solution {

    public int sqrt(int a) {
        if (a <= 0) {
            return 0;
        }
        int low = 1;
        int high = a;
        while (low <= high) {
            // avoid potential Stack Overflow instead of (low + high) / 2
            int mid = (high - low) / 2 + low;
            int isEqual = (mid - a / mid);
            if (isEqual == 0) {
                return mid;
            } else if (isEqual > 0) {
                high = mid - 1;
            } else {
                if ((mid + 1) > a / (mid + 1)) {
                    return mid;
                }
                low = mid + 1;
            }
        }
        return low;
    }

}

