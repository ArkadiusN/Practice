package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class NumberOfSeniorCitizens {
    public static void main(String[] args) {
        StdOut.println(countSeniors2(new String[]{"7868190130M7522","5303914400F9211","9273338290F4010"}));
        StdOut.println(countSeniors2(new String[]{"1313579440F2036","2921522980M5644"}));
    }

    public static int countSeniors(String[] details) {
        int counter = 0, n;
        for (String s : details) {
            n = s.length();
            String age = s.charAt(n - 4) + "" + s.charAt(n - 3);
            if(Integer.parseInt(age) > 60) counter++;
        }
        return counter;
    }

    public static int countSeniors2(String[] details) {
        int counter = 0;
        for (String detail : details) {
            if (Integer.parseInt(detail.substring(11, 13)) > 60) counter++;
        }
        return counter;
    }
}
