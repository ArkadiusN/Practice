package LeetCode;

public class GreatestCommonDivisorOfStrings {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));
        System.out.println(gcdOfStrings("ABCDEF", "ABC"));
        System.out.println(gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX",
                                        "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
    }

    /**
     * For two strings 's' and 't', we say "t divides s" if and only if s = t + ... + t (i.e.,
     * <br>
     * t is concatenated with itself one or more times).
     * Given two strings 'str1' and 'str2', return the largest string 'x' such that
     * 'x' divides both 'str1' and 'str2'.
     * <br>
     * <br>
     * Complexity of <b>O(A+B)</b>
     * <br>
     * Space complexity <b>O(A+B)</b>
     *
     *
     * @param str1 string one.
     * @param str2 string two.
     * @return largest string that can divide both 'str1' and 'str2'
     */
    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1.concat(str2)).equals(str2.concat(str1)))
            return "";
        int gcd = findGCD(str1.length(), str2.length()); // A+B is the length of two string (could be written as "N").
        return str1.substring(0, gcd);
    }

    /**
     * Euclid’s algorithm is calculating the
     * <br>
     * greatest common divisor of two integers.
     * <br>
     * <br>
     * Complexity of <b>O(A+B)</b>
     * <br>
     * Space complexity <b>O(1)</b>
     *
     *
     * @param a integer one.
     * @param b integer two.
     * @return greatest common divisor of 'a' and 'b'.
     */
    public static int findGCD(int a, int b) {
        while(b != 0) {
            if(a > b) {
                a = a - b;
            }
            else {
                b = b - a;
            }
        }
        return a;
    }
}
