package com.shivaprasad.january.day18;

//Note: For Linked List problems, Just focus on method code because creating Linked List for every problem is a hectic task,
//and we don't need to worry about it.
//Problem Link: https://leetcode.com/problems/swap-nodes-in-pairs/
public class SwapNodesInPairs {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode swapPairs(ListNode head) {

        return pairsSwap(head);
    }

    public ListNode pairsSwap(ListNode head)
    {
        if(head == null || head.next == null)
            return head;

        ListNode first = head;
        ListNode second = head.next;

        ListNode tempList = pairsSwap(head.next.next);

        first.next = tempList;
        second.next = first;

        return second;

        //T.C: O(n)
        //S.C: O(1) but auxiliary space takes by recursion call stack will be O(n/2) nothing but O(n)
    }
}
