package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        StdOut.println
                (removeElements
                        (new ListNode(1,
                                new ListNode(2,
                                        new ListNode(6,
                                                new ListNode(3,
                                                        new ListNode(4,
                                                                new ListNode(5,
                                                                        new ListNode(6))))))),
                                6));
    }

    /**
     * Given the head of a linked list and an integer val,
     * <br>
     * remove all the nodes of the linked list that has
     * <br>
     * Node.val == val, and return the new head.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     * <br>
     * Space complexity <b>O(1)</b>
     *
     *
     * @param head first Node of our Single LinkedList.
     * @param val target we want to remove.
     * @return the head of the linked list.
     */
    public static ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(0);
        ListNode current = temp;
        temp.next = head;
        while (current.next != null) {
            if(current.next.val == val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return temp.next;
    }
}
