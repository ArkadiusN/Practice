package LeetCode;

public class ReverseLinkedList {
    public static void main(String[] args) {
        reverseList(new ListNode(5,
                new ListNode(4,
                        new ListNode(3,
                new ListNode(2,
                        new ListNode(1))))));
    }
    public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
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
//        while (head != null){
//            StdOut.print(head.val + " ");
//            head = head.next;
//        }
        return head;
    }
}
