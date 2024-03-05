package LeetCode;

public class MinLengthOfStringAfterDeletingSimilarEnds {
    public static void main(String[] args) {
        minimumLength("aabccabba");
    }

    public static int minimumLength(String s) {
        int i = 0;
        int n = s.length()-1;
        String str1 = String.valueOf(s.charAt(i));
        String str2 = String.valueOf(s.charAt(n));
        while(n != i && str1.equals(str2)){
            if(s.charAt(i) == s.charAt(i+1)){
                str1 += String.valueOf(s.charAt(i+1));
            }
            if(s.charAt(n) == s.charAt(n-1)){
                str2 += String.valueOf(s.charAt(n-1));
            }
            s.replaceFirst(str1, " ");
            s.replaceFirst(str2, " ");
            n--;
            i++;
        }

        return -1;
    }
}
