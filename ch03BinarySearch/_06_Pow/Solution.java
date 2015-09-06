/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 23, 2015
 */
package _06_Pow;

public class Solution {
    public int pow(int a, int b, int m) {
        if (a == 0) {
            return 0;
        }
        long a1 = a % m;
        long p = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                p = (p * a1) % m;
            }
            b /= 2;
            a1 = (a1 * a1) % m;
        }
        if (p < 0) {
            return (int) ((p + m) % m);
        } else {
            return (int) p;
        }
    }
}
