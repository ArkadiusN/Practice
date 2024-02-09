package LeetCode;

import java.util.ArrayList;
import java.util.Collections;

public class SwappingNodesInALinkedList {
    public static void main(String[] args) {
        swapNodes
                (new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5))))),2);
        swapNodes
                (new ListNode(100,
                        new ListNode(90)),2);
        swapNodes
                (new ListNode(1),1);
        swapNodes
                (new ListNode(7,
                        new ListNode(9,
                                new ListNode(6,
                                        new ListNode(6,
                                                new ListNode(7,
                                                        new ListNode(8,
                                                                new ListNode(3,
                                                                        new ListNode(0,
                                                                                new ListNode(9,
                                                                                        new ListNode(5)))))))))),5);
        swapNodes
                (new ListNode(100,
                        new ListNode(24,
                                new ListNode(24,
                                        new ListNode(36,
                                                new ListNode(18,
                                                        new ListNode(52,
                                                                new ListNode(95,
                                                                        new ListNode(61,
                                                                                new ListNode(54,
                                                                                        new ListNode(88,
                                                                                                new ListNode(86,
                                                                                                        new ListNode(79,
                                                                                                                new ListNode(11,
                                                                                                                        new ListNode(1,
                                                                                                                                new ListNode(31,
                                                                                                                                        new ListNode(26)))))))))))))))),16);
    }

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode swapNodes(ListNode head, int k) {
        ListNode current = new ListNode(0);
        current.next = head;
        ArrayList<Integer> list = new ArrayList<>();
        while (current.next != null){
            list.add(current.next.val);
            current = current.next;
        }
        if(list.size() == 1){
            return head;
        }
        Collections.swap(list, k - 1, list.size() - k);
        current = head;
        int i = 0;
        while (current != null){
            current.val = list.get(i);
            i++;
            current = current.next;
        }
        return head;
    }

    public static ListNode swapNodes2(ListNode head, int k) {
        ListNode current = new ListNode(0);
        current.next = head;
        ArrayList<Integer> list = new ArrayList<>();
        while (current.next != null){
            list.add(current.next.val);
            current = current.next;
        }
        if(list.size() == 1){
            return head;
        }
        swapNumbers(list, k - 1, list.size() - k);
        current = head;
        int i = 0;
        while (current != null){
            current.val = list.get(i);
            i++;
            current = current.next;
        }
        return head;
    }

    public static void swapNumbers(ArrayList<Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
}
