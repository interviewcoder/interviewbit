/**
 *************************************************************************
 * Description: 
 * 
 * Given a read only set of n + 1 integers between 1 and n, find one number 
 * that repeats in linear time using less than O(n) space and traversing 
 * the stream sequentially O(1) times. 
 * 
 * Sample Input :  [3 4 1 4 1] 
 * Sample Output: 1 
 * 
 * If there are multiple possible answers ( like in the sample case above ), 
 * output any one.
 *
 *************************************************************************
 * Time: O(2N) ; Space: O(Sqrt(N))
 * @date : Jul 6, 2015
 */
package _10_RepeatArr;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 1. deal with bucket sorting, (bucket size and bucket numbers) see test
 * {@link _10_RepeatArr.SolutionTest }
 */
// split numbers into sqrt(n) ranges, and each ranges should
// have sqrt(n) numbers if numbers are 1 to n-1
// because we have duplicated, so at least one bucket has more than
// sqrt(n) elements
// be careful with the last bucket
public class Solution {

    private int[] buckets;

    private int AVG_BUCKET_SIZE = 0;

    private int LAST_BUCKET_SIZE = 0;

    // DO NOT MODIFY THE LIST
    public int repeatedNumber(final List<Integer> A) {
        int n = A.size() - 1; // [1 : n] for (n + 1) number
        if (n < 1) {
            // no way to find duplicates
            return -1;
        }
        int nBuckets = (int) Math.ceil(Math.sqrt(n)); // ceiling of sqrt(n)
        int range = (int) Math.sqrt(n); // floor of sqrt(n)

        buckets = new int[nBuckets];
        if (range * nBuckets < n) {
            // enlarge range of each bucket to contain all elements
            range++;
        }

        LAST_BUCKET_SIZE = n - (nBuckets - 1) * range;

        AVG_BUCKET_SIZE = range;

        int targetBucket = -1;
        for (int num : A) {
            int iBucket = (num - 1) / range;
            buckets[iBucket]++;
            if (moreThanExpected(iBucket)) {
                // once we found a bucket holding more elements than expected
                targetBucket = iBucket;
                break;
            }
        }
        if (targetBucket != -1) {
            Set<Integer> targetSet = new HashSet<>();
            int lower = targetBucket * range + 1;
            int upper = lower + range - 1;
            for (int num : A) {
                if (num >= lower && num <= upper && !targetSet.add(num)) {
                    // duplicate found
                    return num;
                }
            }
        }
        return -1;
    }

    // whether bucket[n] has more than expected elements
    private boolean moreThanExpected(int nBucket) {
        if (nBucket == buckets.length - 1) {
            return buckets[nBucket] > LAST_BUCKET_SIZE;
        } else {
            return buckets[nBucket] > AVG_BUCKET_SIZE;
        }
    }

}
