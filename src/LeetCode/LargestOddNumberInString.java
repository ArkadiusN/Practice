package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class LargestOddNumberInString {
    public static void main(String[] args) {
        StdOut.println(largestOddNumber("52"));
        StdOut.println(largestOddNumber("4206"));
        StdOut.println(largestOddNumber("35427"));
        StdOut.println(largestOddNumber("10133890"));
        StdOut.println(largestOddNumber("12"));
    }

    public static String largestOddNumber(String num) {
        int i = num.length()-1;
        while (i >= 0){
            if(num.charAt(i) % 2 != 0){
                return num.substring(0, i+1);
            }
            i--;
        }
        return "";
    }
}
