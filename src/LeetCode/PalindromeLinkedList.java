package LeetCode;

import edu.princeton.cs.algs4.StdOut;
import java.util.List;
import java.util.ArrayList;

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

    /**
     * Given the head of a singly linked list,
     * <br>
     * return true if it is a palindrome
     * <br>
     * or false otherwise.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     * <br>
     * Space complexity <b>O(N)</b>
     *
     *
     * @param head first Node of our Single LinkedList.
     * @return true for palindrome, otherwise false.
     */
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
