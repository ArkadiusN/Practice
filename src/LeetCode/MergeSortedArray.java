package LeetCode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0},3, new int[]{2,5,6}, 3);
        merge(new int[]{-1,0,0,3,3,3,0,0,0},6, new int[]{1,2,2}, 3);
    }

    /**
     * You are given two integer arrays 'nums1' and 'nums2',
     * <br>
     * sorted in non-decreasing order, and two integers
     * <br>
     * 'm' and 'n', representing the number of elements in
     * <br>
     * 'nums1' and 'nums2' respectively.
     * <br>
     * Merge 'nums1' and 'nums2' into a single array sorted
     * <br>
     * in non-decreasing order. The final sorted array
     * <br>
     * should not be returned by the function, but instead
     * <br>
     * be stored inside the array 'nums1'. To accommodate this,
     * <br>
     * 'nums1' has a length of 'm + n', where the first 'm' elements
     * <br>
     * denote the elements that should be merged, and the last
     * <br>
     * 'n' elements are set to 0 and should be ignored. 'nums2'
     * <br>
     * has a length of 'n'.
     * <br>
     * <br>
     * Complexity of <b>O(N+M * LogN)</b>
     * <br>
     * Space complexity <b>O(1)</b>
     *
     *
     * @param nums1 first array.
     * @param m size of the first array.
     * @param nums2 second array to be merged.
     * @param n size of the second array.
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        while(j < n){
            nums1[m] = nums2[j];
            m++;
            j++;
        }
        Arrays.sort(nums1);
    }
}

