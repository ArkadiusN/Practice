package LeetCode;

import edu.princeton.cs.algs4.StdOut;
import java.util.ArrayList;

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

    public static ListNode removeElements(ListNode head, int val) {
        ArrayList<Integer> list = new ArrayList<>(); // Array to check contents of LinkedList.
        ListNode temp = new ListNode(0);
        ListNode current = temp;
        while (current.next != null) {
            if(current.next.val == val){
                list.add(current.val);
                current.next = current.next.next;
            }
            list.add(current.val);
            current = current.next;
        }
        System.out.println(list);
        return temp.next;
    }

}
