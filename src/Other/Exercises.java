package Other;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercises {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]), b = Integer.parseInt(args[1]), c = Integer.parseInt(args[2]);
        if(a == b && a == c){
            StdOut.println("Equal");
        }else {
            StdOut.println("Not Equal");
        }
    }

    public static void question1and2(){
        // Give the value of each of the following expressions
        StdOut.println(( 0 + 15 ) / 2); // Integer 7
        StdOut.println(2.0e-6 * 100000000.1); //Double 200.0000002
        StdOut.println(true && false || true && true); //Boolean true

        // Give the type and value of each of the following expressions:
        StdOut.println((1 + 2.236)/2); // Float 1.618
        StdOut.println(1 + 2 + 3 + 4.0); // Double 10.0
        StdOut.println(4.1 >= 4); //Boolean true
        StdOut.println(1 + 2 + "3"); //String "33"
    }
}
