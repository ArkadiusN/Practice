package Other;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Exercise_1_1_11 {
    public static void main(String[] args) {
        booleanMatrix(new boolean[][]{
                {true, true, false},
                {false, false, true},
                {true, false, true}
        });
        booleanMatrix(new boolean[][]{
                {true, true, true,},
                {true, true, true},
                {true, true, true}
        });

    }

    public static void nextLine(){
        StdOut.println();
    }

    public static void booleanMatrix(boolean[][] b){
        StdOut.print("  ");
        for (int i = 0; i < b.length; i++) {
            StdOut.print(i + " ");
        }
        nextLine();
        for (int i = 0; i < b.length; i++) {
            StdOut.print(i + " ");
            for (int j = 0; j < b[i].length; j++) {
                if(b[i][j]){
                    StdOut.print("*" + " ");
                }else {
                    StdOut.print(" " + " ");
                }
            }
            nextLine();
        }
        nextLine();
    }
}
