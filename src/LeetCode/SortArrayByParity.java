package LeetCode;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        StdOut.println(Arrays.toString(sortArrayByParity(new int[]{3, 1, 2, 4})));
    }

    /**
     * Given an integer array nums, move all the even integers
     * <br>
     * at the beginning of the array followed by all the odd integers.
     * <br>
     * Return any array that satisfies this condition.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     * <br>
     * Space complexity <b>O(1)</b>
     *
     *
     * @param nums
     * @return
     */
    public static int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int start = 0, end = nums.length - 1, i = 0;
        while (i < nums.length) {
            int num = nums[i];
            if (num % 2 == 0) {
                result[start] = num;
                start++;
            } else {
                result[end] = num;
                end--;
            }
            i++;
        }
        return result;
    }
}
