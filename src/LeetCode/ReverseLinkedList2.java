package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class ReverseLinkedList2 {
    public static void main(String[] args) {
        reverseBetween
                (new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5))))),2, 4);
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (left >= right) return head;

        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        int i = 1;
        while (current != null){
            if(i >= left && i <=right){
                next = current.next; // next = 3                   next = 4
                current.next = prev; // current.next = null        current.next = 2
                prev = current;      // prev = 2                   prev = 3
                current = next;      // current = 3                current  = 4
            }else {
                current = current.next;
            }
            i++;
        }
        head = prev;
//        while (head != null){
//            StdOut.print(head.val + " ");
//            head = head.next;
//        }
        return head;
    }
}
