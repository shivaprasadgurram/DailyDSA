package com.shivaprasad.january.day11;

//Note: For Linked List problems, Just focus on method code because creating Linked List for every problem is a hectic task,
//and we don't need to worry about it.
//Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
public class RemoveDuplicatesFromSortedListII {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

 public ListNode deleteDuplicates(ListNode head) {

       ListNode dummyNode = new ListNode(-101,head);
       ListNode prev = dummyNode;

       while(head!=null)
       {
            if(head.next!=null && head.val == head.next.val)
            {
                while(head.next!=null && head.val == head.next.val)
                {
                   head = head.next;
                }

                prev.next = head.next;
            }
            else
            {
             prev = prev.next;
            }
            head = head.next;
       }

       return dummyNode.next;

       //T.C: O(n)
       //S.C: O(1)
 }
}
