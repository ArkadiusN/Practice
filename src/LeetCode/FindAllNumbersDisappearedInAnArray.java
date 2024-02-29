package LeetCode;

import edu.princeton.cs.algs4.StdOut;
import java.util.*;

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        StdOut.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }

    /**
     * Given an array 'nums' of 'n' integers where 'nums[i]'
     * <br>
     * is in the range [1, n], return an array of all the
     * <br>
     * integers in the range [1, n] that do not appear in 'nums'.
     * <br>
     * <br>
     * Complexity of <b>O(NLogN)</b>
     * <br>
     * Space Complexity <b>O(N)<b>
     *
     *
     * @param nums array of integers.
     * @return list of all the missing integers.
     */
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>(), list2 = new ArrayList<>();
        Arrays.sort(nums);
        int num = 1, j = 0;
        int i = 0;
        while (i < nums.length) {
            while (j < nums.length && nums[j] < num) j++;
            if (j == nums.length || nums[j] > num) {
                list.add(num);
                list2.add(num);
            }
            num++;
            i++;
        }
        return list2;
    }
}