package LeetCode;

import java.util.Arrays;

public class MergeStringAlternately {
    public static void main(String[] args) {
        mergeAlternately("abc", "pqrs");

    }
    public static String mergeAlternately(String word1, String word2) {
        char [] newWord = new char[word1.length() + word2.length()];
        System.out.println(newWord.length);

        int i = 1;
        while (i < newWord.length){
            newWord[i] = 'o';
            i+=2;
        }

        int j = 0;
        int g = 0;
        while(j < word1.length()){
            if(newWord[g] != 'o'){
                newWord[g] = word1.charAt(j);
            } else {
                g++;
                newWord[g] = word1.charAt(j);
            }
            j++;
            g++;
        }

        int l = 0;
        int k = 1;
        while (k < word2.length()){
            if(newWord[k] == 'o'){
                newWord[k] = word2.charAt(l);
            }
            l++;
            k+=2;
        }
        System.out.println(Arrays.toString(newWord));
        return "hello";
    }
}
