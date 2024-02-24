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

    /**
     * Given an array nums containing n distinct numbers
     * <br>
     * in the range [0, n], return the only number in the
     * <br>
     * range that is missing from the array.
     * <br>
     * <br>
     * Complexity of <b>O(NLogN)</b>
     * <br>
     * Space Complexity <b>O(1)<b>
     *
     *
     * @param nums array of integers.
     * @return missing integer from the given range of 'nums'.
     */
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

    /**
     * Complexity of <b>O(N)</b>
     * <br>
     * Space Complexity <b>O(N)<b>
     *
     *
     * @param nums array of integers.
     * @return missing integer from the given range of 'nums'.
     */
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

    /**
     * Complexity of <b>O(N)</b>
     * <br>
     * Space Complexity <b>O(LogN)<b>
     *
     *
     * @param nums array of integers.
     * @return missing integer from the given range of 'nums'.
     */
    public static int missingNumber3(int[] nums) {
        quickSort(nums, 0, nums.length-1);
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

    /**
     * Complexity of <b>O(1)</b>
     * <br>
     * Space Complexity <b>O(1)<b>
     *
     *
     * @param A array to be swapped.
     * @param i first index.
     * @param j second index.
     */
    public static void swap(int [] A, int i, int j ){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    /**
     * Complexity of <b>O(N)</b>
     * <br>
     * Space Complexity <b>O(1)<b>
     *
     *
     * @param A array to partition.
     * @param low lower bound.
     * @param high upper bound.
     * @return position of the pivot.
     */
    public static int partition(int [] A, int low, int high){
        int pivot = A[high], i = low;
        for (int j = i; j < high; j++) {
            if(A[j] <= pivot){
                swap(A,i,j);
                i = i+1;
            }
        }
        swap(A,high,i);
        return i;
    }

    /**
     * Complexity of <b>O(NLogN)</b>
     * <br>
     * Space Complexity <b>O(LogN)<b>
     *
     *
     * @param A array to sort.
     * @param low lower bound.
     * @param high upper bound.
     */
    public static void quickSort(int [] A, int low, int high){
        if(low < high){
            int p = partition(A,low,high);
            quickSort(A,low,p-1);
            quickSort(A,p+1,high);
        }
    }
}
