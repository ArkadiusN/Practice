package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class AddTwoNumbers {
    public static void main(String[] args) {
        StdOut.println(addTwoNumbers
                (new ListNode(2,
                                new ListNode(4,
                                        new ListNode(3))),
                        new ListNode(5,
                                new ListNode(6,
                                        new ListNode(4)))));
        StdOut.println(addTwoNumbers
                (new ListNode(0),
                        new ListNode(0)));
        StdOut.println(addTwoNumbers
                (new ListNode(9,
                                new ListNode(9,
                                        new ListNode(9,
                                                new ListNode(9,
                                                        new ListNode(9,
                                                                new ListNode(9,
                                                                        new ListNode(9))))))),
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(9,
                                                new ListNode(9))))));
    }

    /**
     * You are given two non-empty linked lists representing
     * <br>
     * two non-negative integers. The digits are stored in
     * <br>
     * reverse order, and each of their nodes contains a single
     * <br>
     * digit. Add the two numbers and return the sum as a linked list.
     * <br>
     * You may assume the two numbers do not contain any leading zero,
     * <br>
     * except the number 0 itself.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     * <br>
     * Space complexity <b>O(N)</b>
     *
     *
     * @param l1 first Node of 'l1' Single LinkedList.
     * @param l2 first Node of 'l2' Single LinkedList.
     * @return sum as Single LinkedList.
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder n = new StringBuilder(), m = new StringBuilder();
        int size = 0;
        while (l1 != null){
            n.append(l1.val);
            l1 = l1.next;
        }
        while (l2 != null){
            m.append(l2.val);
            l2 = l2.next;
        }
        n.reverse();
        m.reverse();
        char [] i = new StringBuilder
                (new java.math.BigInteger(String.valueOf(n)).add(new java.math.BigInteger(String.valueOf(m))) + "")
                .reverse()
                .toString()
                .toCharArray();

        ListNode resultNode = new ListNode(0);
        ListNode t = resultNode;
        while(size < i.length){
            t.next = new ListNode(Integer.parseInt(String.valueOf(i[size])));
            t = t.next;
            size++;
        }
        return resultNode.next;
    }
}
