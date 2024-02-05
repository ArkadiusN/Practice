package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class ConvertBinaryNumInLinkedListToInt {
    public static void main(String[] args) {
        StdOut.println(getDecimalValue(new ListNode(1, new ListNode(0, new ListNode(1)))));
        StdOut.println(getDecimalValue(new ListNode(0)));
        StdOut.println(getDecimalValue(new ListNode(1, new ListNode(0, new ListNode(1, new ListNode(1))))));
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

    /**
     * Given head which is a reference node to a singly-linked list.
     * <br>
     * The value of each node in the linked list is either 0 or 1.
     * <br>
     * The linked list holds the binary representation of a number.
     * <br>
     * Return the decimal value of the number in the linked list.
     * <br>
     * The most significant bit is at the head of the linked list.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     * <br>
     * Space complexity <b>O(N)</b>
     *
     *
     * @param head first Node of our Single LinkedList.
     * @return decimal value of the number in Single LinkedList.
     */
    public static int getDecimalValue(ListNode head) {
        StringBuilder str = new StringBuilder();
        while (head != null) {
            str.append(head.val);
            head = head.next;
        }
        return Integer.parseInt(str.toString() , 2);
    }

    /**
     * Complexity of <b>O(N * K)</b>
     * <br>
     * Space complexity <b>O(N)</b>
     *
     *
     * @param head first Node of our Single LinkedList.
     * @return decimal value of the number in Single LinkedList.
     */
    public static int getDecimalValue2(ListNode head) {
        String str = "";
        while (head != null) {
            str = str.concat("" + head.val); // concat() takes "K" times to iterate on each loop.
            head = head.next;
        }
        return Integer.parseInt(str , 2);
    }
}
