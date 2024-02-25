package LeetCode;

public class ReverseLinkedList {
    public static void main(String[] args) {
        reverseList
                (new ListNode(5,
                        new ListNode(4,
                                new ListNode(3,
                                        new ListNode(2,
                                                new ListNode(1))))));
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
}
