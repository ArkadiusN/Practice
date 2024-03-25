package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class DetermineColorOfAChessboardSquare {
    public static void main(String[] args) {
        StdOut.println(squareIsWhite2("a1"));
        StdOut.println(squareIsWhite2("h3"));
        StdOut.println(squareIsWhite2("c7"));
    }

    /**
     * You are given coordinates, a string that represents
     * <br>
     * the coordinates of a square of the chessboard.
     * <br>
     * Below is a chessboard for your reference.
     * <br>
     * <br>
     * Complexity of <b>O(1)</b>
     * <br>
     * Space complexity <b>O(1)</b>
     *
     *
     * @param coordinates is the exact position on the chessboard (letter & number).
     * @return true for white square on the chessboard, otherwise false.
     */
    public static boolean squareIsWhite(String coordinates) {
        int coor1 = coordinates.charAt(0), coor2 = coordinates.charAt(1);
        return coor1 % 2 == 0 && coor2 % 2 == 1
                || coor1 % 2 == 1 && coor2 % 2 == 0;
    }

    /**
     * Complexity of <b>O(1)</b>
     * <br>
     * Space complexity <b>O(1)</b>
     *
     *
     * @param coordinates is the exact position on the chessboard (letter & number).
     * @return true for white square on the chessboard, otherwise false.
     */
    public static boolean squareIsWhite2(String coordinates) {
        return  coordinates.charAt(0) % 2 == 0 && coordinates.charAt(1) % 2 == 1
                ||  coordinates.charAt(0) % 2 == 1 && coordinates.charAt(1) % 2 == 0;
    }
}
