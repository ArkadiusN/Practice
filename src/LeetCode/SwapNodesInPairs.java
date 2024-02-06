package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class SwapNodesInPairs {
    public static void main(String[] args) {
        swapPairs
                (new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4)))));
        swapPairs
                (new ListNode(7,
                        new ListNode(4,
                                new ListNode(1,
                                        new ListNode(8)))));
        swapPairs(new ListNode(1));
        swapPairs(new ListNode());
    }

    //Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    /**
     * Given a linked list, swap every two adjacent nodes
     * <br>
     * and return its head. You must solve the problem without
     * <br>
     * modifying the values in the list's nodes (i.e., only
     * <br>
     * nodes themselves may be changed.)
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     *
     *
     * @param head first Node of our Single LinkedList.
     * @return the head of the linked list.
     */
    public static ListNode swapPairs(ListNode head) {
        ListNode current = head;
        ListNode temp = new ListNode(0);
        while (current != null && current.next != null) {
            temp.val = current.val;
            current.val = current.next.val;
            current.next.val = temp.val;
            helperMeth(current);
            current = current.next.next;
        }
        return head;
    }

    /**
     * Complexity of <b>O(1)</b>
     *
     *
     * @param current first Node of our Single LinkedList.
     */
    public static void helperMeth(ListNode current){
        StdOut.println("Current node: " + current.val);
        StdOut.println("Current.Next node: " + current.next.val + "\n");
    }
}
