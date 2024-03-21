package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class CountNegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
        StdOut.println(countNegatives(new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}}));
    }

    /**
     * Given a m x n matrix grid which is sorted
     * <br>
     * in non-increasing order both row-wise and
     * <br>
     * column-wise, return the number of negative numbers in grid.
     * <br>
     * <br>
     * Complexity of <b>O(N*M)</b>
     * <br>
     * Space complexity <b>O(1)</b>
     *
     *
     * @param grid integer matrix to check
     * @return total amount of negative values in matrix.
     */
    public static int countNegatives(int[][] grid) {
        int counter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                counter += (grid[i][j] < 0) ? 1 : 0;
            }
        }
        return counter;
    }
}
