package LeetCode;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class TruncateSentence {
    public static void main(String[] args) {
        StdOut.println(truncateSentence("Hello how are you Contestant", 4));
    }
    
    public static String truncateSentence(String s, int k) {
        String[] arr = new String[k];
        int i = 0;
        for (int j = 0; j < k; j++) {
            StringBuilder g = new StringBuilder();
            while (i < s.length() && !Character.isWhitespace(s.charAt(i))) {
                g.append(s.charAt(i));
                i++;
            }
            arr[j] = g + "";
            i++;
        }
        return String.join(" ", arr);
    }
}
