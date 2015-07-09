/**
 *************************************************************************
 * Description: 
 * 
 * Given a positive integer, return its corresponding column title as 
 * appear in an Excel sheet. 
 * 
 * For example: 
 *  1 -> A 
 *  2 -> B 
 *  3 -> C 
 *  ... 
 *  26 -> Z 
 *  27 -> AA 
 *  28 -> AB 
 * 
 *************************************************************************
 * @date : Jul 8, 2015
 */
package _04_ExcelII;

/**
 * 1. construct char from number
 * 2. convert between base system without '0' number 
 *  see test {@link _04_ExcelII.SolutionTest } */
public class Solution {
    
    private int BASE = 26;
    
    // start number for single number
    private int START = 1;
    
    public String convertToTitle(int A) {
        StringBuilder strBuilder = new StringBuilder();
        while (A != 0) {
            strBuilder.insert(0, (char) ((A - START) % BASE + 'A'));
            A = (A - START) / BASE;
        }
        return strBuilder.toString();
    }
}

