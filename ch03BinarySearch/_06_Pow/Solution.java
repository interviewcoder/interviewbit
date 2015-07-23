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

    public int pow(int x, int n, int p) {
        if (n == 0) {
            return 1 % p;
        }
        long ans = 1;
        long base = x;
        while (n > 0) {
            // We need (base ** n) % p.
            // Now there are 2 cases.
            // 1) n is even. Then we can make base = base^2 and n = n / 2.
            // 2) n is odd. So we need base * base^(n-1)
            if (n % 2 == 1) {
                ans = (ans * base) % p;
                n--;
            } else {
                base = (base * base) % p;
                n /= 2;
            }
        }
        if (ans < 0) {
            ans = (ans + p) % p;
        }
        return (int) ans;
    }

}
