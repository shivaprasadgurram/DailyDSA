package com.shivaprasad.february.day32;

//Note: For Linked List problems, Just focus on method code because creating Linked List for every problem is a hectic task,
//and we don't need to worry about it.
//Problem Link: https://leetcode.com/problems/remove-linked-list-elements/
public class RemoveLinkedListElements {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }


        public ListNode removeElements(ListNode head, int val) {

            ListNode dummyNode = new ListNode(-1, head);
            remove(dummyNode, val);
            return dummyNode.next;
        }

        void remove(ListNode dummyNode, int val) {
            if (dummyNode == null || dummyNode.next == null)
                return;
            if (dummyNode.next.val == val)
                dummyNode.next = dummyNode.next.next;
            else
                dummyNode = dummyNode.next;
            remove(dummyNode, val);
        }
    }
}
