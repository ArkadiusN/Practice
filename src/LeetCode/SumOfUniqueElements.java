package LeetCode;

import edu.princeton.cs.algs4.StdOut;
import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        StdOut.println(sumOfUnique(new int[]{1,2,3,2}));
    }

    /**
     * You are given an integer array 'nums'.
     * <br>
     * The unique elements of an array are the
     * <br>
     * elements that appear exactly once in the array.
     * <br>
     * Return the sum of all the unique elements of 'nums'.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     * <br>
     * Space complexity <b>O(N)</b>
     *
     *
     * @param nums integer array.
     * @return sum of all the unique elements of 'nums'.
     */
    public static int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int counter = 0;
        for (int j : nums) {
            map.put(j, map.containsKey(j) ? map.get(j) + 1 : 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            counter += (entry.getValue() == 1) ? entry.getKey() : 0;
        }
        return counter;
    }
}
