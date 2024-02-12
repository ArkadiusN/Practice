package LeetCode;

public class DeleteNodeInLinkedList {
    public static void main(String[] args) {
        ListNode2 l = new ListNode2(4);
        l.next = new ListNode2(5);
        l.next.next = new ListNode2(1);
        l.next.next.next = new ListNode2(9);
        deleteNode(new ListNode2(5));
    }

    /**
     * There is a singly-linked list 'head' and we want
     * <br>
     * to delete a node 'node' in it.
     * <br>
     * You are given the node to be deleted 'node'. You
     * <br>
     * will not be given access to the first node of 'head'.
     * <br>
     * All the values of the linked list are unique, and it
     * <br>
     * is guaranteed that the given node 'node' is not the
     * <br>
     * last node in the linked list.
     * <br>
     * Delete the given node. Note that by deleting the node,
     * <br>
     * we do not mean removing it from memory. We mean:
     * <br>
     *  <ul>
     *   <li>The value of the given node should not exist in the linked list.</li>
     *   <li>The number of nodes in the linked list should decrease by one.</li>
     *   <li>All the values before 'node' should be in the same order.</li>
     *   <li>All the values after 'node' should be in the same order.</li>
     * </ul>
     * Custom testing:
     *  <ul>
     *     <li>For the input, you should provide the entire linked list 'head' and the node
     *     to be given 'node'. 'node' should not be the last node of the list and should be
     *     an actual node in the list.</li>
     *     <li>We will build the linked list and pass the node to your function.</li>
     *     <li>The output will be the entire list after calling your function.</li>
     * </ul>
     * Complexity of <b>O(1)</b>
     * <br>
     * Space complexity <b>O(1)</b>
     *
     *
     * @param node is the node to be deleted.
     */
    public static void deleteNode(ListNode2 node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
