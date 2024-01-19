package LeetCode;

import edu.princeton.cs.algs4.StdOut;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        StdOut.println(majorityElement(new int[]{3,2,3}));
        StdOut.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

    /**
     * Given an array nums of size n, return the majority element.
     * <br>
     * The majority element is the element that appears more than
     * <br>
     * '⌊n / 2⌋' times. You may assume that the majority element
     * <br>
     * always exists in the array
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     *
     * @param nums array of integers.
     * @return element that appears more than half of the array size.
     */
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int major = 0;
        for (int j : nums) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
        for (Integer i : map.keySet()) {
            if (map.containsValue(map.get(i)) && map.get(i) > nums.length/2) {
                major = i;
            }
        }
        return major;
    }
}
