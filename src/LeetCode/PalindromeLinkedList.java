package LeetCode;

import edu.princeton.cs.algs4.StdOut;
import java.util.*;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        StdOut.println
                (isPalindrome
                        (new ListNode(1,
                                new ListNode(2,
                                        new ListNode(2,
                                                new ListNode(1)))))); // true
        StdOut.println
                (isPalindrome
                        (new ListNode(1,
                                new ListNode(2)))); // false
        StdOut.println
                (isPalindrome
                        (new ListNode(0,
                                new ListNode(0)))); // true
        StdOut.println
                (isPalindrome
                        (new ListNode(1,
                                new ListNode(0,
                                        new ListNode(1))))); // true
    }

    //Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }
        int i = 0, j = list.size() - 1;
        while (i < j) {
            if (!list.get(i).equals(list.get(j))) return false;
            i++;
            j--;
        }
        return true;
    }
}
