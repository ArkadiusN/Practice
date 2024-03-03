package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class MaximumTwinSumOfALinkedList {
    public static void main(String[] args) {
        StdOut.println
                (pairSum
                        (new ListNode(5,
                                new ListNode(3,
                                        new ListNode(2,
                                                new ListNode(1))))));
        StdOut.println
                (pairSum
                        (new ListNode(4,
                                new ListNode(2,
                                        new ListNode(2,
                                                new ListNode(3))))));
    }

    /**
     * Given the 'head' of a singly linked list,
     * <br>
     * reverse the list, and return the reversed list.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     * <br>
     * Space complexity <b>O(1)</b>
     *
     *
     * @param head first Node of our Single LinkedList.
     * @return the head of reversed linked list.
     */
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    /**
     * In a linked list of size 'n', where 'n' is even, the 'ith' node
     * <br>
     * (0-indexed) of the linked list is known as the twin of the
     * <br>
     * (n-1-i)th node, if 0 <= i <= (n / 2) - 1. For example, if n = 4,
     * <br>
     * then node 0 is the twin of node 3, and node 1 is the twin of node 2.
     * <br>
     * These are the only nodes with twins for n = 4. The twin sum is
     * <br>
     * defined as the sum of a node and its twin. Given the 'head' of a
     * <br>
     * linked list with even length, return the maximum twin
     * <br>
     * sum of the linked list.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     * <br>
     * Space complexity <b>O(1)</b>
     *
     *
     * @param head first Node of our Single LinkedList.
     * @return maximum twin.
     */
    public static int pairSum(ListNode head) {
        int n = 0, i = 0, max = Integer.MIN_VALUE, sum;
        ListNode current = head;
        ListNode temp = head;
        while (head != null){
            n++;
            head = head.next;
        }
        head = temp;
        while (i < n/2){
            current = current.next;
            i++;
        }
        current = reverseList(current);
        while (head != null && current != null) {
            sum = head.val + current.val;
            max = Math.max(max, sum);
            head = head.next;
            current = current.next;
        }
        return max;
    }
}

