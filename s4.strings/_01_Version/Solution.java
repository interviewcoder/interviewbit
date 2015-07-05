/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 5, 2015
 */
package _01_Version;

public class Solution {
    public int compareVersion(String A, String B) {
        String[] a = A.split("\\."); // escape '.' in regular expression
        String[] b = B.split("\\.");
        int lenA = a.length;
        int lenB = b.length;
        int index = 0;
        // compare the version
        while (index < lenA && index < lenB) {
            int compare = compare(a[index], b[index]);
            if (compare != 0) {
                return compare;
            }
            index++;
        }
        // compare the remaining part
        
        if (index < lenA) {
            return notZero(a, index) ? 1 : 0;
        } else if (index < lenB) {
            return notZero(b, index) ? -1 : 0;
        } else {
            // nothing left in two versions
            return 0;
        }
    }
    
    private int compare(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int index1 = 0;
        int index2 = 0;
        // skip leading 0s
        while (index1 < len1 && str1.charAt(index1) == '0') {
            index1++;
        }
        while (index2 < len2 && str2.charAt(index2) == '0') {
            index2++;
        }
        if (len1 - index1 != len2 - index2) {
            return (len1 - index1) > (len2 - index2) ? 1 : -1;
        } else {
            while (index1 < len1 && index2 < len2) {
                if (str1.charAt(index1) != str2.charAt(index2)) {
                    return str1.charAt(index1) > str2.charAt(index2) ? 1 : -1;
                }
                index1++;
                index2++;
            }
            return 0;
        }
    }

    // whether remaining part has version larger than 0.0
    private boolean notZero(String[] strs, int index) {
        int len = strs.length;
        for (int i = index; i < len; i++) {
            if (Long.parseLong(strs[i]) != 0) {
                return true;
            }
        }
        return false;
    }
}
