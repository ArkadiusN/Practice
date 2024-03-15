package LeetCode;

import edu.princeton.cs.algs4.StdOut;
import java.util.HashSet;
import java.util.Set;

public class MinimizeStringLength {
    public static void main(String[] args) {
        StdOut.println(minimizedStringLength("aaabc"));
        StdOut.println(minimizedStringLength("cbbd"));
        StdOut.println(minimizedStringLength("dddaaa"));
    }

    /**
     * Given a 0-indexed string s, repeatedly perform the
     * <br>
     * following operation any number of times:
     * <br>
     * <ul>
     *   <li>Choose an index 'i' in the string,
     *   and let 'c' be the character in position 'i'.
     *   Delete the closest occurrence of 'c' to the
     *   left of 'i' (if any) and the closest occurrence
     *   of 'c' to the right of 'i' (if any).</li>
     * </ul>
     * Your task is to minimize the length of 's' by performing
     * <br>
     * the above operation any number of times.
     * <br>
     * Return an integer denoting the length of the minimized string.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     * <br>
     * Space complexity <b>O(N)</b>
     *
     *
     * @param s String to be minimized.
     * @return the length of the new String.
     */
    public static int minimizedStringLength(String s) {
        Set<Character> hs = new HashSet<>();
        short i = 0;
        while (i < s.length()) hs.add(s.charAt(i++));
        return hs.size();
    }
}
