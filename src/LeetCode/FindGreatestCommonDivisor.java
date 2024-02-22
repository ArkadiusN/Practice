package LeetCode;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class FindGreatestCommonDivisor {
    public static void main(String[] args) {
        StdOut.println(findGCD(new int[]{2,5,6,9,10}));
        StdOut.println(findGCD(new int[]{7,5,6,8,3}));
        StdOut.println(findGCD(new int[]{3,3}));
        StdOut.println(findGCD(new int[]{6,9,10}));
    }


    public static int findGCD(int[] nums) {
        Arrays.sort(nums);
        int gcd=1;
        int start = nums[0];
        for (int i = 1; i <= start; i++) {
            if (start % i == 0 && nums[nums.length-1] % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
