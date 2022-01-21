package com.shivaprasad.january.day21;

//Note: For Linked List problems, Just focus on method code because creating Linked List for every problem is a hectic task,
//and we don't need to worry about it.
//Problem Link: https://leetcode.com/problems/merge-in-between-linked-lists/
public class MergeInBetweenLinkedLists {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode athNode = list1;
        ListNode bthNode = list1;

        for(int i=1;i<a;i++)
        {
            athNode = athNode.next;
        }

        for(int j=1;j<=b;j++)
        {
            bthNode = bthNode.next;
        }

        ListNode tmp = bthNode.next;
        athNode.next = list2;
        ListNode temp2 = list2;

        while(temp2.next!=null)
        {
            temp2 = temp2.next;
        }

        temp2.next = tmp;
        return list1;

        //T.C: O(n)
        //S.C:O(1)
    }
}
