package Other;

import edu.princeton.cs.algs4.StdOut;

public class Exercises_1_1_7 {
    public static void main(String[] args) {
        check();
        check2();
        check3();
    }

    public static void check(){
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001) //9.0 - 9.0 / 9.0 > .001 |
            t = (9.0/t + t) / 2.0; //t = 9.0 / 9.0 = 1 + 9.0 / 2.0 = 5.0
        StdOut.printf("%.5f\n", t);
    }

    public static void check2(){
        int sum = 0;
        for (int i = 1; i < 1000; i++)  // 1 to 999 | 1000 values excluding 0
            for (int j = 0; j < i; j++) // 0 to 999 | 1000 values
                sum++;
        StdOut.println(sum);
    }

    public static void check3(){
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2)
            for (int j = 0; j < i; j++)
                sum++;
        StdOut.println(sum);
    }

}
