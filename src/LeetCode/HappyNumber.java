package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class HappyNumber {
    public static void main(String[] args) {
        StdOut.println(isHappy(19));
        StdOut.println(isHappy(2));
        StdOut.println(isHappy(7));
    }

    /**
     * Write an algorithm to determine if a number 'n' is happy.
     * <br>
     * A happy number is a number defined by the following process:
     *  <ul>
     *   <li>Starting with any positive integer, replace the number by the sum of the squares of its digits.</li>
     *   <li>Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.</li>
     *   <li>Those numbers for which this process ends in 1 are happy.</li>
     *   <li>Return true if n is a happy number, and false if not.</li>
     * </ul>
     * Complexity of <b>O(N)</b>
     * <br>
     * Space complexity <b>O(N)</b>
     *
     *
     * @param n integer to be determined against 'happy' criteria.
     * @return true if 'n' is happy, otherwise false.
     */
    public static boolean isHappy(int n) {
        String str = String.valueOf(n);
        int sum = 0;
        if (n == 1) return true;
        else if (n == 4) return false;
        else  {
            for (int i = 0; i < str.toCharArray().length; i++) {
                int i1 = Integer.parseInt(String.valueOf(str.charAt(i)));
                sum += i1 * i1;
            }
        }
        return isHappy(sum);
    }
}
