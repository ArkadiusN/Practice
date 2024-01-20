package LeetCode;

import edu.princeton.cs.algs4.StdOut;

public class AddTwoNumbers {
    public static void main(String[] args) {
        StdOut.println(addTwoNumbers(
                new ListNode(2,new ListNode(4, new ListNode(3))),
                new ListNode(5,new ListNode(6, new ListNode(4)))
        ));
//        StdOut.println(addTwoNumbers(
//                new ListNode(0),
//                new ListNode(0)
//        ));
//        StdOut.println(addTwoNumbers(
//                new ListNode(9,new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))),
//                new ListNode(9,new ListNode(9, new ListNode(9, new ListNode(9))))
//        ));
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder one = new StringBuilder(), two = new StringBuilder();
        if(l1.next == null && l2.next == null){
            return new ListNode(l1.val + l2.val);
        }
        while (l1 != null){
            one.append(l1.val);
            l1 = l1.next;
        }
        while (l2 != null){
            two.append(l2.val);
            l2 = l2.next;
        }
        one.reverse();
        two.reverse();
        int g = Integer.parseInt(String.valueOf(one)) + Integer.parseInt(String.valueOf(two));
        StringBuilder three = new StringBuilder(String.valueOf(g));
        three.reverse();

        int i = 0;
        ListNode resultNode = new ListNode(0);
        ListNode t = resultNode;
        while(i < three.length()){
            t.next = new ListNode(Integer.valueOf(String.valueOf(three.toString().charAt(i))));
            t = t.next;
            i++;
        }
        return resultNode.next;
    }
}
