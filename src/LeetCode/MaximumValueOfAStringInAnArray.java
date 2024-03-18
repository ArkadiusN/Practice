package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class MaximumValueOfAStringInAnArray {
    public static void main(String[] args) {
        StdOut.println(maximumValue(new String[]{"alic3","bob","3","4","00000"}));
        StdOut.println(maximumValue(new String[]{"1","01","001","0001"}));
    }

    public static int maximumValue(String[] strs) {
        int m = Integer.MIN_VALUE;
        for (int i = 0; i < strs.length; i++) {
            int g = strs[i].length();
            m = Math.max(m, g);
        }
        int j = 0;
        StringBuilder stringBuilder = new StringBuilder("1");
        for (int i = 0; i < strs.length; i++) {
            String p = strs[i];
            while (j != p.length() && Character.isDigit(p.charAt(j))){
                stringBuilder.append(p.charAt(j));
                j++;
            }
            if(m > Integer.parseInt(String.valueOf(stringBuilder))){
                return m;
            }else if(m < Integer.parseInt(String.valueOf(stringBuilder))){
                return Integer.parseInt(String.valueOf(stringBuilder));
            }
            stringBuilder = new StringBuilder();
        }
        return 0;
    }
}
