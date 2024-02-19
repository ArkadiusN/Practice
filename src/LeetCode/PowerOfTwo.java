package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class PowerOfTwo {
    public static void main(String[] args) {
        StdOut.println(isPowerOfTwo(1));
        StdOut.println(isPowerOfTwo(16));
        StdOut.println(isPowerOfTwo(3));
    }

    /**
     * Given an integer 'n', return true if it is a power of two. Otherwise, return false.
     * <br>
     * An integer 'n' is a power of two, if there exists an integer 'x' such that n == 2x.
     * <br>
     * <br>
     * Complexity of <b>O(LogN)</b>
     * <br>
     * Space complexity <b>O(1)</b>
     *
     *
     * @param n integer to check.
     * @return true if 'n' is power of two, otherwise false.
     */
    public static boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }

    public static boolean isPowerOfTwo2(int n) {
        if (n == 0) return false;
        int x = (int)(Math.log(n) / Math.log(2)), k = (int) Math.pow(2, x);
        return k == n;
    }
}
