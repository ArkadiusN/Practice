package Other;

import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;

public class Exercise_1_1_10 {
    public static void main(String[] args) {
        StdOut.println(Arrays.toString(checkMethod()));
    }

    public static int[] checkMethod(){
        int[] a = new int[16];
        for (int i = 0; i < 10; i++) {
            a[i] = i * i;
        }
        return a;
    }
}
