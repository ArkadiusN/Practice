package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class NumberOf1Bits {
    public static void main(String[] args) {
        StdOut.println(hammingWeight1(521));     //00000000000000000000000000001011
        StdOut.println(hammingWeight1(2097152)); //00000000000000000000000010000000
        StdOut.println(hammingWeight1(-3));      //11111111111111111111111111111101

        StdOut.println(hammingWeight2(521));     //00000000000000000000000000001011
        StdOut.println(hammingWeight2(2097152)); //00000000000000000000000010000000
        StdOut.println(hammingWeight2(-3));      //11111111111111111111111111111101
    }

    /**
     * Complexity of <b>O(1)</b>
     * <br>
     * Space complexity <b>O(1)</b>
     *
     *
     * @param n binary representation of signed integer type.
     * @return number of '1' bits.
     */
    public static int hammingWeight1(int n) {
        return Integer.bitCount(n);
    }

    /**
     * Write a function that takes the binary representation of
     * <br>
     * an unsigned integer and returns the number of '1' bits
     * <br>
     * it has (also known as the Hamming weight).
     * <br>
     * <br>
     * Complexity of <b>O(LogN) + O(M)</b>
     * <br>
     * Space complexity <b>O(LogN)</b>
     *
     *
     * @param n binary representation of signed integer type.
     * @return number of '1' bits.
     */
    public static int hammingWeight2(int n) {
        String str = Integer.toBinaryString(n); //LogN
        str = str.replaceAll("0", ""); //M
        return str.length();
    }
}
