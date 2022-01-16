package com.shivaprasad.january.day16;

//Note: For Linked List problems, Just focus on method code because creating Linked List for every problem is a hectic task,
//and we don't need to worry about it.
//Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
public class RemoveDuplicatesFromSortedListUsingDummyNode {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) {

        if(head == null || head.next == null)
            return head;

        ListNode dummyNode = new ListNode(-101);
        dummyNode.next = head;
        ListNode prevNode = dummyNode;
        ListNode currNode = head;

        while(currNode!=null)
        {
            if(prevNode.val == currNode.val)
            {
                prevNode.next = currNode.next;
            }
            else
            {
                prevNode = currNode;

            }
            currNode = currNode.next;
        }

        return dummyNode.next;

        //T.C: O(n)
        //S.C: O(1)
    }
}
