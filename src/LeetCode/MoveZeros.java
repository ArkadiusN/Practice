package LeetCode;

import java.util.ArrayList;

public class MoveZeros {
    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
        moveZeroes(new int[]{1});
        moveZeroes(new int[]{1,0});
        moveZeroes(new int[]{0,1});
    }

    /**
     * Given an integer array 'nums', move all 0's
     * <br>
     * to the end of it while maintaining the relative
     * <br>
     * order of the non-zero elements.
     * <br>
     * Note that you must do this in-place without making
     * <br>
     * a copy of the array.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     * <br>
     * Space complexity <b>O(1)</b>
     *
     *
     * @param nums array of integers.
     */
    public static void moveZeroes(int[] nums) {
        if(nums.length == 1){
            return;
        }
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        for (int l = j; l < nums.length; l++) nums[l] = 0;
    }

    /**
     * Complexity of <b>O(N)</b>
     * <br>
     * Space complexity <b>O(N)</b>
     *
     *
     * @param nums array of integers.
     */
    public static void moveZeroes2(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                list.add(nums[i]);
            }else{
                c++;
            }
        }
        for (int i = 0; i < c; i++) {
            list.add(0);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
    }
}
