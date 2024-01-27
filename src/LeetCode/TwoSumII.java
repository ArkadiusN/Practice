package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class TwoSumII {
    public static void main(String[] args) {
        StdOut.println(twoSum(new int[]{2,7,11,15}, 9));
        StdOut.println(twoSum(new int[]{2,3,4}, 6));
        StdOut.println(twoSum(new int[]{-1,0}, -1));
        StdOut.println(twoSum(new int[]{5,25,75}, 100));
    }

    /**
     * Given a 1-indexed array of integers numbers that is already
     * <br>
     * sorted in non-decreasing order, find two numbers such that
     * <br>
     * they add up to a specific target number. Let these two numbers
     * <br>
     * be numbers[index1] and numbers[index2] where 1 <= index1 <
     * <br>
     * index2 <= numbers.length.
     * <br>
     * <br>
     * Return the indices of the two numbers, index1 and index2,
     * <br>
     * added by one as an integer array [index1, index2] of length 2.
     * <br>
     * The tests are generated such that there is exactly one solution.
     * <br>
     * <br>
     * You may not use the same element twice.
     * <br>
     * <br>
     * Your solution must use only constant extra space.
     * <br>
     * <br>
     * Complexity of <b>O(NLogN)</b>
     *
     *
     * @param numbers array of integers.
     * @param target sum of integers.
     * @return array of indexes where integers add up to target.
     */
    public static int[] twoSum(int[] numbers, int target) {
        int i = 0, n = numbers.length, j = n - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                return new int[]{i+1, j+1};
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[]{-1};
    }

    /**
     * Complexity of <b>O(N^2)</b>
     *
     *
     * @param numbers array of integers.
     * @param target sum of integers.
     * @return array of indexes where integers add up to target.
     */
    public static int[] twoSum2(int[] numbers, int target) {
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i+1, j+1};
                }
            }
        }
        return new int[]{-1};
    }
}
