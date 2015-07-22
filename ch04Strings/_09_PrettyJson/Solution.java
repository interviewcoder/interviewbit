/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 10, 2015
 */
package _09_PrettyJson;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    
    @SuppressWarnings("serial")
    private Set<Character> endings = new HashSet<Character>(){{
        add('{');
        add('[');
        add(']');
        add('}');
    }};

    public ArrayList<String> prettyJSON(String A) {
        ArrayList<String> result = new ArrayList<>();
        StringBuilder prefix = new StringBuilder();
        int i = 0;
        int len = A.length();
        while (i < len) {
            char ch = A.charAt(i);
            if (ch == ' ') {
                i++;
                continue;
            }
            StringBuilder line = new StringBuilder(prefix);
            if (ch == '{' || ch == '[') {
                // one new line
                line.append(ch);
                prefix.append("\t");
            } else if (ch == '}' || ch == ']') {
                // current indent ends
                prefix.deleteCharAt(0);
                line = new StringBuilder(prefix);
                line.append(ch);
                if (i < len - 1 && A.charAt(i + 1) == ',') {
                    line.append(",");
                    i++;
                }
            } else {
                // find until ",", ".", "]", "}", "{
                while (i < len && !endings.contains(A.charAt(i))) {
                    line.append(A.charAt(i));
                    if (A.charAt(i) == ',')  {
                        i++;
                        break;
                    }
                    i++;
                }
                i--;
            }
            result.add(line.toString());
            i++;
        }
        return result;
    }
}

