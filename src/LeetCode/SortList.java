package LeetCode;

import edu.princeton.cs.algs4.StdOut;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        sortList
                (new ListNode(-1,
                        new ListNode(5,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(0))))));
        sortList
                (new ListNode(4,
                        new ListNode(2,
                                new ListNode(1,
                                        new ListNode(3)))));
    }

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public static ListNode sortList(ListNode head) {
        ListNode current = new ListNode(0);
        current.next = head;
        List<Integer> list = new ArrayList<>();
        while (current.next != null){
            list.add(current.next.val);
            current = current.next;
        }
        Collections.sort(list);
        StdOut.println(list);
        current = head;
        int i = 0;
        while (current != null){
            current.val = list.get(i);
            StdOut.println(current.val);
            i++;
            current = current.next;
        }
        return head;
    }
}
