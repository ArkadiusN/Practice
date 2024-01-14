package LeetCode;

import edu.princeton.cs.algs4.StdOut;
import java.math.BigInteger;

public class AddBinary {
    public static void main(String[] args) {
        StdOut.println(addBinary("11", "1"));      //101
        StdOut.println(addBinary("1010", "1011")); //10101
    }

    public static String addBinary(String a, String b) {
        return new BigInteger(a,2).add(new BigInteger(b,2)).toString(2);
    }
}
