package com.linkedList;

public class DeletionFromLL {

    public static void main(String[] args) {
        ListNode head = new ListNode(12);
        head.next = new ListNode(1);
        head.next.next = new ListNode(20);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next.next.next.next = new ListNode(19);

        // So here I want to delete the first node , then the node with value 20 , then the node before 6 and the want to delete the tail

        head = deleteHead(head);

        head = deleteWithSpecificValue(head, 20);

        head = deleteTail(head);

        head = deleteBeforeThis(head , 6);

        PrintingLinkedList.printList(head);


    }

    public static ListNode deleteHead(ListNode head){
        if(head == null || head.next == null)return null;

        return head.next;
    }

    public static ListNode deleteWithSpecificValue(ListNode head , int val){

        if (head == null) return null;
        if (head.val == val) {
            return head.next;
        }

        ListNode mover = head;
        while(mover.next != null && mover.next.val != val){
            mover = mover.next;
        }

        if(mover.next == null)return head;

        mover.next = mover.next.next;
        return head;

    }

    public static ListNode deleteBeforeThis(ListNode head , int beforeThis){
        if(head == null || head.next == null || head.next.val == beforeThis) return head;

        if (head.val == beforeThis) {
            return head;
        }

        ListNode prev = head;
        ListNode curr = head.next;
        while (curr.next != null && curr.next.val != beforeThis) {
            prev = curr;
            curr = curr.next;
        }

        if (curr.next == null) return head;

        prev.next = curr.next;
        return head;
    }
    public static ListNode deleteTail(ListNode head){
        if(head == null || head.next == null){
            return null;
        }


        ListNode mover = head;

        while( mover.next.next != null){
            mover = mover.next;
        }
        mover.next = null;

        return head;

    }



}
