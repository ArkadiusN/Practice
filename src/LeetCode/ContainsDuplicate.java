package LeetCode;

import edu.princeton.cs.algs4.StdOut;
import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        StdOut.println(containsDuplicate(new int[]{1,2,3,1}));
        StdOut.println(containsDuplicate(new int[]{1,2,3,4}));
        StdOut.println(containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
        StdOut.println(containsDuplicate(new int[]{7,10,5,5,6,6,4,10,5,4,9,
                4,9,6,5,9,6,3,6,5,6,7,7,4,9,9,10,5,8,1,8,3,2,7,5,10,1,8,5,8,
                4,3,6,4,9,4,2,8,3,2,2,1,5,6,3,2,6,1,8,6,2,9,1,4,5,10,8,5,10,
                5,10,1,4,8,3,6,4,10,9,1,1,1,2,2,9,6,6,8,1,9,2,5,5,2,1,8,5,2,
                3,10}));
    }

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : nums) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
                int k = map.get(j);
                if(k > 1) return true;
            } else {
                map.put(j, 1);
            }
        }
        return false;
    }

    public static boolean containsDuplicate2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : nums) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
            int k = map.get(j);
            if(k > 1) return true;
        }
        return false;
    }

    public static boolean containsDuplicate3(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : nums) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
        for (Integer i : map.keySet()) {
            if(map.get(i) > 1) return true;
        }
        return false;
    }
}
