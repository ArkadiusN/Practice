package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class RemoveAllOccurrencesOfASubstring {
    public static void main(String[] args) {
        StdOut.println(removeOccurrences("daabcbaabcbc", "abc"));
        StdOut.println(removeOccurrences("axxxxyyyyb", "xy"));
        StdOut.println(removeOccurrences("aabababa", "aba"));
    }

    /**
     * Given two strings 's' and 'part', perform the
     * <br>
     * following operation on 's' until all occurrences
     * <br>
     * of the substring 'part' are removed:
     * <br>
     * <ul>
     *   <li>Find the leftmost occurrence of the substring 'part' and remove it from 's'.</li>
     * </ul>
     * Return s after removing all occurrences of part.
     * <br>
     * A substring is a contiguous sequence of characters in a string.
     * <br>
     * <br>
     * Complexity of <b>O(K * N)</b>
     * <br>
     * Space complexity <b>O(N)</b>
     *
     *
     * @param s String to be transformed.
     * @param part as a substring to be removed.
     * @return a substring that does not contain 'part'.
     */
    public static String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            s = s.replaceFirst(part, ""); // K as the amount of 'part(s)'
        }
        return s;
    }
}
