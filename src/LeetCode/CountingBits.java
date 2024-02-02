package LeetCode;

import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        StdOut.println(Arrays.toString(countBits(2)));
        StdOut.println(Arrays.toString(countBits(5)));
    }

    /**
     * Given an integer n, return an array ans
     * <br>
     * of length 'n + 1' such that for each 'i' (0 <= i <= n),
     * <br>
     * 'ans[i]' is the number of 1's in the binary
     * <br>
     * representation of i.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     *
     * @param n integer from which we seek bits of individual integer from 0 to n+1;
     * @return array of number of '1's for each value from 0 to n+1;
     */
    public static int[] countBits(int n) {
        int [] arr = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            arr[i] = hammingWeight1(i);
        }
        return arr;
    }

    /**
     * The best approach of seeking '1's bits
     * <br>
     * of the 'n' as the bitCount() method uses
     * <br>
     * table to look up the number of set bits in
     * <br>
     * a 4-bit integer and then combines the results
     * <br>
     * for groups of 4 bits in the input integer.
     * <br>
     * <br>
     * Complexity of <b>O(1)</b>
     *
     * @param n integer used to get Hamming weight.
     * @return number of '1's.
     */
    public static int hammingWeight1(int n) {
        return Integer.bitCount(n);
    }

    /**
     * Slight improvement of the last approach where we only
     * <br>
     * seek '1's and increase the counter.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     *
     * @param n binary representation of signed integer type.
     * @return number of '1's.
     */
    public static int hammingWeight3(String n) {
        int counter = 0;
        for (int i = 0; i < n.length(); i++) {
            if(n.charAt(i) == '1'){
                counter++;
            }
        }
        return counter;
    }

    /**
     * The worst approach as we have to replace each '0'
     * <br>
     * with empty space to seek length of String 'n' with
     * <br>
     * only '1's.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     *
     * @param n binary representation of signed integer type.
     * @return number of '1's.
     */
    public static int hammingWeight2(String n) {
        n = n.replaceAll("0", "");
        return n.length();
    }
}
