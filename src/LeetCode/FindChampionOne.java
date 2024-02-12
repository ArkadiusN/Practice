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

    /**
     * There are n teams numbered from 0 to n - 1 in a tournament.
     * Given a 0-indexed 2D boolean matrix grid of size n * n.
     * For all 'i', 'j' that 0 <= i, j <= n - 1 and i != j team 'i' is stronger
     * than team 'j' if grid[i][j] == 1, otherwise, team 'j' is stronger than team 'i'.
     * <br>
     * Team a will be the champion of the tournament if there is no
     * team b that is stronger than team a.
     * <br>
     * Return the team that will be the champion of the tournament.
     * <br>
     * <br>
     * Complexity of <b>O(N^2)</b>
     * <br>
     * Space complexity <b>O(1)</b>
     *
     *
     * @param grid 0-indexed 2d boolean matrix.
     * @return team that is a champion.
     */
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
