/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 10, 2015
 */
package _12_TextJustification;

import java.util.ArrayList;

public class Solution {
    public ArrayList<String> fullJustify(ArrayList<String> A, int B) {
        ArrayList<String> result = new ArrayList<>();
        if (A.size() == 0 || B <= 0) {
            return result;
        }
        // index of word in given list which serves as the first word in one
        // line
        int start = 0;
        // index of word in given list which serves as the last word in one line
        int end = 0;

        int i = 0; // index of word in the list
        int len = A.size();
        while (i < len) {
            // find all words that fill one line
            int lineLen = 0;
            while (i < len) {
                // can we add word at i into current line?
                int add = A.get(i).length();
                if (i != start) {
                    // at least one space between words
                    add += 1;
                }
                if (lineLen + add > B) {
                    break;
                }
                lineLen += add;
                i++;
            }
            end = i - 1;
            if (i == len) {
                // last line to justify
                result.add(jusifyLastLine(start, end, A, B));
            } else {
                // not last line
                result.add(jusifyOneLine(start, end, A, B, lineLen));
            }
            // next line
            start = end + 1;
        }
        return result;
    }

    /**
     * For the last line of text, it should be left justified and no extra space
     * is inserted between words.
     */
    private String jusifyLastLine(int start, int end, ArrayList<String> A, int B) {
        StringBuilder res = new StringBuilder(String.join(" ", A.subList(start, end + 1)));
        while (res.length() < B) {
            res.append(" ");
        }
        return res.toString();
    }

    /**
     * Pad extra spaces when necessary so that each line has exactly L
     * characters. Extra spaces between words should be distributed as evenly as
     * possible. If the number of spaces on a line do not divide evenly between
     * words, the empty slots on the left will be assigned more spaces than the
     * slots on the right.
     */
    private String jusifyOneLine(int start, int end, ArrayList<String> a,
            int b, int lineLen) {
        int extra = b - lineLen;
        if (start == end) {
            // one word in this line
            StringBuilder str = new StringBuilder(a.get(start));
            for (int i = 0; i < extra; i++) {
                str.append(" ");
            }
            return str.toString();
        }
        StringBuilder str = new StringBuilder();
        int words = end - start + 1;
        int avg = extra / (words - 1) + 1; // average spaces between two words
        StringBuilder spaces = new StringBuilder();
        for (int i = 0; i < avg; i++) {
            spaces.append(" ");
        }
        String largeSpace = spaces.toString() + " ";
        int lefts = extra % (words - 1); // how many words will have one more space
                                   // than average spaces
        int left = 0;
        for (int i = start; i < end; i++) {
            str.append(a.get(start++));
            if (left < lefts) {
                str.append(largeSpace);
                left++;
            } else {
                str.append(spaces);
            }
        }
        // last word
        str.append(a.get(end));
        return str.toString();
    }
}
