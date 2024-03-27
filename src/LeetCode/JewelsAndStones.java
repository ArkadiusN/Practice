package LeetCode;

import edu.princeton.cs.algs4.StdOut;
import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones {
    public static void main(String[] args) {
        StdOut.println(numJewelsInStones("aA", "aAAbbbb"));
        StdOut.println(numJewelsInStones("z", "ZZ"));
        StdOut.println(numJewelsInStones("ebd", "bbb"));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> map = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < jewels.length(); i++) {
            map.put(jewels.charAt(i), 0);
        }
        for (int i = 0; i < stones.length(); i++) {
            if(map.containsKey(stones.charAt(i))){
                map.put(stones.charAt(i), map.get(stones.charAt(i)) + 1);
            }
        }
        for (int count : map.values()) {
            counter += count;
        }
        return counter;
    }
}
