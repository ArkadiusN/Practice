package LeetCode;

import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseWordsInString {
    public static void main(String[] args) {
        StdOut.println(reverseWords("the sky is blue"));
        StdOut.println(reverseWords("a good   example"));
    }

    public static String reverseWords(String s) {
        List<String> list = new ArrayList<>();
        s += " ";
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < s.length(); k++) {
            if(!Character.isSpaceChar(s.charAt(k))){
                stringBuilder.append(s.charAt(k));
            } else if (Character.isSpaceChar(s.charAt(k))) {
                list.add(stringBuilder.toString());
                stringBuilder = new StringBuilder();
            }
        }
        StringBuilder reverse = new StringBuilder();
        for (int i = list.size()-1; i >= 0; i--) {
            reverse.append(list.get(i)).append(" ");
        }
        String l = reverse.substring(0,reverse.length()-1).trim().replaceAll(" +", " ");


        return l;
    }
}
