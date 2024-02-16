package LeetCode;

public class RemoveNthNodeFromTheEndOfList {
    public static void main(String[] args) {
        removeNthFromEnd
                (new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5))))), 2);
        removeNthFromEnd
                (new ListNode(1,
                        new ListNode(2)), 1);
        removeNthFromEnd
                (new ListNode(1), 1);
        removeNthFromEnd
                (new ListNode(1,
                        new ListNode(2)), 2);
    }

    /**
     * Given the head of a linked list, remove the nth
     * <br>
     * node from the end of the list and return its head.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     * <br>
     * Space complexity <b>O(1)</b>
     *
     *
     * @param head first Node of our Single LinkedList.
     * @param n node to delete from the end of LinkedList.
     * @return the head of the linked list.
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        int counter1 = 0, i = 0;
        while (current != null){
            counter1++;
            current = current.next;
        }
        counter1 -= n;

        if(counter1 == 0) return head.next;

        current = head;
        while (i < counter1-1){
            current = current.next;
            i++;
        }
        current.next = current.next.next;

        return head;
    }

// ***NOTE***
//      if (head != null && head.next == null && n == 1) {
//          return null;
//      }
//      ListNode current = head;
//      int counter1 = 0;
//      while (current != null){
//          counter1++;
//          current = current.next;
//      }
//      current = head;
//      counter1 -= n;
//      while (current != null){
//          if(counter1-1 == counter2){
//              current.next = current.next.next;
//          }
//          current = current.next;
//      }
//      current = head;
//      while (current != null){
//          current = current.next;
//      }
//      return head;
}
