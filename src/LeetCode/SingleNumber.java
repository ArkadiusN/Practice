package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class SingleNumber {
    public static void main(String[] args) {
        StdOut.println(singleNumber(new int[]{2,2,1}));     //1
        StdOut.println(singleNumber(new int[]{4,1,2,1,2})); //4
        StdOut.println(singleNumber(new int[]{1}));         //1
        StdOut.println(singleNumber(new int[]{1,3,1,-1,3}));//-1
        StdOut.println(singleNumber(new int[]{1,3,1,1,-3}));//-3
        StdOut.println(singleNumber(new int[]{-1}));        //-1
        StdOut.println(singleNumber(new int[]{-1,-1,-2}));  //-2 instead of 2
        StdOut.println(singleNumber(new int[]{-336,513,-560,-481,-174,101,-997,40,-527,-784,-283,-336,513,-560,-481,-174,101,-997,40,-527,-784,-283,3542}));
    }

    /**
     * Given a non-empty array of integers nums, every element appears
     * <br>
     * twice except for one. Find that single one.
     * <br>
     * You must implement a solution with a linear runtime complexity
     * <br>
     * and use only constant extra space.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     *
     * @param nums array of integers.
     * @return the value that is occurrence is equal to one.
     */
    public static int singleNumber(int[] nums) {
        int ans=nums[0];
        int i=0;
        while(i<nums.length-1){
            //This operator is a binary operator, denoted by ‘^’
            //It returns bit by bit XOR of input values, i.e., if
            //corresponding bits are different, it gives 1, else it shows 0.
            ans=ans^nums[i+1];
            i++;
        }
        return ans;
    }
}
