package LeetCode;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
        System.out.println(reverse(102));
        System.out.println(reverse(0));
        System.out.println(reverse(1534236469));
    }

    /**
     * Given a signed 32-bit integer x, return x with its digits reversed.
     * If reversing x causes the value to go outside the signed 32-bit
     * integer range [-231, 231 - 1], then return 0.
     * <br>
     * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
     * <br>
     * <br>
     * Complexity of <b>O(1)</b>
     *
     * @param x 32-bit integer to reverse.
     * @return reversed integer 'x'.
     */
    public static int reverse(int x) {
        if(x == 0){return 0;}
        StringBuilder s1 = new StringBuilder(String.valueOf(x)).reverse();
        if (s1.indexOf("-") != -1) {
            s1.deleteCharAt(s1.length()-1);
            s1 = new StringBuilder("-" + s1);
        } else if (s1.indexOf("0") != -1) {
            if(s1.charAt(s1.length()-1) == '0'){
                s1.deleteCharAt(s1.length()-1);
            }
            else if(s1.charAt(0) == '0'){
                s1.deleteCharAt(0);
            }
        }
        long p = Long.parseLong(String.valueOf(s1));
        if(p > Integer.MAX_VALUE || p < Integer.MIN_VALUE){return 0;}
        return (int) p;
    }
}
