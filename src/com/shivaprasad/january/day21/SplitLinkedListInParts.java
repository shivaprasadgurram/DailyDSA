package com.shivaprasad.january.day21;

//Note: For Linked List problems, Just focus on method code because creating Linked List for every problem is a hectic task,
//and we don't need to worry about it.
//Problem Link: https://leetcode.com/problems/split-linked-list-in-parts/
public class SplitLinkedListInParts {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode[] splitListToParts(ListNode head, int k) {

        ListNode[] res = new ListNode[k];
        int totalLength = 0;
        ListNode curr = head;

        while(curr!=null)
        {
            totalLength++;
            curr = curr.next;
        }

        int len = totalLength/k;
        int leftOver = totalLength%k;
        ListNode node = head;
        ListNode prev = null;
        int i=0;

        while(node!=null && i<k)
        {
            res[i] = node;
            for(int j=0;j<len+(leftOver>0?1:0);j++)
            {
                prev = node;
                node = node.next;
            }
            prev.next = null;
            leftOver--;
            i++;
        }
        return res;
        //T.C: O(n)
        //S.C: O(n)
    }
}
