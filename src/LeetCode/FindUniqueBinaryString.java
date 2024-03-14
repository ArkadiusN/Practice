package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class FindUniqueBinaryString {
    public static void main(String[] args) {
        StdOut.println(findDifferentBinaryString(new String[]{"01", "10"}));
    }

    /**
     * Given an array of strings nums containing n
     * <br>
     * unique binary strings each of length n, return
     * <br>
     * a binary string of length n that does not appear
     * <br>
     * in nums. If there are multiple answers, you may return any of them.
     * <br>
     * Complexity of <b>O(N)</b>
     * <br>
     * Space complexity <b>O(N)</b>
     *
     *
     * @param nums array of binary strings
     * @return binary string that does not appear in nums.
     */
    public static String findDifferentBinaryString(String[] nums) {
        char[] str = new char[nums.length];
        for(int i = 0; i < nums.length; i++) {
            str[i] = (nums[i].charAt(i) == '1') ? '0' : '1';
        }
        return new String(str);
    }
}
