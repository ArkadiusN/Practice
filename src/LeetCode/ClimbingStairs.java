package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class ClimbingStairs {
    public static void main(String[] args) {
        StdOut.println(climbStairs(2)); // 1 + 1, 2
        StdOut.println(climbStairs(3)); // 1 + 1, 1 + 2, 2 + 1
        StdOut.println(climbStairs(5));
        // a = 1, b = 2
        // 1 + 1 + 1 + 1 + 1, // i = 5 positions
        // 1 + 1 + 1 + 2, //  i = i(5) - b + 1
        // 1 + 1 + 2 + 1,
        // 1 + 2 + 1 + 1,
        // 2 + 1 + 1 + 1
        // 2 + 2 + 1 // i = a + 2*b - 1
        // 2 + 1 + 2
        // 1 + 2 + 2
        // 8
        StdOut.println(climbStairs(6));
        // 1 + 1 + 1 + 1 + 1 + 1
        // 1 + 1 + 1 + 1 + 2
        // 1 + 1 + 1 + 2 + 1
        // 1 + 1 + 2 + 1 + 1
        // 1 + 2 + 1 + 1 + 1
        // 2 + 1 + 1 + 1 + 1
        // 2 + 1 + 1 + 2
        // 2 + 1 + 2 + 1
        // 1 + 2 + 2 + 1
        // 1 + 1 + 2 + 2
        // 1 + 2 + 1 + 2
        // 2 + 2 + 1
        // 2 + 1 + 2
    }

    // You are climbing a staircase. It takes n steps to reach the top.
    // Each time you can either climb 1 or 2 steps.
    // In how many distinct ways can you climb to the top?
    public static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }
}
