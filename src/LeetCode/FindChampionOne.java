package LeetCode;

public class FindChampionOne {
    public static void main(String[] args) {
        System.out.println(findChampion(new int[][]
                {{0,1},
                 {0,0}}
        ));
        System.out.println(findChampion(new int[][]
                {{0,0},
                 {1,0}}
        ));
        System.out.println(findChampion(new int[][]
                {{0,0,0},
                 {1,0,1},
                 {0,0,0}}
        ));
        System.out.println(findChampion(new int[][]
                {{0,0,0},
                 {1,0,1},
                 {1,0,0}}
        ));
        System.out.println(findChampion(new int[][]
                {{1,1,0},
                 {1,0,0},
                 {1,1,0}}
        ));
    }

    public static int findChampion(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            boolean isChampion = true;
            for (int j = 0; j < grid.length; j++) {
                if (i != j && grid[j][i] == 1) {
                    isChampion = false;
                    break;
                }
            }
            if (isChampion) {
                return i;
            }
        }
        return -1;
    }
}
