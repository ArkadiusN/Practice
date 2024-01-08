package LeetCode;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{0,1,0,3,2,3}));
        System.out.println(lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
        System.out.println(lengthOfLIS(new int[]{7,7,7,7,7}));
        System.out.println(lengthOfLIS(new int[]{1,2,7,7,7}));
        System.out.println(lengthOfLIS(new int[]{0}));
    }

    public static int lengthOfLIS(int[] nums) {
        int lowest = Integer.MAX_VALUE;
        int count = 0;
        int back = 0;
        int back2 = 0;
        if(nums.length == 1){
            return 1;
        }
        for (int i = 1; i < nums.length; i++) {
            back = nums[nums.length-1];
            back2 = nums[nums.length-2];
            if(lowest > nums[i-1]){
                lowest = nums[i-1];
            }
            if(lowest < nums[i]){
                count++;
            }
            if(nums[i-1] == nums[i]){
                return 1;
            }
        }
        if(back < back2){
            count = count - 1;
        }
        return count;
    }
}
