package LeetCode;

import edu.princeton.cs.algs4.StdOut;
import java.util.HashMap;
import java.util.Map;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    public static void main(String[] args) {
        StdOut.println(areOccurrencesEqual("abacbc")); // true
        StdOut.println(areOccurrencesEqual("aaabb"));  // false
        StdOut.println(areOccurrencesEqual("vvvvvv")); // true
        StdOut.println(areOccurrencesEqual("jfdntzwmzrsurunnoezrybmtm")); // false
    }

    public static boolean areOccurrencesEqual(String s) {
        Map<String, Integer> map = new HashMap<>();
        int maxCount = 0;
        for (int i = 0; i < s.length(); i++) {
            String g = String.valueOf(s.charAt(i));
            if (map.containsKey(g)) {
                map.put(g, map.get(g) + 1);
            } else {
                map.put(g, 1);
            }
        }
        if (map.size() == 1) {
            return true;
        } else {
            for (int count : map.values()) {
                if (count != maxCount && maxCount != 0) {
                    return false;
                }
                maxCount = count;
            }
        }
        return true;
    }
}
