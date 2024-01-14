package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class SearchInsertPosition {
    public static void main(String[] args) {
        StdOut.println(searchInsert(new int[]{2,3,4,7,8,9}, 11)); //6
        StdOut.println(searchInsert(new int[]{1,3,5,6}, 0));      //0
        StdOut.println(searchInsert(new int[]{1,3,5,6}, 1));      //0
        StdOut.println(searchInsert(new int[]{1,3,5,6}, 2));      //1
        StdOut.println(searchInsert(new int[]{1,3,5,6}, 4));      //2
        StdOut.println(searchInsert(new int[]{1,3,4,6}, 5));      //3
    }

    /**
     * Given a sorted array of distinct integers and a target value,
     * <br>
     * return the index if the target is found. If not, return the
     * <br>
     * index where it would be if it were inserted in order.
     * <br>
     * You must write an algorithm with O(log n) runtime complexity.
     * <br>
     * <br>
     * Complexity of <b>O(LogN)</b>
     *
     * @param nums array of integers.
     * @param target a value we are using to seek a position.
     * @return position of the value in the array, otherwise position of where it belongs.
     */
    public static int searchInsert(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if(nums[mid] == target)
                return mid;
            if (nums[mid] > target)
                hi = mid -1;
            else if (nums[mid] < target)
                lo = mid + 1;
        }
        return lo;
    }
}
