package LeetCode;

import java.util.Arrays;

public class MergeStringAlternately {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));
        System.out.println(mergeAlternately("ab", "pqrs"));
        System.out.println(mergeAlternately("abcd", "pq"));
    }

    /**
     * You are given two strings word1 and word2.
     * <br>
     * Merge the strings by adding letters in alternating order,
     * <br>
     * starting with word1. If a string is longer than the other,
     * <br>
     * append the additional letters onto the end of the merged string.
     * <br>
     * Return the merged string.
     *
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     *
     * @param word1 first string to be merged alternatively  (index = 0, 2, 4 ...).
     * @param word2 second string to be merged alternatively (index = 1, 3, 5 ...).
     * @return string merged alternatively.
     */
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if(i < word1.length()) {
                sb.append(word1.charAt(i));
            }
            if(i < word2.length()) {
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}
