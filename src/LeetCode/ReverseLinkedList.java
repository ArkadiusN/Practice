package LeetCode;

public class ReverseLinkedList {
    public static void main(String[] args) {
        reverseList(new ListNode(5,
                new ListNode(4,
                        new ListNode(3,
                new ListNode(2,
                        new ListNode(1))))));
    }

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
