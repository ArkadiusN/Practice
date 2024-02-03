package LeetCode;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public static void main(String[] args) {
        StdOut.println(missingNumber2(new int[]{0,1}));
        StdOut.println(missingNumber2(new int[]{1,2}));
        StdOut.println(missingNumber2(new int[]{3,0,1}));
        StdOut.println(missingNumber2(new int[]{9,6,4,2,3,5,7,0,1}));
    }


    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int missing = 0;
        for (int i = 0; i < nums.length; i++) {
                if (i != nums[i]) {
                    missing = i;
                    break;
                } else {
                    missing = nums[i] + 1;
                }
        }
        return missing;
    }

    public static int missingNumber2(int[] nums) {
        Set<Integer> set= new HashSet<>();
        int n = nums.length;
        for (int j = 0; j < n; j++) {
            set.add(nums[j]);
        }
        for(int i=0; i < n; i++) {
            if(!set.contains(i)) {
                return i;
            }
        }
        return nums.length;
    }
}
