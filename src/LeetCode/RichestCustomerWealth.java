package LeetCode;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][]
                {{1,2,3},
                {1,2,4}}
        ));
        System.out.println(maximumWealth(new int[][]
                {{1,5},
                {7,3},
                {3,5}}
        ));
        System.out.println(maximumWealth(new int[][]
                {{2,8,7},
                {7,1,3},
                {1,9,5}}
        ));
    }

    /**
     * You are given an m * x integer grid 'accounts' where 'accounts[i][j]'
     * <br>
     * is the amount of money the 'ith' customer has in the 'jth' bank.
     * <br>
     * Return the wealth that the richest customer has. A customer's wealth
     * <br>
     * is the amount of money they have in all their bank accounts. The richest
     * <br>
     * customer is the customer that has the maximum wealth.
     * <br>
     * <br>
     * Complexity of <b>O(N * M)</b>
     *
     * @param accounts the integer grid with the amount of money each customer has in 'jth' bank.
     * @return the sum of bank accounts that is the largest.
     */
    public static int maximumWealth(int[][] accounts){
        int richest = Integer.MIN_VALUE;
        int temp = 0;
        for (int i = 0; i < accounts.length ; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];
            }
            if (temp > richest){
                richest = temp;
            }
            temp = 0;
        }
        return richest;
    }
}
