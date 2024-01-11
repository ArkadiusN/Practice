package Other;

import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_1_3 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]),
                b = Integer.parseInt(args[1]),
                c = Integer.parseInt(args[2]);
        if (a == b && a == c) {
            StdOut.println("Equal");
        } else {
            StdOut.println("Not Equal");
        }
    }
}
