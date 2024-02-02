package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class AddStrings {
    public static void main(String[] args) {
        StdOut.println(addStrings("11", "123"));
        StdOut.println(addStrings("6913259244", "71103343"));
        StdOut.println(addStrings("3876620623801494171", "6529364523802684779"));
    }

    public static String addStrings(String num1, String num2) {
        StringBuilder g, h;
        int i;
        long j;
        g = new StringBuilder();
        h = new StringBuilder();
        i = 0;
        while (i < num1.length() || i < num2.length()) {
            if(i < num1.length()) {
                g.append(num1.charAt(i));
            }
            if(i < num2.length()) {
                h.append(num2.charAt(i));
            }
            i++;
        }
        j = Long.parseLong(String.valueOf(g)) + Long.parseLong(String.valueOf(h));
        return "" + j;
    }
}
