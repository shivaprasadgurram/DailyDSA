package com.shivaprasad.january.day20;

//Note: For Linked List problems, Just focus on method code because creating Linked List for every problem is a hectic task,
//and we don't need to worry about it.
//Problem Link: https://leetcode.com/problems/reverse-nodes-in-k-group/
public class ReverseNodesInKGroup {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        return reverseNodesInKGroups(head,k);
    }

    public ListNode reverseNodesInKGroups(ListNode head, int k)
    {
        if(head == null)
            return null;

        ListNode curr = head;
        int currLen = 1;

        while(curr.next!=null && currLen<k)
        {
            curr = curr.next;
            currLen++;
        }

        if(currLen < k)
            return head;

        ListNode tempNode = curr.next;
        curr.next = null;

        ListNode prev = null;
        curr = head;

        while(curr!=null)
        {
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }

        ListNode tempList = reverseNodesInKGroups(tempNode,k);

        head.next = tempList;

        return prev;

        //T.C: O(n)
        //S.C: O(1) but auxiliary space takes by recursion call stack will be O(n/k) nothing but O(n)
    }
}
