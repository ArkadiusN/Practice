package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedList2 {
    public static void main(String[] args) {
        deleteDuplicates
                (new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(3,
                                                new ListNode(4,
                                                        new ListNode(4,
                                                                new ListNode(5))))))));
    }

    /**
     * Given the 'head' of a sorted linked list, delete all nodes
     * <br>
     * that have duplicate numbers, leaving only distinct numbers
     * <br>
     * from the original list. Return the linked list sorted as well.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     * <br>
     * Space complexity <b>O(N)</b>
     *
     *
     * @param head first Node of our Single LinkedList.
     * @return the head of the non-duplicate linked list.
     */
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        Map<Integer, Integer> map = new HashMap<>();
        while (current != null){
            map.put(current.val, map.containsKey(current.val) ? map.get(current.val) + 1 : 1);
            current = current.next;
        }
        ListNode currentNew = new ListNode(0);
        ListNode newCurrent = currentNew;
        current = head;
        while (current != null){
            if (map.get(current.val) == 1) {
                newCurrent.next = new ListNode(current.val);
                newCurrent = newCurrent.next;
            }
            current = current.next;
        }
        return currentNew.next;
    }
}
