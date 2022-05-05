package com.shivaprasad.may.revision.day125;

class ListNode1 {
    int val;
    ListNode next;
    ListNode1(int x) {
        val = x;
        next = null;
    }
}
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        ListNode dummyNode = new ListNode(-101);
        ListNode currNode = dummyNode;
        while(list1!=null || list2!=null) {
            int val1 = list1!=null ? list1.val : 101;
            int val2 = list2!=null ? list2.val : 101;
            if(val1 <= val2) {
                currNode.next = new ListNode(val1);
                currNode = currNode.next;
                list1 = list1.next;
            } else {
                currNode.next = new ListNode(val2);
                currNode = currNode.next;
                list2 = list2.next;
            }
        }
        return dummyNode.next;
    }
}
