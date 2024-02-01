package LeetCode;

import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        StdOut.println(Arrays.toString(getConcatenation(new int[]{1,2,3})));
        StdOut.println(Arrays.toString(getConcatenation(new int[]{1,2,3,1})));
        StdOut.println(Arrays.toString(getConcatenation(new int[]{0,1,1,0})));
    }

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
