package com.shivaprasad.january.day8;

//Note: For Linked List problems, Just focus on method code because creating Linked List for every problem is a hectic task,
//and we don't need to worry about it.
//Problem: https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
public class ConvertBinaryNumberInALinkedListToInteger {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public int getDecimalValue(ListNode head) {

          String val ="";
          while(head!=null)
          {
              val +=head.val;
              head = head.next;
          }
          return Integer.parseInt(val,2);
    }
}
