package LeetCode;

import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;

public class ReverseVowelsOfString {
    public static void main(String[] args) {
        StdOut.println(Arrays.toString(reverseString(new char[]{'h', 'e', 'l', 'l', 'o'})));
        StdOut.println(Arrays.toString(reverseString(new char[]{'H','a','n','n','a','h'})));
    }

    /**
     * Write a function that reverses a string. The input string is given as an array of characters s.
     * <br>
     * You must do this by modifying the input array in-place with O(1) extra memory.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     * <br>
     * Space complexity <b>O(1)</b>
     *
     * @param s string in form of char array.
     * @return reversed version of char array, which represents String.
     */
    public static char[] reverseString(char[] s) {
        int j = s.length-1;
        for (int i = 0; i < s.length/2; i++) {
            char temp = s[i];
            s[i] = s[j];
            s[j--] = temp;
        }
        return s;
    }
}
