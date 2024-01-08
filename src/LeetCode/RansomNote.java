package LeetCode;

import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
        System.out.println(canConstruct("aa", "aba"));
    }

    /**
     * Given two strings ransomNote and magazine, return true if
     * ransomNote can be constructed by using the letters from
     * magazine and false otherwise.
     * Each letter in magazine can only be used once in ransomNote.
     * <br>
     * <br>
     * Complexity of <b>O(M)</b>
     *
     * @param ransomNote string to be constructed from 'magazine'.
     * @param magazine string to be used to check if its characters can create 'ransomNote'.
     * @return true if magazine can construct 'ransomNote', otherwise false.
     */
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char one = magazine.charAt(i);
            int count = map.getOrDefault(one,0);
            map.put(one, count+1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char one = ransomNote.charAt(i);
            int count = map.getOrDefault(one,0);
            if(count == 0){
                return false;
            }
            map.put(one, count-1);
        }
        return true;
    }
}
