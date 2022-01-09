package com.shivaprasad.january.day9;

//Note: For Linked List problems, Just focus on method code because creating Linked List for every problem is a hectic task,
//and we don't need to worry about it.
//Problem Link: https://leetcode.com/problems/add-two-numbers/submissions/
public class AddTwoNumbers {

       public class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyNode = new ListNode(-1);
        ListNode curr = dummyNode;

        if(l1 == null)
            return l2;

        if(l2 == null)
            return l1;

        int carry = 0;
        while(l1 !=null || l2 !=null)
        {
            int first = l1 == null ? 0 : l1.val;
            int second = l2 == null ? 0 : l2.val;
            int sum = first + second + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;

        }
        if(carry > 0)
        {
            curr.next = new ListNode(carry);
        }
        return dummyNode.next;

        //T.C: O(max(n,m))
        //S.C: O(max(n,m))
    }
}
