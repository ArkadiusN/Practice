package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class RemoveAllOccurrencesOfASubstring {
    public static void main(String[] args) {
        StdOut.println(removeOccurrences("daabcbaabcbc", "abc"));
        StdOut.println(removeOccurrences("axxxxyyyyb", "xy"));
        StdOut.println(removeOccurrences("aabababa", "aba"));
    }

    public static String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            s = s.replaceFirst(part, "");
        }
        return s;
    }
}
