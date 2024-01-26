package LeetCode;

import edu.princeton.cs.algs4.StdOut;
import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInString {
    public static void main(String[] args) {
        StdOut.println(reverseWords("the sky is blue"));
        StdOut.println(reverseWords("a good   example"));
        StdOut.println(reverseWords(" hello world "));
    }

    /**
     * Given an input string 's', reverse the order of the words.
     * <br>
     * A word is defined as a sequence of non-space characters.
     * <br>
     * The words in 's' will be separated by at least one space.
     * <br>
     * Return a string of the words in reverse order concatenated
     * <br>
     * by a single space. Note that 's' may contain leading or trailing
     * <br>
     * spaces or multiple spaces between two words. The returned string
     * <br>
     * should only have a single space separating the words. Do not
     * <br>
     * include any extra spaces.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     *
     *
     * @param s String to reverse words from.
     * @return String with words reversed
     */
    public static String reverseWords(String s){
        s += ' ';
        String [] separateWords = new String[s.length()];
        int i = 0, j = separateWords.length-1;
        String word = "";
        while(i <= s.length()-1){
            if(s.charAt(i) != ' ') word += String.valueOf(s.charAt(i));
            else{
                separateWords[j] = word;
                word = "";
            }
            i++;
            j--;
        }
        for (String separateWord : separateWords) {
            if (separateWord != null) word += separateWord + ' ';
        }
        return word.trim().replaceAll(" +", " ");
    }

    /**
     * Complexity of <b>O(N)</b>
     *
     *
     * @param s String to reverse words from.
     * @return String with words reversed
     */
    public static String reverseWords2(String s) {
        List<String> list = new ArrayList<>();
        s += " ";
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < s.length(); k++) {
            if(!Character.isSpaceChar(s.charAt(k))) stringBuilder.append(s.charAt(k));
            else if (Character.isSpaceChar(s.charAt(k))) {
                list.add(stringBuilder.toString());
                stringBuilder = new StringBuilder();
            }
        }
        stringBuilder.reverse();
        for (int i = list.size()-1; i >= 0; i--) {
            stringBuilder.append(list.get(i)).append(" ");
        }
        return stringBuilder
                .substring(0, stringBuilder.length() - 1)
                .trim()
                .replaceAll(" +", " ");
    }
}
