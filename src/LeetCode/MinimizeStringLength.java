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

    public static int minimizedStringLength(String s) {
        Set<Character> hs = new HashSet<>();
        short i = 0;
        while (i < s.length()) hs.add(s.charAt(i++));
        return hs.size();
    }
}
