package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        System.out.println(middleNode1(new ListNode(1,new ListNode(2, new ListNode(3, new ListNode(4,new ListNode(5)))))));
        System.out.println(middleNode2(new ListNode(1,new ListNode(2, new ListNode(3, new ListNode(4,new ListNode(5, new ListNode(6))))))));
    }

    /**
     * Definition for singly-linked list by LeetCode.
     */
    private static class ListNode {
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

    /**
     * Given the head of a singly linked list, return the middle node of the linked list.
     * <br>
     * If there are two middle nodes, return the second middle node.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     * <br>
     * Space complexity <b>O(N)</b>
     *
     * @param head starting node.
     * @return middle node of the linked list.
     */
    public static ListNode middleNode1(ListNode head) {
        int size = 0;
        List<ListNode> arr = new ArrayList<>();
        while (head != null){
            arr.add(head);
            head = head.next;
            size++;
        }
        return arr.get(size/2);
    }

    /**
     * Given the head of a singly linked list, return the middle node of the linked list.
     * <br>
     * If there are two middle nodes, return the second middle node.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     * <br>
     * Space complexity <b>O(1)</b>
     *
     * @param head starting node.
     * @return middle node of the linked list.
     */
    public static ListNode middleNode2(ListNode head) {
        ListNode middle = head;
        ListNode end = head;
        while (end != null || end.next != null){
            middle = middle.next;
            end = end.next.next;
        }
        return middle;
    }
}




