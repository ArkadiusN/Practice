package LeetCode;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {

    }


    public static int findNumbers(int[] nums) {
        int counter = 0;
        for (int num : nums) {
            String g = num + "";
            counter += (g.length() % 2 == 0) ? 1 : 0;
        }
        return counter;
    }

//    public static int findNumbers(int[] nums) {
//        int counter = 0, i = 0, j = nums.length;
//        while (i != j) {
//            String g = num+ "";
//            counter += (g.length() % 2 == 0) ? 1 : 0;
//            i++;
//            j--;
//        }
//        return counter;
//    }
}
