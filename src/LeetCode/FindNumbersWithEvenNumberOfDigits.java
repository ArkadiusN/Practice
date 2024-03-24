package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        StdOut.println(findNumbers(new int[]{12,345,2,6,7896}));
        StdOut.println(findNumbers(new int[]{555,901,482,1771}));
    }

    /**
     * Given an array nums of integers, return how many
     * <br>
     * of them contain an even number of digits.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     * <br>
     * Space complexity <b>O(1)</b>
     *
     *
     * @param nums integers array.
     * @return the amount of integers with even number of digits.
     */
    public static int findNumbers(int[] nums) {
        int counter = 0;
        for (int num : nums) {
            String g = num + "";
            counter += (g.length() % 2 == 0) ? 1 : 0;
        }
        return counter;
    }
}
