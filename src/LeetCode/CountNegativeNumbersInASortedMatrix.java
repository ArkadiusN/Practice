package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class CountNegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
        StdOut.println(countNegatives(new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}}));
    }

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
