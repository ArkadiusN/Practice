package LeetCode;

import edu.princeton.cs.algs4.StdOut;
import java.util.ArrayList;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        StdOut.println
                (deleteDuplicates
                        (new ListNode(1,
                                new ListNode(1,
                                        new ListNode(2)))));
        StdOut.println
                (deleteDuplicates
                        (new ListNode(1,
                                new ListNode(1,
                                        new ListNode(2,
                                                new ListNode(3,
                                                        new ListNode(3)))))));
    }

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * You are given the heads of two sorted
     * <br>
     * linked lists list1 and list2.
     * <br>
     * Merge the two lists into one sorted list.
     * <br>
     * The list should be made by splicing
     * <br>
     * the nodes of the first two lists.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     *
     *
     * @param head first Node of our Single LinkedList.
     * @return the head of the merged linked list.
     */
    public static ListNode deleteDuplicates(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>(); // Array to check contents of LinkedList.
        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
                list.add(head.val);
            } else {
                head = head.next;
                list.add(head.val);
            }
        }
        System.out.println(list);
        return head;
    }
}
