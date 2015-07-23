/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 23, 2015
 */
package _05_AssignBooks;

import java.util.ArrayList;

/** see test {@link _05_AssignBooks.SolutionTest } */
public class Solution {
    
    // whether is possible to assign these books to B students, and
    // each student have at most `curr` pages.
    // In another word, if one student is allowed to have at most `curr` pages,
    // can B students to assigned all these books
    private boolean isPossible(ArrayList<Integer> books, int B, int curr) {
        int students = 1;
        int sum = 0;
        for (Integer book : books) {
            if (book > curr) return false;
            if (sum + book > curr) {
                students++;
                sum = book;
                if (students > B) return false;
            } else {
                sum += book;
            }
        }
        return true;
    }
    
    public int books(ArrayList<Integer> books, int B) {
        int n = books.size();
        if (n < B) return -1;
        int sum = 0;
        for (Integer book : books) sum += book;

        int lo = 0;
        int hi = sum;
        int result = Integer.MAX_VALUE;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (isPossible(books, B, mid)) {
                result = Math.min(result, mid);
                hi = mid - 1;
            } else lo = mid + 1;
        }

        return result;
    }
}
