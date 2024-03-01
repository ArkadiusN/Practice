package LeetCode;

public class InsertGreatestCommonDivisorInLinkedList {
    public static void main(String[] args) {
        insertGreatestCommonDivisors
                (new ListNode(18,
                        new ListNode(6,
                                new ListNode(10,
                                        new ListNode(3)))));
        insertGreatestCommonDivisors
                (new ListNode(7));
    }

    /**
     * Given the head of a linked list 'head',
     * <br>
     * in which each node contains an integer value.
     * <br>
     * Between every pair of adjacent nodes, insert a
     * <br>
     * new node with a value equal to the greatest common divisor of them.
     * <br>
     * Return the linked list after insertion.
     * <br>
     * The greatest common divisor of two numbers is the largest positive
     * <br>
     * integer that evenly divides both numbers.
     * <br>
     * <br>
     * Complexity of <b>O(N)</b>
     * <br>
     * Space complexity <b>O(1)</b>
     *
     *
     * @param head first Node of our Single LinkedList.
     * @return the linked list after insertion.
     */
    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode prev = null, current = head, temp;
        while (current.next != null){
            prev = current;
            current = current.next;
            temp = new ListNode(findGCD(prev.val, current.val));
            temp.next = prev.next;
            prev.next = temp;
        }
        return head;
    }

    /**
     * Euclid’s algorithm is calculating the
     * <br>
     * greatest common divisor of two integers.
     * <br>
     * <br>
     * Complexity of <b>O(A+B)</b>
     * <br>
     * Space complexity <b>O(1)</b>
     *
     *
     * @param a integer one.
     * @param b integer two.
     * @return greatest common divisor of 'a' and 'b'.
     */
    public static int findGCD(int a, int b) {
        while(b != 0) {
            if(a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
