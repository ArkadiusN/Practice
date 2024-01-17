package LeetCode;

import edu.princeton.cs.algs4.StdOut;
import java.util.*;

public class UniqueNumOfOccurrences {
    public static void main(String[] args) {
        StdOut.println(uniqueOccurrences(new int[]{1,2,2,1,1,3})); // 3, 2, 1
        StdOut.println(uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0})); // 3, 2, 4, 1
        StdOut.println(uniqueOccurrences(new int[]{1,2,2,1,1,3,4,4,4,4})); // 3, 2, 1, 3
        StdOut.println(uniqueOccurrences(new int[]{2,2,1,1,3,3})); // 2, 2, 2
    }

    /**
     * Given an array of integers arr, return true if the number
     * <br>
     * of occurrences of each value in the array is unique or false otherwise.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     *
     * @param arr integer array with values, where each has some number of occurrences.
     * @return true if there are no exact matches between occurrences and false otherwise.
     */
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
        Set<Integer> uniqueValues = new HashSet<>();
        for (Integer value : map.values()) {
            if (!uniqueValues.add(value)) {
                return false;
            }
        }
        return true;
    }
}
