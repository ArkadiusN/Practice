package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class AddDigits {
    public static void main(String[] args) {
        StdOut.println(addDigits(38));
    }

    /**
     * Given an integer 'num', repeatedly add all its digits
     * <br>
     * until the result has only one digit, and return it.
     * <br>
     * <br>
     * Complexity of <b>O(LogN)</b>
     * <br>
     * Space complexity <b>O(LogN)</b>
     *
     *
     * @param num integer we take digits from.
     * @return one digit answer of addition.
     */
    public static int addDigits(int num) {
        if(Integer.toString(num).length() == 1) return num;
        int sum = 0, i = 0;
        char [] c = Integer.toString(num).toCharArray(); // N means number of digits in 'num'.
        while (i < c.length){
            sum += Integer.parseInt(String.valueOf(c[i]));
            i++;
        }
        return addDigits(sum);
    }

    /**
     * Complexity of <b>O(LogN)</b>
     * <br>
     * Space complexity <b>O(LogN)</b>
     *
     *
     * @param num integer we take digits from.
     * @return one digit answer of addition.
     */
    public static int addDigits2(int num) {
        if(("" + num).length() == 1) return num;
        int sum = 0, i = 0;
        char [] c = ("" + num).toCharArray();
        while (i < c.length){
            sum += Integer.parseInt("" + c[i]);
            i++;
        }
        return addDigits2(sum);
    }
}
