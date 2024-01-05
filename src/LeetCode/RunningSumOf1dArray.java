package LeetCode;

import java.util.Arrays;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1, 2, 3, 4})));
    }

    /**
     * Given an array nums. We define a running sum of
     * <br>
     * an array as 'runningSum[i] = sum(nums[0]…nums[i])'.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     *
     * @param nums array of numbers to running sum from.
     * @return the running sum of nums
     */
    public static int[] runningSum(int[] nums) {
        for(int i = 1; i <= nums.length-1; i++){
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }
}
