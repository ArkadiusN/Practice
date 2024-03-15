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

    /**
     * Given a string 's', return 'true' if 's' is
     * <br>
     * a good string, or 'false' otherwise.
     * <br>
     * A string 's' is good if all the characters
     * <br>
     * that appear in 's' have the same number of
     * <br>
     * occurrences (i.e., the same frequency).
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     * <br>
     * Space complexity <b>O(N)</b>
     *
     *
     * @param s String to be checked.
     * @return true if String 's' is good, otherwise false.
     */
    public static boolean areOccurrencesEqual(String s) {
        Map<String, Integer> map = new HashMap<>();
        int maxCount = 0;
        for (int i = 0; i < s.length(); i++) {
            String g = String.valueOf(s.charAt(i));
            map.put(g, map.containsKey(g) ? map.get(g) + 1 : 1);
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
