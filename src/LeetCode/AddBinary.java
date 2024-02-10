package LeetCode;

import edu.princeton.cs.algs4.StdOut;
import java.math.BigInteger;

public class AddBinary {
    public static void main(String[] args) {
        StdOut.println(addBinary("11", "1"));      //101
        StdOut.println(addBinary("1010", "1011")); //10101
    }

    /**
     * Given two binary strings 'a' and 'b',
     * <br>
     * return their sum as a binary string.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     * <br>
     * Space complexity <b>O(M + K)</b>
     *
     *
     * @param a first string.
     * @param b second string
     * @return sum of binary string.
     */
    public static String addBinary(String a, String b) {
        // M+K is number of bits in each string.
        return new BigInteger(a,2)
                .add(new BigInteger(b,2))
                .toString(2);
    }
}
