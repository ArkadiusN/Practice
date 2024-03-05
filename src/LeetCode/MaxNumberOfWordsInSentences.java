package LeetCode;

public class MaxNumberOfWordsInSentences {
    public static void main(String[] args) {
        mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"});
        mostWordsFound(new String[]{"please wait", "continue to fight", "continue to win"});
    }

    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sentence : sentences) {
            int counter = 0;
            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(j) == ' ') {
                    counter++;
                }
            }
            if (counter > max) {
                max = counter;
            }
        }
        return max+1;
    }
}
