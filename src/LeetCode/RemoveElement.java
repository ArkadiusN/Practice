package LeetCode;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3}, 3));
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }

    /**
     * Given an integer array 'nums' and an integer 'val', remove all occurrences of 'val' in 'nums' in-place.
     * <br>
     * The order of the elements may be changed. Then return the number of elements in 'nums' which
     * are not equal to 'val'.
     * <br>
     * Consider the number of elements in 'nums' which are not equal to 'val' be 'k',
     * to get accepted, you need to do the following things:
     * <br>
     *  <ul>
     *   <li>Change the array 'nums' such that the first 'k' elements of 'nums' contain the
     *      * elements which are not equal to val. The remaining elements of 'nums' are not
     *      * important as well as the size of 'nums'.
     *   </li>
     *   <li>Return k</li>
     * </ul>
     * Complexity of <b>O(N)</b>
     * <br>
     * Space complexity <b>O(1)</b>
     *
     *
     * @param nums array of integers.
     * @param val element to be removed.
     * @return sum of the values that are not 'val' + change array;
     */
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
