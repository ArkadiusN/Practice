package LeetCode;

import edu.princeton.cs.algs4.StdOut;
import java.util.ArrayList;
import java.util.List;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        StdOut.println(reverseVowels("hello"));
        StdOut.println(reverseVowels("leetcode"));
    }

    public static String reverseVowels(String s) {
        List<Character> vowels = new ArrayList<>(s.length());
        StringBuilder str = new StringBuilder();
        for(int i=0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'
                        -> vowels.add(s.charAt(i));
            }
        }
        int j = vowels.size()-1;
        for(int i=0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'
                        -> str.append(vowels.get(j--));
                default
                        -> str.append(s.charAt(i));
            }
        }
        return str + "";
    }
}
