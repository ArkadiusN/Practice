package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class SquareRoot {
    public static void main(String[] args) {
        StdOut.println(mySqrt(16));
        StdOut.println(mySqrt(4));
        StdOut.println(mySqrt(8));
        StdOut.println(mySqrt(32));
    }

    /**
     * Given a non-negative integer 'x', return the square root of
     * <br>
     * 'x' rounded down to the nearest integer. The returned integer
     * <br>
     * should be non-negative as well.
     * <br>
     * You must not use any built-in exponent function or operator.
     * <br>
     * For example, do not use 'pow(x, 0.5)' in C++ or 'x ** 0.5' in python.
     * <br>
     * <br>
     * Complexity of <b>O(LogN)</b>
     *
     *
     * @param x is a non-negative integer.
     * @return square root of the 'x' to the nearest integer.
     */
    public static int mySqrt(int x) {
        int i = 1, counter = 0;
        while(x > 0){
            x -= i;
            counter++;
            i+=2;
        }
        return (x<0) ? counter-1: counter;
    }
}
