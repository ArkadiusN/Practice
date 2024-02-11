package LeetCode;

import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        StdOut.println(Arrays.toString(getConcatenation(new int[]{1,2,3})));
        StdOut.println(Arrays.toString(getConcatenation(new int[]{1,2,3,1})));
        StdOut.println(Arrays.toString(getConcatenation(new int[]{0,1,1,0})));
    }

    /**
     * Given an integer array 'nums' of length 'n',
     * <br>
     * you want to create an array 'ans' of length '2n'
     * <br>
     * where 'ans[i] == nums[i]' and 'ans[i + n] ==
     * <br>
     * nums[i]' for '0 <= i < n (0-indexed)'.
     * <br>
     * Specifically, 'ans' is the concatenation of
     * <br>
     * two 'nums' arrays.
     * <br>
     * Return the array 'ans'.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     * <br>
     * Space complexity <b>O(N)</b>
     *
     *
     * @param nums integer array.
     * @return concatenation of two 'nums' arrays.
     */
    public static int[] getConcatenation(int[] nums) {
        int n = 2 * nums.length;
        int [] g = new int[n];
        int j = n/2;
        for (int i = 0; i < g.length/2; i++) {
            g[i] = nums[i];
        }
        for (int num : nums) {
            g[j++] = num;
        }
        return g;
    }
}
