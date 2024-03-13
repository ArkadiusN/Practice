package LeetCode;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class FindUniqueBinaryString {
    public static void main(String[] args) {
        StdOut.println(findDifferentBinaryString(new String[]{"01", "10"}));
    }

    public static String findDifferentBinaryString(String[] nums) {
        char[] str = new char[nums.length];
        for(int i = 0; i < nums.length; i++) {
            str[i] = (nums[i].charAt(i) == '1') ? '0' : '1';
        }
        return new String(str);
    }
}
