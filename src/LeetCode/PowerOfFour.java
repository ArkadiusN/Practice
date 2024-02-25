package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class PowerOfFour {
    public static void main(String[] args) {
        StdOut.println(isPowerOfFour(16)); // true
        StdOut.println(isPowerOfFour(64)); // true
        StdOut.println(isPowerOfFour(32)); // false
        StdOut.println(isPowerOfFour(8));  // false
        StdOut.println(isPowerOfFour(1));  // true
        StdOut.println(isPowerOfFour(121));// false
        StdOut.println(isPowerOfFour(133));// false
        StdOut.println(isPowerOfFour(129140162));// false
    }

    /**
     * Given an integer n, return true if it is a power of four. Otherwise, return false.
     * <br>
     * An integer n is a power of four, if there exists an integer x such that n == 4x.
     * <br>
     * <br>
     * Complexity of <b>O(LogN)</b>
     * <br>
     * Space complexity <b>O(1)</b>
     *
     *
     * @param n integer to check.
     * @return true if 'n' is power of four, otherwise false.
     */
    public static boolean isPowerOfFour(int n) {
        if (n == 0) return false;
        while (n % 4 == 0) {
            n /= 4;
        }
        return n == 1;
    }
}
