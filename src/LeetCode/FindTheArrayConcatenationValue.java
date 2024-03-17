package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class FindTheArrayConcatenationValue {
    public static void main(String[] args) {
        StdOut.println(findTheArrayConcVal(new int[]{7,52,2,4}));
        StdOut.println(findTheArrayConcVal(new int[]{5,14,13,8,12}));
    }

    public static long findTheArrayConcVal(int[] nums) {
        int i = 0, j = nums.length-1;
        long concat = (nums.length % 2 == 1) ? nums[nums.length / 2] : 0;
        while (i <= j-1) {
            concat +=  Long.valueOf(nums[i++] + "" + nums[j--]);
        }
        return concat;
    }
}
