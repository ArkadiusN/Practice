package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        System.out.println(mergeTwoLists(new ListNode(1, new ListNode(2, new ListNode(4))), new ListNode(1, new ListNode(3, new ListNode(4)))));
    }

    /**
     * Definition for singly-linked list by LeetCode.
     */
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

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        if(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                list1.next =  mergeTwoLists(list1.next,list2);
                return list1;
            }
            else {
                list2.next = mergeTwoLists(list1,list2.next);
                return list2;
            }
        }
        if(list1 == null)
            return list2;
        return list1;
    }


//    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        List<ListNode> arr = new ArrayList<>();
//        while (list1 != null || list2 !=null){
//
//
//            list1 = list1.next;
//
//        }
//
//
//
//
//        return list1;
//    }
}