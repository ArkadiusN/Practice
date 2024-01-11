package Other;

import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_1_9 {
    public static void main(String[] args) {
        intAsBinary(4);
        intAsBinary(8);
        intAsBinary(23);
    }

    public static void intAsBinary(int n){
        String s = "";
        for ( ;n > 0; n/=2) {
            s = (n%2) + s;
        }
        StdOut.println(s);
    }
}
