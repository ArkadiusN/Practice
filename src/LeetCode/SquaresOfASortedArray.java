package LeetCode;

import edu.princeton.cs.algs4.StdOut;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        StdOut.println(Arrays.toString(sortedSquares(new int[]{-4,-1,0,3,10})));
        StdOut.println(Arrays.toString(sortedSquares(new int[]{-7,-3,2,3,11})));
        StdOut.println(Arrays.toString(sortedSquares2(new int[]{-4,-1,0,3,10})));
        StdOut.println(Arrays.toString(sortedSquares2(new int[]{-7,-3,2,3,11})));
    }

    public static void runSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i], j = i-1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static int[] sortedSquares(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add((int) Math.abs(Math.pow(num, 2)));
        }
        int i = 0;
        while (i < list.size()) {
            nums[i] = list.get(i);
            i++;
        }
        runSort(nums);
        return nums;
    }

    public static int[] sortedSquares2(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            nums[i] = nums[i] * nums[i];
            i++;
        }
        Arrays.sort(nums);
        return nums;
    }
}
