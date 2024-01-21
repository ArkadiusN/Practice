package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class HappyNumber {
    public static void main(String[] args) {
        StdOut.println(isHappy(19));
        StdOut.println(isHappy(2));
        StdOut.println(isHappy(7));
    }


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
