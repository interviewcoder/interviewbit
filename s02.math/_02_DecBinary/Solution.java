/**
 *************************************************************************
 * Description: 
 * 
 * Given a number N >= 0, find its representation in binary. 
 * 
 * Example: if N = 6, binary form = 110
 *
 *************************************************************************
 * @date : Jul 8, 2015
 */
package _02_DecBinary;

public class Solution {

    private int BASE = 2;

    public String findDigitsInBinary(int A) {
        // corner case
        if (A == 0) {
            return "0";
        }
        StringBuilder strBuilder = new StringBuilder();
        while (A != 0) {
            strBuilder.insert(0, A % BASE);
            A = A / BASE;
        }
        return strBuilder.toString();
    }

}

