package com.shivaprasad.january.day10;

//Note: For Linked List problems, Just focus on method code because creating Linked List for every problem is a hectic task,
//and we don't need to worry about it.
//Problem Link: https://leetcode.com/problems/merge-two-sorted-lists/submissions/
public class MergeTwoSortedLists {

      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;

        ListNode dummyNode = new ListNode(-200);
        ListNode currNode = dummyNode;

        while(list1!=null || list2!=null)
        {
            int l1 = list1!=null ? list1.val : 101;
            int l2 = list2!=null ? list2.val : 101;

            if(l1 <= l2)
            {
                currNode.next = new ListNode(l1);
                currNode = currNode.next;
                list1 = list1.next;
            }
            else
            {
                currNode.next = new ListNode(l2);
                currNode = currNode.next;
                list2 = list2.next;
            }
        }

        return dummyNode.next;

    }
}
