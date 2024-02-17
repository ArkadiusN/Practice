package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        StdOut.println
                (mergeTwoLists
                        (new ListNode(1,
                                new ListNode(2,
                                        new ListNode(4))),
                                new ListNode(1,
                                        new ListNode(3,
                                                new ListNode(4)))));
    }

    /**
     * You are given the heads of two sorted
     * <br>
     * linked lists list1 and list2.
     * <br>
     * Merge the two lists into one sorted list.
     * <br>
     * The list should be made by splicing together
     * <br>
     * the nodes of the first two lists.
     * <br>
     * Return the head of the merged linked list.
     * <br>
     * <br>
     * Complexity of <b>O(M + N)</b>
     * <br>
     * Space complexity <b>O(M + N)</b>
     *
     *
     * @param list1 sorted linked list one.
     * @param list2 sorted linked list two.
     * @return head of merged linked list.
     */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        if(list1 != null && list2 != null) { // M and N is the length of each linked list.
            if(list1.val < list2.val) {
                list1.next =  mergeTwoLists(list1.next,list2);
                return list1;
            }
            else {
                list2.next = mergeTwoLists(list1,list2.next);
                return list2;
            }
        }
        if(list1 == null)
            return list2;
        return list1;
    }
}
