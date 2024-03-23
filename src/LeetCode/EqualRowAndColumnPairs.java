package LeetCode;

import edu.princeton.cs.algs4.StdOut;
import java.util.HashMap;
import java.util.Map;

public class EqualRowAndColumnPairs {
    public static void main(String[] args) {
        StdOut.println(equalPairs(new int[][]{  {3,2,1},
                                                {1,7,6},
                                                {2,7,7}}));
        StdOut.println(equalPairs(new int[][]{  {3,1,2,2},
                                                {1,4,4,5},
                                                {2,4,2,2},
                                                {2,4,2,2}}));
        StdOut.println(equalPairs(new int[][]{  {3,1,2,2},
                                                {1,4,4,4},
                                                {2,4,2,2},
                                                {2,5,2,2}}));
        StdOut.println(equalPairs(new int[][]{  {13,13},
                                                {13,13}}));
        StdOut.println(equalPairs(new int[][]{  {11,1},
                                                {1,11}}));
    }

    public static int equalPairs(int[][] grid) {
        Map<String, Integer> map = new HashMap<>(), map2 = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < grid.length; i++) {
            StringBuilder currentNum = new StringBuilder();
            for (int j = 0; j < grid[i].length; j++) {
                currentNum.append(grid[i][j]);
                currentNum.append(" ");
            }
            map.put(currentNum.toString(), map.getOrDefault(currentNum.toString(), 0) + 1);
        }
        for (int i = 0; i < grid.length; i++) {
            StringBuilder currentNum = new StringBuilder();
            for (int j = 0; j < grid[i].length; j++) {
                currentNum.append(grid[j][i]);
                currentNum.append(" ");
            }
            map2.put(currentNum.toString(), map2.getOrDefault(currentNum.toString(), 0) + 1);
        }
        System.out.println(map);
        System.out.println(map2);
        for(String str : map.keySet()) {
            counter += map2.containsKey(str) ? map.get(str) * map2.get(str) : 0;
        }
        return counter;
    }

}

