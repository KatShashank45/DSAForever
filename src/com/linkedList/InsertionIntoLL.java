package com.linkedList;

public class InsertionIntoLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(3);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(6);
        head.next.next.next.next = new ListNode(7);

        // so I want it like 1,2,3,4,5,6,7,8
        // So I have to add 1 at the head , then add 5 before 6 and at the tail have to add 8
        head = addAtHead(head , 1);
        head = addBeforeElement(head, 5, 6);
        head = addAtTail(head , 8);



        PrintingLinkedList.printList(head);

    }

    public static ListNode addAtHead (ListNode head , int val){
        ListNode node = new ListNode(val);
        node.next = head;
        return node;
    }

    public static ListNode addBeforeElement (ListNode head , int val , int beforeWhich){
        if(head == null)return null;
        ListNode toAdd = new ListNode(val);
        if (head.val == beforeWhich) {
            toAdd.next = head;
            return toAdd;
        }

        ListNode mover = head;
        while(mover.next!= null && mover.next.val != beforeWhich){
            mover = mover.next;
        }

        if(mover.next == null)return head;
        ListNode next = mover.next;
        mover.next = toAdd;
        toAdd.next = next;

        return head;

    }

    public static ListNode addAtTail (ListNode head , int val){
        ListNode toAdd = new ListNode(val);
        if(head == null)return toAdd;
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = toAdd;
        return head;
    }
}
