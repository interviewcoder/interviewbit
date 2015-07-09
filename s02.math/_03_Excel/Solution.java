/**
 *************************************************************************
 * Description: 
 * 
 * Given a column title as appear in an Excel sheet, return its 
 * corresponding column number. 
 * 
 * For example: 
 *  A -> 1 
 *  B -> 2 
 *  C -> 3 
 *  ... 
 *  Z -> 26 
 *  AA -> 27 
 *  AB -> 28 
 * 
 *************************************************************************
 * @date : Jul 8, 2015
 */
package _03_Excel;

/** see test {@link _03_Excel.SolutionTest } */
public class Solution {
    private int BASE = 26; 
    
    private int START = 1;
            
    public int titleToNumber(String A) {
        int result = 0;
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            result = result * BASE + (ch - 'A' + START);
        }
        return result;
    }
}
