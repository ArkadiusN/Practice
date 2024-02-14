package LeetCode;

import edu.princeton.cs.algs4.StdOut;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {
    public static void main(String[] args) {
        StdOut.println(lengthOfLongestSubstring("abcabcbb")); //3
        StdOut.println(lengthOfLongestSubstring("bbbbb"));    //1
        StdOut.println(lengthOfLongestSubstring("pwwkew"));   //3
        StdOut.println(lengthOfLongestSubstring("aab"));      //2
        StdOut.println(lengthOfLongestSubstring("ohomm"));    //3
        StdOut.println(lengthOfLongestSubstring("anviaj"));   //5
    }

    /**
     * Given a string s, find the length of the longest
     * <br>
     * substring without repeating characters.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     * <br>
     * Space complexity <b>O(MIN(N, M)</b>
     *
     *
     * @param s a random string.
     * @return length of the string where characters do not repeat.
     */
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>(); // Size of the set (M).
        int i, max =0, left = 0;
        for (i = 0; i < s.length(); i++) { // Number of chars in string (N).
            while(!set.add(s.charAt(i))) {
                set.remove(s.charAt(left++));
            }
            max = Math.max(max, set.size());
        }
        return max;
    }
}
