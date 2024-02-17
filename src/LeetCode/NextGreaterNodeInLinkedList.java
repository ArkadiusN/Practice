package LeetCode;

import edu.princeton.cs.algs4.StdOut;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextGreaterNodeInLinkedList {
    public static void main(String[] args) {
        StdOut.println(Arrays.toString(nextLargerNodes
                (new ListNode(2,
                        new ListNode(1,
                                new ListNode(5))))));
        StdOut.println(Arrays.toString(nextLargerNodes
                (new ListNode(2,
                        new ListNode(7,
                                new ListNode(4,
                                        new ListNode(3,
                                                new ListNode(5))))))));
    }

    /**
     * You are given the 'head' of a linked list with n nodes.#
     * <br>
     * For each node in the list, find the value of the next
     * <br>
     * greater node. That is, for each node, find the value
     * <br>
     * of the first node that is next to it and has a strictly
     * <br>
     * larger value than it.
     * <br>
     * Return an integer array answer where 'answer[i]' is the
     * <br>
     * value of the next greater node of the ith node (1-indexed).
     * <br>
     * If the 'ith' node does not have a next greater node, set 'answer[i] = 0'.
     * <br>
     * <br>
     * Complexity of <b>O(N^2)</b>
     * <br>
     * Space complexity <b>O(N)</b>
     *
     *
     * @param head first Node of our Single LinkedList.
     * @return array of the next greater nodes.
     */
    public static int[] nextLargerNodes(ListNode head) {
        ListNode current = head;
        List<Integer> list = new ArrayList<>();
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }
        int [] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            int max = Integer.MIN_VALUE;
            boolean found = false;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) > list.get(i)) {
                    max = list.get(j);
                    found = true;
                    break;
                }
            }
            arr[i] = found ? max : 0;
        }
        return arr;
    }
}
