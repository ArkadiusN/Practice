package LeetCode;

public class DeleteNodeInLinkedList {
    public static void main(String[] args) {
        ListNode l = new ListNode(4);
        l.next = new ListNode(5);
        l.next.next = new ListNode(1);
        l.next.next.next = new ListNode(9);
        deleteNode(new ListNode(5));
    }

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
