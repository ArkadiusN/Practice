package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        StdOut.println(longestPalindrome("babad"));
        StdOut.println(longestPalindrome("cbbd"));
        StdOut.println(longestPalindrome("babadd"));
    }

    public static String longestPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        int end = 0;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                end = j;
            } else {
                i++;
            }
            j--;
        }
        System.out.println(end);
        return "";
    }
}
