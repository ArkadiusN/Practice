package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class AddDigits {
    public static void main(String[] args) {
        StdOut.println(addDigits(38));
    }

    public static int addDigits(int num) {
        if(Integer.toString(num).length() == 1) return num;
        int sum = 0, i = 0;
        char [] c = Integer.toString(num).toCharArray();
        while (i < c.length){
            sum += Integer.parseInt(String.valueOf(c[i]));
            i++;
        }
        return addDigits(sum);
    }

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
