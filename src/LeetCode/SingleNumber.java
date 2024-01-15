package LeetCode;

import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        StdOut.println(singleNumber(new int[]{2,2,1}));     //1
        StdOut.println(singleNumber(new int[]{4,1,2,1,2})); //4
        StdOut.println(singleNumber(new int[]{1}));         //1
        StdOut.println(singleNumber(new int[]{1,3,1,-1,3}));//-1
        StdOut.println(singleNumber(new int[]{1,3,1,1,-3}));//-3
        StdOut.println(singleNumber(new int[]{-1}));        //-1
        StdOut.println(singleNumber(new int[]{-1,-1,-2}));  //-2 instead of 2
    }

    public static int singleNumber(int[] nums) {
        StringBuilder str = new StringBuilder(Arrays.toString(nums));
        int pos = 0;
        if(nums.length == 1){
            return nums[0];
        }
        for (int i = 1; i < str.length(); i++) {
            if(isNumeric(String.valueOf(str.charAt(i)))){
                if(str.indexOf(String.valueOf(str.charAt(i))) == str.lastIndexOf(String.valueOf(str.charAt(i)))){
                    pos = Integer.parseInt(String.valueOf(str.charAt(i)));
                }
                else if(str.charAt(i-1) == '-') {
                    pos = Integer.parseInt("-" + str.charAt(i));
                }
            }
        }
        return pos;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
