package LeetCode;

import edu.princeton.cs.algs4.StdOut;
import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        StdOut.println(sumOfUnique(new int[]{1,2,3,2}));
    }

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
