package LeetCode;

public class ReduceNumberToZero {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
        System.out.println(numberOfSteps(8));
    }

    /**
     * Given an integer 'num', return the number of steps to reduce it to zero.
     * <br>
     * In one step, if the current number is even, you have to divide it by 2, otherwise,
     * <br>
     * you have to subtract 1 from it.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     * <br>
     * Space complexity <b>O(1)</b>
     *
     *
     * @param num value we want to reduce.
     * @return number of steps it needed to take in order to reach 0.
     */
    public static int numberOfSteps(int num) {
        int steps = 0;
        while(num > 0){
            if (num % 2 == 0) {
                num /= 2;
            }else {
                num--;
            }
            steps++;
        }
        return steps;
    }
}
