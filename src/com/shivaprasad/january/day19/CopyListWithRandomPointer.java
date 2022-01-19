package com.shivaprasad.january.day19;


import java.util.HashMap;

//Note: For Linked List problems, Just focus on method code because creating Linked List for every problem is a hectic task,
//and we don't need to worry about it.
//Problem Link: https://leetcode.com/problems/copy-list-with-random-pointer/
public class CopyListWithRandomPointer {

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {

        if(head==null)
            return null;

        Node dummyNode = new Node(-10001);
        Node r = dummyNode;

        HashMap<Node,Node> map = new HashMap<>();
        Node curr = head;

        while(curr != null){
            Node newNode = new Node(curr.val);

            map.put(curr,newNode);

            r.next = newNode;
            r = newNode;

            curr = curr.next;
        }

        r = dummyNode.next;
        curr = head;

        while(curr != null){

            if(curr.random != null){
                r.random = map.get(curr.random);
            }

            curr = curr.next;
            r = r.next;
        }

        return dummyNode.next;

        //T.C: O(n)
        //S.C: O(n)
    }

}
