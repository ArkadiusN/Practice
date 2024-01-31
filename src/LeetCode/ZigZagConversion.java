package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class ZigZagConversion {
    public static void main(String[] args) {
        StdOut.println(convert("PAYPALISHIRING", 3));
        StdOut.println(convert("PAYPALISHIRING", 4));
    }

    public static String convert(String s, int numRows) {
        StringBuilder stringBuilder = new StringBuilder();
        int k = numRows + 2;
        for (int i = 0; i < s.length(); i+=k) {
            stringBuilder.append(s.charAt(i));
        }
        for (int i = 1; i < s.length(); i+=(numRows - 1)) {
            stringBuilder.append(s.charAt(i));
        }
        for (int i = numRows-1; i < s.length(); i+=k) {
            stringBuilder.append(s.charAt(i));
        }
        return "" + stringBuilder;
    }
}
