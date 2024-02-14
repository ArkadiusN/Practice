package LeetCode;

import java.util.*;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        intersection2(new int[]{1,2,2,1}, new int[]{2,2});
        intersection2(new int[]{4,9,5}, new int[]{9,4,9,8,4});
    }

    /**
     * Given two integer arrays nums1 and nums2, return an array
     * <br>
     * of their intersection. Each element in the result must be
     * <br>
     * unique and you may return the result in any order.
     * <br>
     * <br>
     * Complexity of <b>O(NUMS1 + NUMS2)</b>
     * <br>
     * Space complexity <b>O(NUMS1 + NUMS2)</b>
     *
     *
     * @param nums1 first array of integers.
     * @param nums2 second array of integers.
     * @return intersection array.
     */
    public static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int j : nums1) {
            map1.put(j, 1);
        }
        for (int j : nums2) {
            map2.put(j, 1);
        }
        for (Integer val: map1.keySet()) {
            if(map2.containsKey(val)){
                set.add(val);
            }
        }
        int[] arr = new int[set.size()];
        int i = 0;
        for (Integer val: set) {
            arr[i++] = val;
        }
        return arr;
    }

    /**
     * Complexity of <b>O(MAX(NUMS1 + NUMS2)</b>
     * <br>
     * Space complexity <b>O(NUMS1 + NUMS2)</b>
     *
     *
     * @param nums1 first array of integers.
     * @param nums2 second array of integers.
     * @return intersection array.
     */
    public static int[] intersection2(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>(), map2 = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        int j = 0;
        while (j < nums1.length || j < nums2.length){
            if(j < nums1.length) map1.put(nums1[j], 1);
            if(j < nums2.length) map2.put(nums2[j], 1);
            j++;
        }
        for (Integer val: map1.keySet()) {
            if(map2.containsKey(val)) {
                set.add(val);
            }
        }
        j = 0;
        int[] arr = new int[set.size()];
        for (Integer val: set) {
            arr[j++] = val;
        }
        return arr;
    }
}
