package com.shivaprasad.january.day12;

//Note: For Linked List problems, Just focus on method code because creating Linked List for every problem is a hectic task,
//and we don't need to worry about it.
//Problem Link: https://leetcode.com/problems/intersection-of-two-linked-lists/
public class IntersectionOfTwoLinkedLists {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode tempA = headA;
        ListNode tempB = headB;

        while(tempA != tempB)
        {
            tempA = tempA!=null ? tempA.next : headB;
            tempB = tempB!=null ? tempB.next : headA;
        }

        return tempA;

        //T.C: O(M+N)
        //S.C: O(1)
    }
}
