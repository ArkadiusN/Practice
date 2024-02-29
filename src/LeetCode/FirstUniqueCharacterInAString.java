package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        StdOut.println(firstUniqChar("leetcode"));
        StdOut.println(firstUniqChar("loveleetcode"));
        StdOut.println(firstUniqChar("aabbb"));
    }

    /**
     * Given a string 's', find the first non-repeating character
     * <br>
     * in it and return its index. If it does not exist, return -1.
     * <br>
     * <br>
     * Complexity of <b>O(N^2)</b>
     * <br>
     * Space complexity <b>O(1)</b>
     *
     *
     * @param s string to search through.
     * @return index of unique character.
     */
    public static int firstUniqChar(String s) {
        int index = -1;
        int i = 0;
        while (i < s.length()) {
            char currentChar = s.charAt(i);
            if (s.indexOf(currentChar) == s.lastIndexOf(currentChar)) {
                index = i;
                break;
            }
            i++;
        }
        return index;
    }
}
