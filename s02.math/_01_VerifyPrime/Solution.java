/**
 *************************************************************************
 * Description: 
 * 
 * Given a number N, verify if N is prime or not. 
 * Return 1 if N is prime, else return 0.
 *
 *************************************************************************
 * @date : Jul 8, 2015
 */
package _01_VerifyPrime;

/** see test {@link _01_VerifyPrime.SolutionTest } */
public class Solution {
    public int isPrime(int A) {
        if (A < 2) {
            return 0;
        }
        int number = 2;
        // ! upper bound
        int bound = (int) Math.sqrt(A);
        while (number <= bound) {
            if (A % number == 0) {
                return 0;
            }
            number++;
        }
        return 1;
    }
}

