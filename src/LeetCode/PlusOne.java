package LeetCode;

import edu.princeton.cs.algs4.StdOut;
import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        StdOut.println(Arrays.toString(plusOne1(new int[]{1,2,3})));
        StdOut.println(Arrays.toString(plusOne1(new int[]{1,2,9})));
        StdOut.println(Arrays.toString(plusOne1(new int[]{4,3,2,1})));
        StdOut.println(Arrays.toString(plusOne1(new int[]{9})));
        StdOut.println(Arrays.toString(plusOne1(new int[]{9,8,7,6,5,4,3,2,1,0})));
    }

    /**
     * You are given a large integer represented as an integer array
     * <br>
     * digits, where each digits[i] is the ith digit of the integer.
     * <br>
     * The digits are ordered from most significant to least significant
     * <br>
     * in left-to-right order. The large integer does not contain any
     * <br>
     * leading 0's.  Increment the large integer by one and return the
     * <br>
     * resulting array of digits.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     * <br>
     * Space complexity <b>O(N)</b>
     *
     * @param digits array where each digit is part of the integer.
     * @return array representing digit + 1.
     */
    public static int[] plusOne1(int[] digits) {
        StringBuilder str = new StringBuilder(Arrays.toString(digits));
        int h = 0;
        while (h < str.length()) {
            if(str.charAt(h) == ' '
               || str.charAt(h) == ','
               || str.charAt(h) == '['
               || str.charAt(h) == ']') str.deleteCharAt(h);
            h++;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                str.deleteCharAt(i);
            }
        }
        str = new StringBuilder(((new BigInteger(str.toString())).add(new BigInteger("1"))).toString());
        digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return digits;
    }

    /**
     * Complexity of <b>O(N)</b>
     * <br>
     * Space complexity <b>O(N)</b>
     *
     * @param digits array where each digit is part of the integer.
     * @return array representing digit + 1.
     */
    public static int[] plusOne2(int[] digits) {
        for (int i = digits.length-1; i >= 0 ; i--) {
            if(digits[i] < 9){
                digits[i] ++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}