package LeetCode;

public class AddTwoNumbers2 {
    public static void main(String[] args) {
        addTwoNumbers
                (new ListNode(7,
                        new ListNode(2,
                                new ListNode(4,
                                        new ListNode(3)))),
                        new ListNode(5,
                                new ListNode(6,
                                        new ListNode(4))));
    }

    /**
     * You are given two non-empty linked lists representing
     * <br>
     * two non-negative integers. The most significant digit
     * <br>
     * comes first and each of their nodes contains a single
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
        ListNode list1 = l1, list2 = l2;
        StringBuilder n = new StringBuilder(), m = new StringBuilder();
        while (list1 != null || list2 != null) {
            if (list1 != null) {
                n.append(list1.val);
                list1 = list1.next;
            }else {
                m.append(list2.val);
                list2 = list2.next;
            }
        }
        String s = new java.math.BigInteger(n + "").add(new java.math.BigInteger(m + "")) + "";
        int size = 0;
        ListNode resultNode = new ListNode(0);
        ListNode t = resultNode;
        while(size < s.length()){
            t.next = new ListNode(Integer.parseInt(String.valueOf(s.charAt(size++))));
            t = t.next;
        }
        return resultNode.next;
    }
}
