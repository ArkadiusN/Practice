package Other;

import edu.princeton.cs.algs4.StdOut;

public class Exercises_1_1_5 {
    public static void main(String[] args) {
        Exercises_1_1_5 e = new Exercises_1_1_5();
        StdOut.println(e.checkRange(args[0], args[1]));
    }

    public boolean checkRange(String x, String y) {
        var x1 = Double.parseDouble(x);
        var y1 = Double.parseDouble(y);
        return (x1 > 0 && y1 > 0) && (x1 < 1 && y1 < 1);
    }
}
