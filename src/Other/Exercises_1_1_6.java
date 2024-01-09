package Other;

import edu.princeton.cs.algs4.StdOut;

public class Exercises_1_1_6 {
    public static void main(String[] args) {
        checkProgram();
    }

    public static void checkProgram (){
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++)
        {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
