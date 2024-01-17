package LeetCode;

import java.util.Scanner;

public class CheckSumOfUserEvenNum {
    public static String Main(String arg) {
        char [] g = new char[arg.length()];
        int sum = 0;
        for (int i = 0; i < g.length; i++) {
            if(arg.charAt(i) == (int) arg.charAt(i) && arg.charAt(i) != ' ' && arg.charAt(i) %2 ==0){
                sum += Integer.parseInt(String.valueOf(arg.charAt(i)));
            }
        }
        return String.valueOf(sum);
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(Main(s.nextLine()));
    }
}
