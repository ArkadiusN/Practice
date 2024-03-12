package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class NumberOfSeniorCitizens {
    public static void main(String[] args) {
        StdOut.println(countSeniors2(new String[]{"7868190130M7522","5303914400F9211","9273338290F4010"}));
        StdOut.println(countSeniors2(new String[]{"1313579440F2036","2921522980M5644"}));
    }

    /**
     * You are given a 0-indexed array of strings details. Each element
     * <br>
     * of details provides information about a given passenger compressed
     * <br>
     * into a string of length 15. The system is such that:
     * <br>
     * The first ten characters consist of the phone number of passengers.
     * <br>
     * The next character denotes the gender of the person.
     * <br>
     * The following two characters are used to indicate the age of the person.
     * <br>
     * The last two characters determine the seat allotted to that person.
     * <br>
     * Return the number of passengers who are strictly more than 60 years old.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     * <br>
     * Space complexity <b>O(1)</b>
     *
     *
     * @param details in the form of a String.
     * @return number of passengers who are older than 60 years old.
     */
    public static int countSeniors(String[] details) {
        int counter = 0, n;
        for (String s : details) {
            n = s.length();
            String age = s.charAt(n - 4) + "" + s.charAt(n - 3);
            if(Integer.parseInt(age) > 60) counter++;
        }
        return counter;
    }

    /**
     * Complexity of <b>O(N)</b>
     * <br>
     * Space complexity <b>O(1)</b>
     *
     *
     * @param details in the form of a String.
     * @return number of passengers who are older than 60 years old.
     */
    public static int countSeniors2(String[] details) {
        int counter = 0;
        for (String detail : details) {
            if (Integer.parseInt(detail.substring(11, 13)) > 60) counter++;
        }
        return counter;
    }
}
