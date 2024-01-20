package LeetCode;

import edu.princeton.cs.algs4.StdOut;
public class ReverseBits {
    public static void main(String[] args) {
        StdOut.println(reverseBits(-3));
        StdOut.println(reverseBits(43261596));
    }

    /**
     * Reverse bits of a given 32 bits signed integer.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     *
     * @param n signed binary to reverse (32 bit).
     * @return value of reversed version of binary.
     */
    public static int reverseBits(int n) {
        StringBuilder str = new StringBuilder(Integer.toBinaryString(n));
        str.reverse();
        while (str.length() < 32) {str.append(0);}
        return (int) Long.parseLong(str.toString(), 2);
    }
}